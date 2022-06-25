package com.Project.irctc.repository;

import com.Project.irctc.model.BookedTickets;
import com.Project.irctc.model.BookedTickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookedTicketsRepository extends JpaRepository<BookedTickets,Long> {
}
