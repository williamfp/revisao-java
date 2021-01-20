package course.mongodbspringboot.resources;

import course.mongodbspringboot.domain.Post;
import course.mongodbspringboot.resources.util.URL;
import course.mongodbspringboot.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);

        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(
            @RequestParam(value = "text", defaultValue = "") String text){
        text = URL.decodeParam(text);
        List<Post> list = service.findByTitle(text);

        return ResponseEntity.ok().body(list);
    }
}
