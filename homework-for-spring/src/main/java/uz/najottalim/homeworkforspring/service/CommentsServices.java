package uz.najottalim.homeworkforspring.service;

import org.springframework.http.ResponseEntity;
import uz.najottalim.homeworkforspring.dto.CommentsDto;
import uz.najottalim.homeworkforspring.dto.dtoFor.CommentsDtoForUpdate;

import java.util.List;

public interface CommentsServices {

    ResponseEntity<CommentsDto> addComment(CommentsDto commentsDto);
    List<CommentsDto> findAll();
    ResponseEntity<List<CommentsDto>> getCommentsByArticleId(Integer article_id);
    void deleteId(Integer id);
    CommentsDto updateComment(CommentsDtoForUpdate commentsDtoForUpdate);
}
