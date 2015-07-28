package com.tuzhihao.datajpa.service;

/**
 * Created by Methol on 2015-07-28.
 */
import com.tuzhihao.datajpa.domain.Hotel;
import com.tuzhihao.datajpa.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;


interface ReviewRepository extends Repository<Review, Long> {

	Page<Review> findByHotel(Hotel hotel, Pageable pageable);

	Review findByHotelAndIndex(Hotel hotel, int index);

	Review save(Review review);

}