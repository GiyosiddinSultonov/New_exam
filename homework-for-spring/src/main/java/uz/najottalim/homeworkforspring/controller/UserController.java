package uz.najottalim.homeworkforspring.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.homeworkforspring.dto.ArticlesDto;
import uz.najottalim.homeworkforspring.dto.UserDto;
import uz.najottalim.homeworkforspring.dto.dtoFor.ArticleDtoForUser;
import uz.najottalim.homeworkforspring.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;




    @PostMapping()
    private ResponseEntity<String> addUser(@Valid @RequestBody UserDto userDto){

        return userService.addUser(userDto);
    }

    @GetMapping({"/{id}"}) ResponseEntity<UserDto> getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
    @PatchMapping ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map> deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResponseEntity.ok(Map.of("delete", true));
    }
    @GetMapping("/{id}/articles")
    public ResponseEntity<List<ArticleDtoForUser>> getByPagabelSort(@PathVariable Long id,
                                                                    @PathVariable Optional<String> sort,
                                                                    @PathVariable Optional<Integer> size,
                                                                    @PathVariable Optional<Integer> pNum){
        return ResponseEntity.ok(userService.findArticlesByUserId(id, sort, size, pNum));

    }
}
