package dev.andresa.pages;

import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    //Locators
    private By userLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By submitBtnLocator = By.id("login-button");
    private By tagMyAccountLocator = By.tagName("h1");

    public void signin(){
        if(super.isDisplayed(userLocator)){
            super.type("standard_user", userLocator);
            super.type("secret_sauce", passwordLocator);
            super.click(submitBtnLocator);
        } else{
            System.out.println("username Textbox was not present");
        }
    }

	public String getMyAccountMessage() {
		return super.getText(tagMyAccountLocator);
	}

    public BooleanSupplier getCurrentURL(boolean equals) {
        return null;
    }


}
