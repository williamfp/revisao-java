package course.mongodbspringboot.services;

import course.mongodbspringboot.domain.User;
import course.mongodbspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
