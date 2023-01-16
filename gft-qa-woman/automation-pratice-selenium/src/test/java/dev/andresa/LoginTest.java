package dev.andresa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");        
    }

    @AfterEach
    void tearDown() throws Exception{
        //driver.quit();
    }

    @Test
    void testName() {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("secret_sauce");

        WebElement subimitBtElement = driver.findElement(By.id("login-button"));
        subimitBtElement.click();



    }
    
    
}
