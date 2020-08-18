package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Hotel;
import com.softserve.travel_agency.model.Room;

import java.time.Period;
import java.util.List;

public interface RoomService {

    Room addRoomToHotel(Room room, Hotel hotel);

    List<Room> findAllAvailableRoomsByPeriod(Hotel hotel, Period lookUpPeriod);

}
