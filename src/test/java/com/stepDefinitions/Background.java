package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
    @Given("The Student finished high School")
    public void the_student_finished_high_school() {
        System.out.println("The Student finished high School");
    }
    @Given("The Student finished higher Secondary")
    public void the_student_finished_higher_secondary() {
        System.out.println("The Student finished higher Secondary");
    }

    @Given("the student applied for Engineering Course")
    public void the_student_applied_for_engineering_course() {
        System.out.println("the student applied for Engineering Course");
    }

    @When("the student cleared the entrance exam")
    public void the_student_cleared_the_entrance_exam() {
        System.out.println("the student cleared the entrance exam");
    }

    @Then("the student is eligible for joining the College")
    public void the_student_is_eligible_for_joining_the_college() {
        System.out.println("the student is eligible for joining the College");
    }

    @Given("the student applied for any foreign university")
    public void the_student_applied_for_any_foreign_university() {
        System.out.println("the student applied for any foreign university");
    }

    @Then("the student is eligible for joining the university")
    public void the_student_is_eligible_for_joining_the_university() {
        System.out.println("the student is eligible for joining the university");
    }
}
