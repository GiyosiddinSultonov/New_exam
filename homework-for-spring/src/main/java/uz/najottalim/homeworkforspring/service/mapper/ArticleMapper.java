package uz.najottalim.homeworkforspring.service.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.najottalim.homeworkforspring.dto.ArticlesDto;
import uz.najottalim.homeworkforspring.models.Article;


@Component
public class ArticleMapper {
    public Article toEntity(ArticlesDto articlesDto) {
        return null;
    }

    public ArticlesDto toDto(Article article) {
        return new ArticlesDto(article.getId(), article.getTitle(), article.getBody(), article.getUser().getId(), article.getPublishDate(), article.getUpdatedAt());
    }

}
