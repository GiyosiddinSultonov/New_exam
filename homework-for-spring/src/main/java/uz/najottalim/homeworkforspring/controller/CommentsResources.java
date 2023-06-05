package uz.najottalim.homeworkforspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.homeworkforspring.dto.CommentsDto;
import uz.najottalim.homeworkforspring.dto.dtoFor.CommentsDtoForUpdate;
import uz.najottalim.homeworkforspring.service.CommentsServices;

import java.util.Map;

@RestController
@RequestMapping("comment")
public class CommentsResources {

    @Autowired
    private CommentsServices commentsServices;

    @PostMapping
    public ResponseEntity<?> addComment(@RequestBody CommentsDto commentsDto){
        return commentsServices.addComment(commentsDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCommentByArticleId(@PathVariable Integer id){
        return commentsServices.getCommentsByArticleId(id);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(commentsServices.findAll());
    }
    @PutMapping
    public ResponseEntity<?> updateComment(@RequestBody CommentsDtoForUpdate commentsDtoForUpdate){
        return ResponseEntity.ok(commentsServices.updateComment(commentsDtoForUpdate));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map> deleteComment(@PathVariable Integer id){
        commentsServices.deleteId(id);
        return ResponseEntity.ok(Map.of("deleted",true));
    }
}
