package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marinka on 02.04.2017.
 */
public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="user-options")
    private WebElement login;

    public WebElement getLogin() {
        return login;
    }
}
