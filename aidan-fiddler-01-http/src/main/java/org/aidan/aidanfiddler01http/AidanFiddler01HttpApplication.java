package org.aidan.aidanfiddler01http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * docker build -t aidan.org/hello:1.0 .
 * docker run -d --rm -it -p 9090:8080 aidan.org/hello:1.0
 */
@SpringBootApplication
public class AidanFiddler01HttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(AidanFiddler01HttpApplication.class, args);
    }
}
