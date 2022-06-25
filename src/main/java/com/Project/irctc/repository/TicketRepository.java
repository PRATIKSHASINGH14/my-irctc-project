package com.Project.irctc.repository;

import com.Project.irctc.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Train,Long> {
}