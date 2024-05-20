package com.kafi.javaspring.chapter_1_ioc.lesson_22_config_with_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan()
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("Bean Cat is created");
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
