package com.Project.irctc.controller;

import com.Project.irctc.dto.BookedTicketsDto;
import com.Project.irctc.dto.TrainListDto;
import com.Project.irctc.model.BookedTickets;
import com.Project.irctc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(
        origins = {"http://localhost:4200/"},
        methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}
)
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping("/book")
    public ResponseEntity createOrder(@RequestBody TrainListDto cartItems) {
        ticketService.createTicket(cartItems);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookedTickets>> getAllOrders(@RequestBody String username) {
        return new ResponseEntity<>(ticketService.findAll(), HttpStatus.OK);
    }
}
