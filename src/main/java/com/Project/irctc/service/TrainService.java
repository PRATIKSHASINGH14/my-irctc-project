package com.Project.irctc.service;

import com.Project.irctc.dto.SearchRequest;
import com.Project.irctc.model.Train;
import com.Project.irctc.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    private AuthService authService;

    public void addTrain(Train train) {
        trainRepository.save(train);
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train getTrainById(Long id) {
        return trainRepository.findById(id).get();
    }

    public void update(Train train) {
        trainRepository.save(train);
    }

    public void delete(Long id) {
        trainRepository.deleteById(id);
    }

    public List<Train> searchTrain(SearchRequest searchRequest) {
        System.out.println(searchRequest.toString());
       List<Train> list =  trainRepository.findAll().stream().filter(t -> t.getBoardingPoint().equalsIgnoreCase(searchRequest.getBoardingPoint()) &&
                t.getDestinationPoint().equalsIgnoreCase(searchRequest.getDestination())).toList();
        System.out.println(list.size());
        return list;
    }
}