package pages;

import org.openqa.selenium.By;
import support.driver.DriverManager;

public class MenuHome  extends DriverManager {

    private  By mn_users = By.id("users");

    public void clickUser() {
        getDriver().findElement(mn_users).click();
    }
}
