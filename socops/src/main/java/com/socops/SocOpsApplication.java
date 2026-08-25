package com.socops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocOpsApplication {

    /**
     * Entry point for the Soc Ops application.
     *
     * @param commandLineArgs command line arguments
     */
    public static void main(String[] commandLineArgs) {
        SpringApplication.run(SocOpsApplication.class, commandLineArgs);
    }
}
