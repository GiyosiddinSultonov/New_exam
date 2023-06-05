package uz.najottalim.homeworkforspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.homeworkforspring.models.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
