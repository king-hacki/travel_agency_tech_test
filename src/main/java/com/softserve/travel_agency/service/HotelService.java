package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Country;
import com.softserve.travel_agency.model.Hotel;
import com.softserve.travel_agency.model.Room;

import java.time.Period;
import java.util.List;

public interface HotelService {

    Hotel createOrUpdateHotel(Hotel hotel);

    List<Hotel> getAllHotelsInCountry(Country country);

}
