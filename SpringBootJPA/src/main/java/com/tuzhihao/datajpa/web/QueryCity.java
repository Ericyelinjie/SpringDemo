package com.tuzhihao.datajpa.web;

/**
 * Created by Methol on 2015-07-28.
 * 查询城市类
 * http://localhost:8080/city/Bath
 */
import com.tuzhihao.datajpa.domain.City;
import com.tuzhihao.datajpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
//        return "该城市是："+this.cityService.getCity(name, "UK").getName();
        return "该城市是：" + this.cityService.getCity(name).getName();
    }

    /**
     * 分页
     * http://localhost:8080/city/all/1/10
     *
     * @param page 第几页
     * @param size 每一页的大小
     * @return
     */
    @RequestMapping("/all/{page}/{size}")
    @ResponseBody
    @Transactional(readOnly = true)
    public String getCity(@PathVariable("page") String page, @PathVariable("size") String size) {
        PageRequest pageRequest = new PageRequest(Integer.parseInt(page), Integer.parseInt(size));  //查询第1页，5条数据
        Page<City> p = this.cityService.findAllCities(pageRequest);
        StringBuilder sb = new StringBuilder("");
        for (City city : p) {
            sb.append(city.getCountry())
                    .append("&nbsp;")
                    .append(city.getName())
                    .append("&nbsp;")
                    .append(city.getMap())
                    .append("&nbsp;")
                    .append(city.getState())
                    .append("<br />");
        }
        return sb.toString();
    }

    /**
     * 根据name查询City
     *    @RequestMapping("/items/{name}")
     @ResponseBody
     public City getCity(@PathVariable("name") String name){
     return this.cityService.getCity(name);
     }
     * */



//    可以直接根据对象注入进去
//    @RequestMapping("/list") /city/list?p1=xx&p2=xx&p3=22
//    public Object (@RequestParam(value="p1") String p1,@RequestParam(value="p2") String p2,@RequestParam(value="p3") String p3) {
//        return null;
//    }

//
//    @RequestMapping("/list") /city/list?name=xx&address
//    public Object (@ModelAttribute City city) {
//        return null;
//    }

}