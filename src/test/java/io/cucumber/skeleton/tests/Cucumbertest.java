package io.cucumber.skeleton.tests;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cucumbertest {
    private WebDriver driver;
    public Cucumbertest() {
        driver = new ChromeDriver();
    }

    @When("My test")
    public void myTest (){
        driver.get("http://www.google.com");
    }

    @Given("Type {string}")
    public void typeTest (String string){
        //driver.findElement(By.xpath("")).click();
        WebElement searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys(string);
        searchElement.sendKeys(Keys.ENTER);
    }

    @After
    public void afterTest() {
        //driver.close();
    }
}
