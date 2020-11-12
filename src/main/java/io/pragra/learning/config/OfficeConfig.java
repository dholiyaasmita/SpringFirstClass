package io.pragra.learning.config;

import io.pragra.learning.OfficeAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.NumberFormat;

@Configuration
public class OfficeConfig {

   @Bean
    public OfficeAddress officeAddress(){
       return new OfficeAddress("Pragra",NumberFormat.getNumberInstance());
   }
}
