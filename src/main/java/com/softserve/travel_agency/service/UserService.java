package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Rent;
import com.softserve.travel_agency.model.Room;
import com.softserve.travel_agency.model.User;

import java.time.Period;
import java.util.List;

public interface UserService {

    Rent bookAvailableRoomOnPeriod(User user, Room availableRoom, Period rentPeriod);

    List<User> getAllUsers();

}
