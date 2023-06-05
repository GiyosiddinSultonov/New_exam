package uz.najottalim.homeworkforspring.service;

import org.springframework.http.ResponseEntity;
import uz.najottalim.homeworkforspring.dto.ArticlesDto;

import java.util.List;
import java.util.Optional;

public interface ArticleServices {

    ResponseEntity<ArticlesDto> addArticle(ArticlesDto articlesDto);
    ResponseEntity<?> deleteArticleById(Integer id);
    ResponseEntity<?> getArticleById(Integer id);
    ResponseEntity<?> getAllArticles();
    ResponseEntity<ArticlesDto> editArticle(ArticlesDto articlesDto);
    ResponseEntity<List<ArticlesDto>> getArticleDtoWithPage(Optional<String> sort, Optional<Integer> size, Optional<Integer> pNum);
    ResponseEntity<List<ArticlesDto>> getArticlesMostCommented(Optional<String> checkDate);
    ResponseEntity<List<ArticlesDto>> getArticleWithSearch(Optional<String> title, Optional<List<String>> body, Optional<List<Long>> userId, Optional<String> minPublishDate, Optional<String> maxPublishDate);
}
