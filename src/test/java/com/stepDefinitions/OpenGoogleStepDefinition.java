package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleStepDefinition {
    WebDriver driver;

    @Given("user is entering google.co.in")
    public void user_is_entering_google_co_in() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
    }

    @When("user is typing the search term {string}")
    public void user_is_typing_the_search_term(String searchTerm) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(searchTerm);
    }

    @When("enters the return key")
    public void enters_the_return_key() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("the user should see the search results")
    public void the_user_should_see_the_search_results() {
        // Write code here that turns the phrase above into concrete actions
        boolean status = driver.findElement(By.partialLinkText("Harry")).isDisplayed();
        if (status) {
            System.out.println("Results displayed");
        }
    }

    @Then("the driver is closed")
    public void the_driver_is_closed() {
        driver.close();

    }
}
