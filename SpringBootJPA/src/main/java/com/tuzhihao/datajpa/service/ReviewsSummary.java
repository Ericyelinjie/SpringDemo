package com.tuzhihao.datajpa.service;

import com.tuzhihao.datajpa.domain.Rating;

/**
 * Created by Methol on 2015-07-28.
 */


public interface ReviewsSummary {

    long getNumberOfReviewsWithRating(Rating rating);

}
