package uz.najottalim.homeworkforspring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDto {

    private Integer id;
    private String body;
    private UserDto author;
    private ArticlesDto article;

}
