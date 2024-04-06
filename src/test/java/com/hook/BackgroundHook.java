package com.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundHook {

    @Before
    public void beforeScenario(){
        System.out.println("This will run before all scenarios");
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after all scenarios");
    }


}
