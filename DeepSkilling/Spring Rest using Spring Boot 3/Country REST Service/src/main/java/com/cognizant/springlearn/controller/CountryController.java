package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        logger.info("CountryController.getCountryIndia() started");
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            Country country = context.getBean("india", Country.class);
            logger.info("CountryController.getCountryIndia() completed");
            return country;
        }
    }
}