package uz.najottalim.homeworkforspring.repository.extension;

import uz.najottalim.homeworkforspring.dto.ArticlesDto;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ArticleExtensionService {
    List<ArticlesDto> findByS(Optional<String> title, Optional<List<String>> body, Optional<List<Long>> userId, Optional<Date> minPublishDate, Optional<Date> maxPublishDate);

}
