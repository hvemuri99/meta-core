package com.meta.web;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetaCoreApplication {

    private static final Logger LOGGER = Logger.getLogger(MetaCoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MetaCoreApplication.class, args);
        DOMConfigurator.configure("src\\main\\resources\\metas-log4j.xml");
        LOGGER.info("meta-core app started");
    }
}
