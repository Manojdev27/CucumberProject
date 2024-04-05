package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithData {

    WebDriver driver = new ChromeDriver();

    @Given("user entering facebook.com")
    public void user_entering_facebook_com() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }
    @When("^user enters the valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_the_valid_and(String userName, String password) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userName);
        driver.findElement(By.name("pass")).sendKeys(password);
    }
    @Then("the user logged in")
    public void the_user_logged_in() {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String expected = "(7)Facebook";
        boolean actual = driver.getTitle().isBlank();
        Assert.assertTrue(expected,actual);


    }
}
