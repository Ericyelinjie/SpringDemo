package com.tuzhihao.datajpa.service;

/**
 * Created by Methol on 2015-07-28.
 */

import com.tuzhihao.datajpa.domain.City;
import com.tuzhihao.datajpa.domain.HotelSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService {

    Page<City> findCities(CitySearchCriteria criteria, Pageable pageable);

    City getCity(String name, String country);

    Page<HotelSummary> getHotels(City city, Pageable pageable);

}