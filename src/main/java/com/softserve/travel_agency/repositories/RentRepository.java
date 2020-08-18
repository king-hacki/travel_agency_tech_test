package com.softserve.travel_agency.repositories;

import com.softserve.travel_agency.model.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent, Long> {
}
