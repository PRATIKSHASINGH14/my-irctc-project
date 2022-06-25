package com.Project.irctc.service;

import com.Project.irctc.dto.TrainListDto;
import com.Project.irctc.model.Tickets;
import com.Project.irctc.model.BookedTickets;
import com.Project.irctc.repository.TicketRepository;
import com.Project.irctc.repository.BookedTicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private BookedTicketsRepository bookedTicketsRepository;

    public void createTicket(TrainListDto trainDto) {
        BookedTickets bookedTicket = new BookedTickets();
        bookedTicket.setNumberOfTickets(trainDto.getNumberOfTickets());
        bookedTicket.setEmail(trainDto.getEmail());
        bookedTicket.setPrice(trainDto.getPrice());
        bookedTicket.setTrainName(trainDto.getTrainName());
        bookedTicketsRepository.save(bookedTicket);
    }

    public List<BookedTickets> findAll() {
        return bookedTicketsRepository.findAll();
    }
}
