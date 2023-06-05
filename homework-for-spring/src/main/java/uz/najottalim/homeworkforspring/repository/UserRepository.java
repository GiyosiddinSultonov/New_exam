package uz.najottalim.homeworkforspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.homeworkforspring.models.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findFirstById(Integer id);
    Optional<User> findFirstByUsername(String username);

}
