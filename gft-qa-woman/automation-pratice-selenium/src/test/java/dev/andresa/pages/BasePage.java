package dev.andresa.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    private WebDriver driver;
    private Actions action;

    public BasePage() {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void visit(String url){
        this.driver.get(url);
    }

    public String getCurrentUrl(){
        return this.driver.getCurrentUrl();
    }

    public void quitWebDriver(){
        driver.quit();
    }

    public WebElement findElementy(By locator){
        return this.driver.findElement(locator);
    }

    public void type(String input, By locator){
        this.driver.findElement(locator).sendKeys(input);
    }

    public Boolean isDisplayed (By locator) { //Método para verificar se o elemento estará visivel na página
        try {
            return this.driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public void clik(By locator){
        this.driver.findElement(locator).click();
    }

    public String getText(By locator){
        return this.driver.findElement(locator).getText();
    }

    public void click(By submitBtnLocator) {
    }

    public void actionMoveToElementPerform(By locator){
        if(this.action == null){
            this.action = new Actions(this.driver);
        }
        WebElement element = this.driver.findElement(locator);
        action.moveToElement(element); 
    }

    
}
