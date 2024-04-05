package com.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThanosHook {

//    @Before(order = 0)
//    public void beforeScenarioBeforeSnap(){
//
//        System.out.println("Thanos attacked NewYork 2012");
//    }
//
//    @After(order = 2)
//    public void afterScenarioAfterSnap(){
//        System.out.println("Captain America stays in his original timeline");
//
//    }
//    @Before
//    public void beforeSnap(){
//
//        System.out.println("Thanos collecting the stones");
//    }
//
//    @After
//    public void afterSnap(){
//        System.out.println("Avengers returned the stone to the same timeline after killing Thanos");
//
//    }

    @Before("@First,@Second,@Third")
    public void beforeScenario(){
        System.out.println("This will run before Scenario");
    }
    @After("@First,@Second,@Third")
    public void afterScenario(){
        System.out.println("This will run after Scenario");
    }

    @Before("@First,@Second,@Third")
    public void beforeFirstSecondThird(){
        System.out.println("This will run before every First scenario");
        System.out.println("This will run before every Second scenario");
        System.out.println("This will run before every Third scenario");
    }
//    @Before("@Second")
//    public void beforeSecond(){
//        System.out.println("This will run before every Second scenario");
//    }
//    @Before("@Third")
//    public void beforeThird(){
//        System.out.println("This will run before every Third scenario");
//    }

    @After("@First,@Second,@Third")
    public void afterFirst(){
        System.out.println("This will run after every First scenario");
        System.out.println("This will run after every Second scenario");
        System.out.println("This will run after every Third scenario");
    }
//    @After("@Second")
//    public void afterSecond(){
//        System.out.println("This will run after every Second scenario");
//    }
//    @After("@Third")
//    public void afterThird(){
//        System.out.println("This will run after every Third scenario");
//    }

}
