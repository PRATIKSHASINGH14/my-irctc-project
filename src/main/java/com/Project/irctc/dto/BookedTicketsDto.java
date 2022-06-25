package com.Project.irctc.dto;

import com.Project.irctc.model.BookedTickets;

public class BookedTicketsDto {
    private Long Id;
    private String trainName;
    private Integer numberOfSeats;
    private Long price;

    public BookedTicketsDto(BookedTickets bookedTickets) {
        this.Id = bookedTickets.getId();
        this.trainName = bookedTickets.getTrainName();
        this.numberOfSeats = bookedTickets.getNumberOfTickets();
        this.price = bookedTickets.getPrice();
    }
}
