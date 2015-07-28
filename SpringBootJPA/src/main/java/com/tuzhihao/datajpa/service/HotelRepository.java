package com.tuzhihao.datajpa.service;

/**
 * Created by Methol on 2015-07-28.
 */

import com.tuzhihao.datajpa.domain.City;
import com.tuzhihao.datajpa.domain.Hotel;
import com.tuzhihao.datajpa.domain.HotelSummary;
import com.tuzhihao.datajpa.domain.RatingCount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

interface HotelRepository extends Repository<Hotel, Long> {

    Hotel findByCityAndName(City city, String name);

    @Query("select new com.tuzhihao.datajpa.domain.HotelSummary(h.city, h.name, avg(r.rating)) "
            + "from Hotel h left outer join h.reviews r where h.city = ?1 group by h")
    Page<HotelSummary> findByCity(City city, Pageable pageable);

    @Query("select new com.tuzhihao.datajpa.domain.RatingCount(r.rating, count(r)) "
            + "from Review r where r.hotel = ?1 group by r.rating order by r.rating DESC")
    List<RatingCount> findRatingCounts(Hotel hotel);
}