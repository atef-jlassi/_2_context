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
  public Owner owner() {
    Owner owner = new Owner();
    /**
     * By calling the method 'cat()' spring will inject the instance Already exit on the spring context
     * owner.setCat(cat());
     */

    owner.setCat(cat());
    return owner;
  }
}
