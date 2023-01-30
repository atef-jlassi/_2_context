package com.config;

import com.beans.Cat;
import com.beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean
  public Cat cat() {
    Cat cat = new Cat();
    cat.setName("Tom");
    return cat;
  }

  @Bean
  public Owner owner(Cat cat) {
    Owner owner = new Owner();

    /**
     * First way of wiring Beans
     *
     * By calling the method 'cat()' spring will inject the instance Already exit on the spring context
     * owner.setCat(cat());
     */
    // owner.setCat(cat());

    /**
     * Second way of wiring Beans
     *
     * By defining a cat parameter  'public Owner owner(Cat cat) {}' and not calling the method any more.
     * When you put a parameter in a method annotated @Bean, Spring will search in the context if there is
     * a type of this instance already exist on the context.
     *
     * owner.setCat(cat);
     */
    owner.setCat(cat);
    return owner;
  }
}
