package uz.najottalim.homeworkforspring.dto.error;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDto {
    private String errors;
}
