package uz.najottalim.homeworkforspring.dto.error;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class ErrorDtoMap {
    private Map<String, List<String>> errors;
}
