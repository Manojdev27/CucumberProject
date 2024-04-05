package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksTest {

    @Given("Thanos has the infinity Stones")
    public void thanos_has_the_infinity_stones() {
        System.out.println("Thanos has the infinity Stones");
    }
    @When("Thanos snaps his fingers")
    public void thanos_snaps_his_fingers() {
        System.out.println("Thanos snaps his fingers");
    }
    @Then("half of the humans died")
    public void half_of_the_humans_died() {
        System.out.println("half of the humans died");
    }
    @Given("Avengers time travelled and collected the stones before thanos")
    public void avengers_time_travelled_and_collected_the_stones_before_thanos() {
        System.out.println("Avengers time travelled and collected the stones before thanos");
    }
    @When("Hulk Snapped his fingers and humans revived from blip")
    public void hulk_snapped_his_fingers_and_humans_revived_from_blip() {
        System.out.println("Hulk Snapped his fingers and humans revived from blip");
    }
    @Then("Ironman snaps his fingers and the thanos and his army destroyed.")
    public void ironman_snaps_his_fingers_and_the_thanos_and_his_army_destroyed() {
        System.out.println("Ironman snaps his fingers and the thanos and his army destroyed");
    }

}
