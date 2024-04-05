package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class DataTableWithHeader {

    WebDriver driver = new ChromeDriver();

    @Given("the user navigates to facebook.com")
    public void the_user_navigates_to_facebook_com() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Given("user enters the credentials")
    public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>> credMap = dataTable.asMaps(String.class, String.class);
        String userName = credMap.getFirst().get("UserName");
        String password = credMap.getFirst().get("Password");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userName);
        driver.findElement(By.name("pass")).sendKeys(password);

    }

    @Then("user logged into the page")
    public void user_logged_into_the_page() {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

}