package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

/**
 * Created by Marinka on 02.04.2017.
 */
public class LoginSteps  extends ScenarioSteps {

    private LoginPage loginPage;

    public LoginSteps(Pages pages) {
        super(pages);
        loginPage = getPages().get(LoginPage.class);

    }

    @Step
    public void login_as(String username, String password){
        WebElement emailInput = loginPage.getEmail();
        emailInput.clear();
        emailInput.sendKeys(username);
        WebElement passwordInput = loginPage.getPassword();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginPage.getLoginBtn().click();
    }
}
