package com.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DataTableWithoutHeader {

    WebDriver driver = new ChromeDriver();

    @Given("user navigates to facebook.com")
    public void user_navigates_to_facebook_com() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @Given("^user enters the valid credentials$")
    public void user_enters_the_valid_credentials(DataTable dataTable) {
        List<String> credentials = dataTable.transpose().asList(String.class);
        String userName = credentials.get(0);
        String password = credentials.get(1);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userName);
        driver.findElement(By.name("pass")).sendKeys(password);
    }
    @Then("the user logged into the page")
    public void the_user_logged_into_the_page() {

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

}
