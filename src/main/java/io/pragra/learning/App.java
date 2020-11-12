package io.pragra.learning;

import io.pragra.learning.config.AppConfig;
import io.pragra.learning.config.OfficeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication

public class App {

    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//        Person person = context.getBean("person",Person.class);// no need name if we have more than identifier than we need name
//        Person person1 = context.getBean("person",Person.class);
//
//        //System.out.println(person.getAddress());
//        //System.out.println(person);
//        System.out.println(person);
//        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
//        ((ClassPathXmlApplicationContext) context).close();

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("io.pragra.learning.config");
//
//        Person person = context.getBean(Person.class);// no need name if we have more than identifier than we need name
//        OfficeAddress address = context.getBean(OfficeAddress.class);
//
//        System.out.println(person);
//        System.out.println(address);
//        ((ConfigurableApplicationContext) context).registerShutdownHook();
        ApplicationContext context = SpringApplication.run(App.class,args);
        System.out.println(context.getBean(Person.class));

    }
}
