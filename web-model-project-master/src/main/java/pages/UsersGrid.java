package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class UsersGrid extends DriverManager {

      By btnNewUser = By.cssSelector("#btn-new");

    public void clickNewUser() {
        Action.getVisibleElement(btnNewUser);
        getDriver().findElement(btnNewUser).click();
    }

    public void clickShowUser(String lastUser) {
        String elem =  "btn-show_"  + lastUser;
        By btnShowLastUser = By.id(elem);
        Action.getVisibleElement( btnShowLastUser);

        getDriver().findElement(btnShowLastUser).click();
    }
}
