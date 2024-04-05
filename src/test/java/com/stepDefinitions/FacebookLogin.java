package com.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

    WebDriver driver = new ChromeDriver();

    @Given("user is entering facebook.com")
    public void user_is_entering_facebook_com() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @When("user is typing the username")
    public void user_is_typing_the_username() {
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("manojkumardev27@gmail.com");
    }
    @When("user is typing the password")
    public void user_is_typing_the_password() {
        driver.findElement(By.name("pass")).sendKeys("Godhand27");

    }

    @And("the login button is clicked")
    public void the_login_button_is_clicked() {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

    }


}
