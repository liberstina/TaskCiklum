package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marinka on 01.04.2017.
 */

public class LoginPage extends MainPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="username")
    private WebElement email;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login")
    private WebElement loginBtn;

    public WebElement getEmail() {
        waitFor(ExpectedConditions.elementToBeClickable(email));
        return email;
    }

    public WebElement getPassword() {
        waitFor(ExpectedConditions.elementToBeClickable(password));
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}

