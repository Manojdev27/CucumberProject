package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableWithExamples {

    WebDriver driver = new ChromeDriver();

    @Given("navigate to login page")
    public void navigate_to_login_page() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @Given("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_the_and(String userName, String password) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userName);
        driver.findElement(By.name("pass")).sendKeys(password);
    }
    @Then("clicked login button")
    public void clicked_login_button() {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

}
