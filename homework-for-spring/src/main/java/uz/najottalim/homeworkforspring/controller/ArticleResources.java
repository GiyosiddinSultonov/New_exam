package uz.najottalim.homeworkforspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.homeworkforspring.dto.ArticlesDto;
import uz.najottalim.homeworkforspring.dto.CommentsDto;
import uz.najottalim.homeworkforspring.service.ArticleServices;
import uz.najottalim.homeworkforspring.service.CommentsServices;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
    @RequestMapping("articles")
public class ArticleResources {

    @Autowired
    private ArticleServices articleServices;

    @Autowired
    private CommentsServices commentsServices;

    @PostMapping
    public ResponseEntity<ArticlesDto> addArticle(@RequestBody ArticlesDto articlesDto) {
        return articleServices.addArticle(articlesDto);
    }

    @PatchMapping
    public ResponseEntity<ArticlesDto> editArticle(@RequestBody ArticlesDto articlesDto){
        return articleServices.editArticle(articlesDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteArticleById(@PathVariable Integer id) {
        return articleServices.deleteArticleById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArticleById(@PathVariable Integer id) {
        return articleServices.getArticleById(id);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllArticles() {
        return articleServices.getAllArticles();
    }

    @PostMapping("/comment")
    public ResponseEntity<CommentsDto> addComment(@PathVariable Integer article_id, @RequestBody CommentsDto commentsDto){
        return commentsServices.addComment(commentsDto);
    }

    @GetMapping("/{article_id}")
    public ResponseEntity<?> getCommentByArticleId(@PathVariable Integer id){
        return commentsServices.getCommentsByArticleId(id);
    }
    @GetMapping("/most-commented")
    public ResponseEntity<List<ArticlesDto>> getArticlesMostCommented(@RequestParam Optional<String> checkData){
       return articleServices.getArticlesMostCommented(checkData);
    }
    @GetMapping
    public ResponseEntity<List<ArticlesDto>> getArticDtoWithPage(@RequestParam Optional<String> sort,
                                                                 @RequestParam Optional<Integer> size,
                                                                 @RequestParam Optional<Integer> pNum){
        return articleServices.getArticleDtoWithPage(sort, size, pNum);
    }
    @GetMapping("/search")
    public ResponseEntity<List<ArticlesDto>> getArticlesSort(@RequestParam Optional<String> title,
                                                             @RequestParam Optional<List<String>> body,
                                                             @RequestParam Optional<List<Long>> userId,
                                                             @RequestParam Optional<String> minPublishDate,
                                                             @RequestParam Optional<String> maxPublishDate){
        return articleServices.getArticleWithSearch(title,body,userId,minPublishDate,maxPublishDate);
    }
}
