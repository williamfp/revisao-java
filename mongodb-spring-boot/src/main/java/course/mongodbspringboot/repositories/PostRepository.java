package course.mongodbspringboot.repositories;

import course.mongodbspringboot.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
