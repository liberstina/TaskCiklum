package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import pages.LoginPage;

/**
 * Created by Marinka on 01.04.2017.
 */
public class CreateIssueSteps extends ScenarioSteps {

    private MainPage mainPage;
    public static String IssueSummary;
    public CreateIssueSteps(Pages pages)
    {
        super(pages);
    }

    @Step
    public void start_browser()
    {
        MainPage mainPage = getPages().get(MainPage.class);
        mainPage.open();
    }

    @Step
    public void create_issue()
    {
        mainPage.getCreateIssueBtn().click();
    }

    @Step
    public void new_issue_create(String summary)
    {
        WebElement summaryInput = mainPage.getSummary();
        summaryInput.sendKeys(summary);
        mainPage.getSubmitIssue().click();
    }

    @Step
    public void check_find_issue()
    {
        mainPage.getNotificationCreateIssue();
    }


}

