package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START - main()");
        SpringApplication.run(SpringLearnApplication.class, args);

        SpringLearnApplication app = new SpringLearnApplication();
        app.displayDate();
        app.displayCountry();
        app.displayCountries();

        LOGGER.info("END - main()");
    }

    // Hands-on 1: Load SimpleDateFormat from Spring XML
    public void displayDate() {
        LOGGER.info("START - displayDate()");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
            SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
            Date date = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date: {}", date);
            System.out.println("Parsed Date: " + date);
        } catch (Exception e) {
            LOGGER.error("Error parsing date: {}", e.getMessage());
        }
        LOGGER.info("END - displayDate()");
    }

    // Hands-on 2: Load Country from Spring XML
    public void displayCountry() {
        LOGGER.info("START - displayCountry()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("in", Country.class);
        LOGGER.debug("Country: {}", country.toString());
        System.out.println("Country: " + country);
        LOGGER.info("END - displayCountry()");
    }

    // Hands-on 3: Load list of countries from Spring XML
    public void displayCountries() {
        LOGGER.info("START - displayCountries()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        for (Country c : countries) {
            LOGGER.debug("Country: {}", c.toString());
            System.out.println("Country: " + c);
        }
        LOGGER.info("END - displayCountries()");
    }
}