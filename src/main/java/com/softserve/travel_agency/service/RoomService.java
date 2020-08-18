package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Hotel;
import com.softserve.travel_agency.model.Room;

public interface RoomService {

    Room addRoomToHotel(Room room, Hotel hotel);

}
