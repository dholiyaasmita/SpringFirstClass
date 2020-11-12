package io.pragra.learning.config;

import io.pragra.learning.HomeAddress;
import io.pragra.learning.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class AppConfig {
   @Bean
    public HomeAddress homeAddress(){
        return  new HomeAddress("Matheson Blvd",200,"Mississauga","CA");
   }

    @Bean
    public Person person(){
       return new Person("ruhi",3,homeAddress(), Collections.emptyList());
    }
}
