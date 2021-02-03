package com.PricingDemo.PricingDemo;


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
@RestController
class getPrice {
    @RequestMapping("/getPrice")
    public String index() {
        return "getPrice Api triggered";
    }
}
