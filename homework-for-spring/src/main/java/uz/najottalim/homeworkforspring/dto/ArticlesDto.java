package uz.najottalim.homeworkforspring.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ArticlesDto {
    private Integer id;
    private String title;
    private String body;
    private Integer user_id;
    private LocalDateTime publishDate;
    private LocalDateTime updatedAt;
}
