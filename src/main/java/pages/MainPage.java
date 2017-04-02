package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static steps.CreateIssueSteps.IssueSummary;

/**
 * Created by Marinka on 31.03.2017.
 */
@DefaultUrl("https://liberstina.atlassian.net/secure/Dashboard.jspa")
public class MainPage extends PageObject {

    public WebDriver driver;

        public MainPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(id="create_link")
        private WebElement createIssue;

        @FindBy(id="summary")
        private WebElement summary;

        @FindBy(id="create-issue-submit")
        private WebElement submitIssue;

        @FindBy(xpath="//*[@id=\"aui-flag-container\"]/div/div")
        private WebElement notificationCreateIssue;

        public WebElement getCreateIssueBtn() {
        return createIssue;
    }

        public WebElement getSummary() {
            waitFor(ExpectedConditions.elementToBeClickable(summary));
            return summary;
        }

        public WebElement getSubmitIssue() { waitFor(ExpectedConditions.elementToBeClickable(submitIssue)); return submitIssue;}

        public WebElement getNotificationCreateIssue() { waitFor(ExpectedConditions.elementToBeClickable(notificationCreateIssue)); return notificationCreateIssue;}






}



