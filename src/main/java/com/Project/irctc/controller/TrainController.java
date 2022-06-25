package com.Project.irctc.controller;

import com.Project.irctc.dto.SearchRequest;
import com.Project.irctc.model.Train;
import com.Project.irctc.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @PostMapping("/add")
    public ResponseEntity addTrain(@RequestBody Train train) {
        trainService.addTrain(train);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/search")
    public  ResponseEntity<List<Train>> searchTrain(@RequestBody SearchRequest searchRequest) {
        return new ResponseEntity( trainService.searchTrain(searchRequest),HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Train>> getAllTrains() {
        return new ResponseEntity<>(trainService.getAllTrains(),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable Long id) {
        return new ResponseEntity<>(trainService.getTrainById(id),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Train train) {
        trainService.update(train);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        trainService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
