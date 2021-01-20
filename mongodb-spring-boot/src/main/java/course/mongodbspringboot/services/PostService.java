package course.mongodbspringboot.services;

import course.mongodbspringboot.domain.Post;
import course.mongodbspringboot.repositories.PostRepository;
import course.mongodbspringboot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text){
//        return repository.findByTitleContainingIgnoreCase(text);
        return repository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        //Makes sure the max date gets the whole day (all 24 hours), not hour zero
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);

        return repository.fullSearch(text, minDate, maxDate);
    }
}
