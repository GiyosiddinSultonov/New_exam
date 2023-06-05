package uz.najottalim.homeworkforspring.service;
import org.springframework.http.ResponseEntity;
import uz.najottalim.homeworkforspring.dto.UserDto;
import uz.najottalim.homeworkforspring.dto.dtoFor.ArticleDtoForUser;

import java.util.List;
import java.util.Optional;

public interface UserService {

    ResponseEntity<String> addUser(UserDto userDto);
    void deleteUser(Integer id);

    ResponseEntity<UserDto> getUser(Integer id);

    ResponseEntity<UserDto> updateUser(UserDto userDto);
    List<ArticleDtoForUser> findArticlesByUserId(Long id, Optional<String> sort, Optional<Integer> size, Optional<Integer> pNum);

}

