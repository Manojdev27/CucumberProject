package com.stepDefinitions;

import io.cucumber.java.en.Given;

public class RegexStepDef {

    @Given("^I have (\\d+) laptop$")
    public void i_have_laptop(int count) {
        System.out.println(STR."Laptop count: \{count}");
    }
    @Given("^I have (\\d+) books$")
    public void i_have_books(int booksCount) {
        System.out.println(STR."bookscount = \{booksCount}");
    }

    @Given("^I have (\\d+\\.\\d+) cgpa$")
    public void I_have__cgpa(float num){
        System.out.println(STR."num = \{num}");
    }
    @Given("^\"(.*?)\" is elder than Harry")
    public void is_elder_than_Harry(String string) {
        System.out.println(STR."\{string} is elder than me");
    }

}
