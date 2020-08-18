package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Hotel;
import com.softserve.travel_agency.model.Room;

import java.time.Period;
import java.util.List;

public interface HotelService {

    List<Room> findAllAvailableRoomsByPeriod(Hotel hotel, Period lookUpPeriod);

    Hotel createOrUpdateHotel(Hotel hotel);

}
