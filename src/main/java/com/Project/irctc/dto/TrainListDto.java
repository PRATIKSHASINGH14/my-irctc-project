package com.Project.irctc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainListDto {
    private Long id;
    private String email;
    private String trainName;
    private Integer numberOfTickets;
    private Long trainNumber;
    private Long price;
}