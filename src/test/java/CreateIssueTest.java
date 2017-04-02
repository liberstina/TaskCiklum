import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import steps.CreateIssueSteps;
import steps.HomeSteps;
import steps.LoginSteps;

import static steps.CreateIssueSteps.IssueSummary;

/**riz
 * Created by Marinka on 01.04.2017.
 */


@RunWith(SerenityRunner.class)
public class CreateIssueTest {
    /*
    @WithDriver("chrome")
    @WithTag("create_issue")
    @Test
*/
  // @TestData
    public static String username = "liberstina@gmail.com";
    public static String password = "Til23Lie02";
    public static String IssueSummary = "testCiklum";

    @Managed(driver="chrome", uniqueSession = true)
    WebDriver webDriver = new ChromeDriver();

        @ManagedPages
        Pages pages = new Pages(webDriver);

        @Steps
        private LoginSteps loginSteps = new LoginSteps(pages);

        @Steps
        private HomeSteps homeSteps = new HomeSteps(pages);

        @Steps
        private CreateIssueSteps createIssueSteps = new CreateIssueSteps(pages);

        @Test
        public void checkCreatedIssue(){
            System.setProperty("webdriver.driver","chrome");
            homeSteps.login_user();
            loginSteps.login_as(username, password);
            createIssueSteps.create_issue();
            createIssueSteps.new_issue_create(IssueSummary);
            createIssueSteps.check_find_issue();
        }


    }




