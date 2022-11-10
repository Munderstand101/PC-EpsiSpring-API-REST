package com.Epsi.Spring.EpsiSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public @ResponseBody String getHome() {
        // ...
        System.out.println("Hakuna matat !!");
        return "index";

    }

}