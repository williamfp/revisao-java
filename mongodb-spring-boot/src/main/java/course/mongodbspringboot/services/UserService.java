package course.mongodbspringboot.services;

import course.mongodbspringboot.domain.User;
import course.mongodbspringboot.dto.UserDTO;
import course.mongodbspringboot.repositories.UserRepository;
import course.mongodbspringboot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj){
        return repository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}