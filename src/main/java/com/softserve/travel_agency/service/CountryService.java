package com.softserve.travel_agency.service;

import com.softserve.travel_agency.model.Country;
import com.softserve.travel_agency.model.Hotel;

import java.util.List;

public interface CountryService {

    List<Hotel> getAllHotelsInCountry(Country country);

}
