package uz.najottalim.homeworkforspring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.najottalim.homeworkforspring.dto.UserDto;
import uz.najottalim.homeworkforspring.dto.dtoFor.ArticleDtoForUser;
import uz.najottalim.homeworkforspring.repository.UserRepository;
import uz.najottalim.homeworkforspring.service.UserService;
import uz.najottalim.homeworkforspring.service.mapper.UserMapper;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    public ResponseEntity<String> addUser(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }

    public ResponseEntity<UserDto> getUser(Integer id) {
        return null;
    }

    public ResponseEntity<UserDto> updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public List<ArticleDtoForUser> findArticlesByUserId(Long id, Optional<String> sort, Optional<Integer> size, Optional<Integer> pNum) {
        return null;
    }
}
