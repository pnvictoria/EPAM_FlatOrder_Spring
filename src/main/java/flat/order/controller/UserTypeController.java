package flat.order.controller;

import flat.order.controller.interfaces.MainController;
import flat.order.model.UserType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class UserTypeController implements MainController<UserType> {
    @GetMapping("/all")
    @Override
    public ResponseEntity<List<UserType>> getAll() {
        return null;
    }

    @GetMapping("/id")
    @Override
    public ResponseEntity<UserType> getObjectById(long id) {
        return null;
    }

    @PostMapping("/add")
    @Override
    public ResponseEntity<UserType> createNeObject(UserType obj) {
        return null;
    }

    @PutMapping("/id")
    @Override
    public ResponseEntity<UserType> updateObject(long id, UserType obj) {
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
