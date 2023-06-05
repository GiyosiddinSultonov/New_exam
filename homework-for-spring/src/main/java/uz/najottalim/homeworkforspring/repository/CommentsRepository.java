package uz.najottalim.homeworkforspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.homeworkforspring.models.Comments;

import java.util.List;


@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

    List<Comments> findAllByArticle_Id(Integer id);
}
