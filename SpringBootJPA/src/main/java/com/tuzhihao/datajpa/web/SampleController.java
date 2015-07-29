package com.tuzhihao.datajpa.web;

/**
 * Created by Methol on 2015-07-28.
 * Spring Boot 演示文件
 */

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        return "Spring Boot 测试程序";
    }

}