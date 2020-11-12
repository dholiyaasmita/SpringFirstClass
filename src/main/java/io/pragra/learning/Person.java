package io.pragra.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private iAddress address;
    private List<String> hobbies;

    public Person(String name, int age, iAddress address, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public iAddress getAddress() {
        return address;
    }

    public void setAddress(iAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", hobbies=" + hobbies +
                '}';
    }

    @PostConstruct // afeter construction initialized it. is used on a method that needs to be executed after dependency injection is done to perform any initialization.
    public void init(){
        System.out.println("***************INIT***************");
    }

    @PreDestroy // The method annotated with PreDestroy is typically used to release resources that it has been holding.
    public void destroy(){
        System.out.println("*****************DESTROY******************");
    }
}
