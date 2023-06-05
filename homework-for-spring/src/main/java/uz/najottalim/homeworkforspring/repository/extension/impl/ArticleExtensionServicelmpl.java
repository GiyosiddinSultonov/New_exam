package uz.najottalim.homeworkforspring.repository.extension.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import uz.najottalim.homeworkforspring.dto.ArticlesDto;
import uz.najottalim.homeworkforspring.models.Article;
import uz.najottalim.homeworkforspring.repository.extension.ArticleExtensionService;
import uz.najottalim.homeworkforspring.service.mapper.ArticleMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Component
@RequiredArgsConstructor
public class ArticleExtensionServicelmpl implements ArticleExtensionService {
    private final EntityManager entityManager;
    private final ArticleMapper articleMapper;

    @Override
    public List<ArticlesDto> findByS(Optional<String> title, Optional<List<String>> body, Optional<List<Long>> userId, Optional<Date> minPublishDate, Optional<Date> maxPublishDate) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Article> query = criteriaBuilder.createQuery(Article.class);
        Root<Article> queryRoot = query.from(Article.class);
        List<Predicate> predicates = new ArrayList<>();

        title.ifPresent(a -> predicates.add(criteriaBuilder.like(queryRoot.get("title"), "%" + a + "%")));

        body.ifPresent(name -> {
                    List<Predicate> namePredicates = new ArrayList<>();

                    name.forEach(b -> {
                        namePredicates.add(criteriaBuilder.like(queryRoot.get("body"), "%" + b + "%"));
                    });
                    Predicate[] predicatesN = new Predicate[namePredicates.size()];
                    for (int i = 0; i < predicatesN.length; i++) {
                        predicatesN[i] = namePredicates.get(i);
                    }

                    predicates.add(criteriaBuilder.or(predicatesN));
                }
        );
        userId.ifPresent(userid -> {
                    List<Predicate> namePredicates = new ArrayList<>();

                    userid.forEach(n -> {
                        namePredicates.add(criteriaBuilder.equal(queryRoot.get("user_id"),n));

                    });
                    Predicate[] predicatesN = new Predicate[namePredicates.size()];
                    for (int i = 0; i < predicatesN.length; i++) {
                        predicatesN[i] = namePredicates.get(i);
                    }

                    predicates.add(criteriaBuilder.or(predicatesN));
                }
        );

        Predicate[] predicatesArray = new Predicate[predicates.size()];
        for (int i = 0; i < predicates.size(); i++) {
            predicatesArray[i] = predicates.get(i);
        }
        query.select(queryRoot).where(criteriaBuilder.and(predicatesArray));
        return entityManager.createQuery(query).getResultList().stream().map(articleMapper::toDto).toList();
    }
    }

