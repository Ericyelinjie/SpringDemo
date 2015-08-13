package com.tuzhihao.datajpa.web;

import com.tuzhihao.datajpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by eric on 2015/8/12.
 */
@Controller
@RequestMapping("/city")
public class DelCity {
    @Autowired
    private CityService cityService;
    /**
     * http://localhost:8080/city/del/Chicago
     * @param name 城市的名字
     */
    @RequestMapping("/del/{name}")
    @ResponseBody
    @Transactional
    public void delete(@PathVariable("name") String name){
        this.cityService.delete(name);
}
}
