package com.softserve.travel_agency.repositories;

import com.softserve.travel_agency.model.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel, Long> {
}
