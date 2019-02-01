package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests extends AbstractTestNGSpringContextTests {

    @Autowired
    private ParentsRepository parentsRepository;

    @Autowired
    private ChildrenRepository childrenRepository;

    @Test
    public void test() {

        Parent parent = new Parent();
        parent.setUuid(UUID.randomUUID());

        Child child1 = new Child();
        child1.setUuid(UUID.randomUUID());
        child1.setColumn1("child1");

        parent.getChildren().add(childrenRepository.save(child1));

        parentsRepository.save(parent);

    }

}

