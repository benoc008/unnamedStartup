package com.unnamed.startup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/")
public class TestRestController {

    @RequestMapping(method = GET)
    public String get(){
        return "aaaaaa";
    }
}