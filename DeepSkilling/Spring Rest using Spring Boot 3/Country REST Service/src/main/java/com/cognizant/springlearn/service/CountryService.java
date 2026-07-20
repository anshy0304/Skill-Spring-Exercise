package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {
        logger.info("CountryService.getCountry() started for code: {}", code);
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            List<Country> countryList = context.getBean("countryList", List.class);
            Country country = countryList.stream()
                    .filter(item -> item.getCode() != null && item.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
            logger.info("CountryService.getCountry() completed for code: {}", code);
            return country;
        }
    }
}