package uz.najottalim.homeworkforspring.service.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.najottalim.homeworkforspring.dto.CommentsDto;
import uz.najottalim.homeworkforspring.models.Comments;

@Component
public class CommentMapper {

    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected ArticleMapper articleMapper;

    public Comments toEntity(CommentsDto commentsDto) {
        return null;
    }
}
