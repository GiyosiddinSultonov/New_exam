package uz.najottalim.homeworkforspring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private Integer id;
    @NotNull(message = "username shouldn't be null")
    @NotEmpty(message = "username shouldn't be empty")
    private String username;
    @NotNull(message = "password shouldn't be null")
    @NotEmpty(message = "password shouldn't be empty")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Email(message = "email is incorrectly")
    @NotNull(message = "email shouldn't be null")
    @NotEmpty(message = "email shouldn't be empty")
    private String email;
    @Size(max = 70,message = "bio shouldn't be longer than 70 characters")
    private String bio;
//    private Image image;
}
