package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by Marinka on 02.04.2017.
 */
public class HomeSteps  extends ScenarioSteps {

    private HomePage homePage;

    public HomeSteps(Pages pages) {
        super(pages);
        homePage = getPages().get(HomePage.class);

    }
    @Step
    public void login_user()
    {
        homePage.getLogin().click();
    }

}
