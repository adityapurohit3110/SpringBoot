package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger("JCG");

    @Autowired
    private PersonService service;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) {

        LOG.info("Current objects in DB: {}", service.countPersons());

        Person person = service.createPerson(new Person("Anand", 40,"Delhi"));
        service.createPerson(new Person("A", 27,"Pune"));
        service.createPerson(new Person("b", 27,"Pune"));
        service.createPerson(new Person("c", 27,"Pune"));
        service.createPerson(new Person("d", 27,"Pune"));
        service.createPerson(new Person("t", 27,"Pune"));
        service.createPerson(new Person("y", 27,"Pune"));
        service.createPerson(new Person("u", 27,"Pune"));
        LOG.info("Person created in DB : {}", person);

        LOG.info("Current objects in DB: {}", service.countPersons());

//        person.setName("Programmer");
//        Person editedPerson = service.editPerson(person);
//        LOG.info("Person edited in DB  : {}", editedPerson);
//
//        service.deletePerson(person);
//        LOG.info("After deletion, count: {}", service.countPersons());
    }
}
