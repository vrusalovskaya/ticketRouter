package com.finalproject.cityrouter.persistence.repositories;

import com.finalproject.cityrouter.persistence.entities.TicketEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface TicketRepository extends ListCrudRepository<TicketEntity, Integer> {
}