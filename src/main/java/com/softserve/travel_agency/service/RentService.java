package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Rent;
import com.softserve.travel_agency.model.Room;
import com.softserve.travel_agency.model.User;

import java.time.Period;

public interface RentService {

    Rent bookAvailableRoomOnPeriod(User user, Room availableRoom, Period rentPeriod);


}
