package com.pluralsight.SakilaSpringBoot.UI;

import com.pluralsight.SakilaSpringBoot.data.ActorDao;
import com.pluralsight.SakilaSpringBoot.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserInterface implements CommandLineRunner {
    @Autowired
    public List<Actor> getAll() {

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started User Interface!");
        List<Actor> actors = ActorDao.getAll();
    }
}
