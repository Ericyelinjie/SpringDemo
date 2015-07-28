package com.tuzhihao.datajpa.service;

/**
 * Created by Methol on 2015-07-28.
 */

import com.tuzhihao.datajpa.domain.City;
import com.tuzhihao.datajpa.domain.Hotel;
import com.tuzhihao.datajpa.domain.Review;
import com.tuzhihao.datajpa.domain.ReviewDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HotelService {

    Hotel getHotel(City city, String name);

    Page<Review> getReviews(Hotel hotel, Pageable pageable);

    Review getReview(Hotel hotel, int index);

    Review addReview(Hotel hotel, ReviewDetails details);

    ReviewsSummary getReviewSummary(Hotel hotel);

}