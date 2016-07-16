package com.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index_GET(){
        return "index";
    }

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home_GET(){
        return "views/home";
    }

    @RequestMapping(path = "/info", method = RequestMethod.GET)
    public String info_GET(){
        return "views/info";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String singIn_GET(){
        return "views/login";
    }

    @RequestMapping(path = "/singup", method = RequestMethod.GET)
    public String singUn_GET()  {return "views/singup";}

    @RequestMapping(path = "/contacts", method = RequestMethod.GET)
    public String contacts_GET(){
        return "views/contacts";
    }
}
