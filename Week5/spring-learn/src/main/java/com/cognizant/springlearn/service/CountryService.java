package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    // Get country list from XML
    public List<Country> getAllCountries() {
        LOGGER.info("START - getAllCountries()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        LOGGER.info("END - getAllCountries()");
        return countries;
    }

    // Get single country by code (case insensitive)
    public Country getCountry(String code) throws CountryNotFoundException {
        LOGGER.info("START - getCountry() code={}", code);
        List<Country> countries = getAllCountries();

        Country found = countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException());

        LOGGER.info("END - getCountry()");
        return found;
    }
}