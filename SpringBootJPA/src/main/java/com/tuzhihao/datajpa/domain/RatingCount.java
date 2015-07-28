package com.tuzhihao.datajpa.domain;

/**
 * Created by Methol on 2015-07-28.
 */

import java.io.Serializable;

public class RatingCount implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Rating rating;

    private final long count;

    public RatingCount(Rating rating, long count) {
        this.rating = rating;
        this.count = count;
    }

    public Rating getRating() {
        return this.rating;
    }

    public long getCount() {
        return this.count;
    }
}