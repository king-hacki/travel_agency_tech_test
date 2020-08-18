package com.softserve.travel_agency.repositories;

import com.softserve.travel_agency.model.Country;
import com.softserve.travel_agency.model.Hotel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepository extends CrudRepository<Hotel, Long> {

    List<Hotel> findAllByCountry(Country country);

}
