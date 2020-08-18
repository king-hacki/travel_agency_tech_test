package com.softserve.travel_agency.service.impl;

import com.softserve.travel_agency.model.Country;
import com.softserve.travel_agency.model.Hotel;
import com.softserve.travel_agency.repositories.CountryRepository;
import com.softserve.travel_agency.repositories.HotelRepository;
import com.softserve.travel_agency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;
    private CountryRepository countryRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel createOrUpdateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotelsByCountry(Country country) {
        Country countryEntity = countryRepository.findById(country.getId())
                .orElseThrow(IllegalArgumentException::new);    //  Custom exception
        return hotelRepository.findAllByCountry(countryEntity);
    }
}
