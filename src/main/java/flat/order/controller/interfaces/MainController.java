package flat.order.controller.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MainController<T> {
    ResponseEntity<List<T>> getAll();

    ResponseEntity<T> getObjectById(@PathVariable("id") long id);

    ResponseEntity<T> createNeObject(@RequestBody T obj);

    ResponseEntity<T> updateObject(@PathVariable("id") long id, @RequestBody T obj);

    ResponseEntity<HttpStatus> deleteObject(@PathVariable("id") long id);

    ResponseEntity<HttpStatus> deleteAllObjects();
}
