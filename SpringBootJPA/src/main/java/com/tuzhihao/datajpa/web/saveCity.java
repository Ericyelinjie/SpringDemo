package com.tuzhihao.datajpa.web;

import com.tuzhihao.datajpa.domain.City;
import com.tuzhihao.datajpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2015/8/2.
 * 添加一个城市
 */

@Controller
@RequestMapping("/city}")
@ResponseBody
public class saveCity {
    @Autowired
    private CityService cityService;
    /**
     * http://localhost:8080/city/save/name/state/country
     * @param name 城市的名字
     * @param state
     * @param country
     */
    @RequestMapping("/save/{name}/{state}/{country}")
    @ResponseBody
    @Transactional
    public City save(@PathVariable("name") String name, @PathVariable("state") String state,
                     @PathVariable("country") String country){
        City city =this.cityService.getCity(name);
        if (city==null)
       city = new City(name,state,country);
        return this.cityService.save(city);
        }
        }
