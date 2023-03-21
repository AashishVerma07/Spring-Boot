package com.youtube.springBootTestApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
@RequestMapping("home")
public class HomeContrller {

        HomServise homServise = new HomServise();

        @GetMapping
        public String home(){
            return "Aa hi gaye finally";
        }
}
