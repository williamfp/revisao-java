package course.mongodbspringboot.services;

import course.mongodbspringboot.domain.Post;
import course.mongodbspringboot.repositories.PostRepository;
import course.mongodbspringboot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}