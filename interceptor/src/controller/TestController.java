package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by likun on 2018/2/26 0026.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "TEST  SUCCESS";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "TEST  HELLO";
    }
}
