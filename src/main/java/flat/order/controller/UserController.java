package flat.order.controller;

import flat.order.controller.interfaces.MainController;
import flat.order.model.User;
import flat.order.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController implements MainController<User> {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    @Override
    public ResponseEntity<List<User>> getAll() {
        List<User> users = new ArrayList<>(userRepository.findAll());
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/id")
    @Override
    public ResponseEntity<User> getObjectById(long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(user.get(), HttpStatus.OK);
    }

    @PostMapping("/add")
    @Override
    public ResponseEntity<User> createNeObject(User obj) {
        return null;
    }

    @PutMapping("/id")
    @Override
    public ResponseEntity<User> updateObject(long id, User obj) {
        return null;
    }

    @DeleteMapping("/id")
    @Override
    public ResponseEntity<HttpStatus> deleteObject(long id) {
        return null;
    }

    @DeleteMapping("/all")
    @Override
    public ResponseEntity<HttpStatus> deleteAllObjects() {
        return null;
    }
}
