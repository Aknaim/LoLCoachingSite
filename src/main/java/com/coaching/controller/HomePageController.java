package com.coaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Aknaim on 2017-01-04.
 */

@Controller
@RequestMapping(value = "lol")

public class HomePageController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getHomePage(){
        return new ModelAndView("index");
    }

}
