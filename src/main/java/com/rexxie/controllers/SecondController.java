package com.rexxie.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexAction() {
        return "Index action";
    }
}