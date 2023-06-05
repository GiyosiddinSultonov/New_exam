package uz.najottalim.homeworkforspring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.najottalim.homeworkforspring.dto.CommentsDto;
import uz.najottalim.homeworkforspring.dto.dtoFor.CommentsDtoForUpdate;
import uz.najottalim.homeworkforspring.repository.CommentsRepository;
import uz.najottalim.homeworkforspring.service.CommentsServices;
import uz.najottalim.homeworkforspring.service.mapper.CommentMapper;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsServices {

    @Autowired
    private CommentsRepository commentsRepository;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public ResponseEntity<CommentsDto> addComment(CommentsDto commentsDto) {
        return null;
    }

    @Override
    public List<CommentsDto> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<List<CommentsDto>> getCommentsByArticleId(Integer article_id) {
        return null;
    }

    @Override
    public void deleteId(Integer id) {

    }

    @Override
    public CommentsDto updateComment(CommentsDtoForUpdate commentsDtoForUpdate) {
        return null;
    }
}
