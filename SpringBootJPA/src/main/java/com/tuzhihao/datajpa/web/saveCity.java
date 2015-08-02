package com.tuzhihao.datajpa.web;

import com.tuzhihao.datajpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/8/2.
 * 添加一个城市
 */

@Controller
@RequestMapping("/addcity")
public class saveCity {
    @Autowired
    private CityService cityService;


}
