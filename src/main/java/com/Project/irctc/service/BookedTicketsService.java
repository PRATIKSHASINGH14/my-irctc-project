package com.Project.irctc.service;

import com.Project.irctc.repository.BookedTicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookedTicketsService {
    @Autowired
    private BookedTicketsRepository bookedTicketsRepository;
}
