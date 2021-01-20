package course.mongodbspringboot.repositories;

import course.mongodbspringboot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
