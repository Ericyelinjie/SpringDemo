package com.tuzhihao.datajpa.web;

/**
 * Created by Methol on 2015-07-28.
 * 查询城市类
 * http://localhost:8080/city/Bath
 */

import com.tuzhihao.datajpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/city")
public class QueryCity {

    @Autowired
    private CityService cityService;

    @RequestMapping("/{name}")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld(@PathVariable("name") String name) {
        return "该城市是："+this.cityService.getCity(name, "UK").getName();
    }

}