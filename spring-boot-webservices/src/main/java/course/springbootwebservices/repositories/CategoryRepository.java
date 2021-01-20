package course.springbootwebservices.repositories;

import course.springbootwebservices.entities.Category;
import course.springbootwebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
