package com.pluralsight.SakilaSpringBoot.UI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInterface implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started User Interface!");
    }
}
