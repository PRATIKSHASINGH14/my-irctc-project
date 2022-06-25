package com.Project.irctc.model;

import com.Project.irctc.dto.TrainListDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BookedTickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String trainName;
    private Integer numberOfTickets;
    private Long price;

    public BookedTickets(TrainListDto cartDto) {
        this.email = cartDto.getEmail();
        this.trainName = cartDto.getTrainName();
        this.numberOfTickets = cartDto.getNumberOfTickets();
        this.price = cartDto.getPrice();
    }
}
