package com.orm.demo.infraestructure.in;

import com.orm.demo.application.usecases.couch.GetAllCouchUsecase;
import com.orm.demo.application.usecases.couch.SaveCouchUsecase;
import com.orm.demo.domain.models.Couch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/couch")
public class CouchController {
    private final SaveCouchUsecase saveCouchUsecase;
    private final GetAllCouchUsecase getAllCouchUsecase;

    public CouchController(SaveCouchUsecase saveCouchUsecase, GetAllCouchUsecase getAllCouchUsecase) {
        this.saveCouchUsecase = saveCouchUsecase;
        this.getAllCouchUsecase = getAllCouchUsecase;
    }

    @GetMapping
    public ResponseEntity<List<Couch>> getAll() {
        List<Couch> couches;
        try {
            couches = getAllCouchUsecase.getAll();
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(couches);
    }

    @PostMapping
    public ResponseEntity<Couch> save(@RequestBody Couch couch) {
        try {
            couch = saveCouchUsecase.save(couch);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(couch);
    }

}
