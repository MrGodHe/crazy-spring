package com.hewei.crazy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import static com.hewei.crazy.spring.constants.EvnConstants.SPRING_PROFILE_ACTIVE;


@SpringBootApplication
public class AppBootstrap {

    public static void main(String[] args) {
        setProfileIfNotExists("dev");
        SpringApplication.run(AppBootstrap.class, args);
    }

    public static void setProfileIfNotExists(String profile) {
        if (!StringUtils.hasLength(System.getProperty(SPRING_PROFILE_ACTIVE))
                && !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
            System.setProperty(SPRING_PROFILE_ACTIVE, profile);
        }
    }

}
