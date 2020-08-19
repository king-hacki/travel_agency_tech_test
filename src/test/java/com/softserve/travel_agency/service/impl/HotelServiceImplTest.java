package com.softserve.travel_agency.service.impl;

import com.softserve.travel_agency.model.Country;
import com.softserve.travel_agency.model.Hotel;
import com.softserve.travel_agency.repositories.CountryRepository;
import com.softserve.travel_agency.repositories.HotelRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class HotelServiceImplTest {

    @InjectMocks
    private HotelServiceImpl hotelService;

    @Mock
    private HotelRepository hotelRepository;

    @Mock
    private CountryRepository countryRepository;

    Hotel hotel = new Hotel(1L, "Hotel", new Country(), emptySet());
    Country country = new Country(1L, "Country", Set.of(hotel));

    @Test
    void createOrUpdateHotelTest() {
        Hotel expected = new Hotel(1L, "Hotel", new Country(), emptySet());
        when(hotelRepository.save(hotel)).thenReturn(hotel);
        assertEquals(expected, hotelService.createOrUpdateHotel(expected));
    }

    @Test
    void getAllHotelsByCountryTest() {
        Hotel hotel = new Hotel(1L, "Hotel", new Country(), emptySet());
        Set<Hotel> expected = Set.of(hotel);
        when(countryRepository.findById(country.getId())).thenReturn(Optional.of(country));
        when(hotelRepository.findAllByCountry(country)).thenReturn(new ArrayList<>(country.getHotels()));
        assertEquals(expected, new LinkedHashSet<>(hotelService.getAllHotelsByCountry(country)));
    }

}