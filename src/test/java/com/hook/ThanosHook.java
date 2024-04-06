package com.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThanosHook {

    @Before(order = 0)
    public void beforeScenarioBeforeSnap(){

        System.out.println("Thanos attacked NewYork 2012");
    }

    @After(order = 2)
    public void afterScenarioAfterSnap(){
        System.out.println("Captain America stays in his original timeline");

    }
    @Before
    public void beforeSnap(){

        System.out.println("Thanos collecting the stones");
    }

    @After
    public void afterSnap(){
        System.out.println("Avengers returned the stone to the same timeline after killing Thanos");

    }

}