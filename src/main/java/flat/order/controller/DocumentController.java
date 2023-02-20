package flat.order.controller;

import flat.order.controller.interfaces.MainController;
import flat.order.model.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class DocumentController implements MainController<Document> {
    @GetMapping("/all")
    @Override
    public ResponseEntity<List<Document>> getAll() {
        return null;
    }

    @GetMapping("/id")
    @Override
    public ResponseEntity<Document> getObjectById(long id) {
        return null;
    }

    @PostMapping("/add")
    @Override
    public ResponseEntity<Document> createNeObject(Document obj) {
        return null;
    }

    @PutMapping("/id")
    @Override
    public ResponseEntity<Document> updateObject(long id, Document obj) {
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
