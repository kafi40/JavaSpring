package com.kafi.javaspring.chapter_1_ioc.lesson_23_property_source;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:chapter_1_ioc/lesson_23_property_source/application.properties")
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
