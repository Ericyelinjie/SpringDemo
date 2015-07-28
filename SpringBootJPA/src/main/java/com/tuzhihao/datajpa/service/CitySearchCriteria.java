package com.tuzhihao.datajpa.service;

/**
 * Created by Methol on 2015-07-28.
 */

import org.springframework.util.Assert;

import java.io.Serializable;

public class CitySearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public CitySearchCriteria() {
    }

    public CitySearchCriteria(String name) {
        Assert.notNull(name, "Name must not be null");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
