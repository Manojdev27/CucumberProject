package com.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHook {

    @Before()
    public void beforeScenario(){
        System.out.println("This will run before Scenario");
    }
    @After()
    public void afterScenario(){
        System.out.println("This will run after Scenario");
    }

    @Before("@First,@Second,@Third")
    public void beforeEvery(){
        System.out.println("This will run before All scenario");
    }


    @Before("@First")
    public void beforeFirst(){
        System.out.println("This will run before every First scenario");
    }
    @Before("@Second")
    public void beforeSecond(){
        System.out.println("This will run before every Second scenario");
    }
    @Before("@Third")
    public void beforeThird(){
        System.out.println("This will run before every Third scenario");
    }

    @After("@First")
    public void afterFirst(){
        System.out.println("This will run after every First scenario");

    }
    @After("@Second")
    public void afterSecond(){
        System.out.println("This will run after every Second scenario");
    }
    @After("@Third")
    public void afterThird(){
        System.out.println("This will run after every Third scenario");
    }

    @After("@First,@Second,@Third")
    public void afterEvery(){
        System.out.println("This will run after All scenario");
    }

}
