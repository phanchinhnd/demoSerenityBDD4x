package pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class StepDashboardPage extends PageObject {

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    WebElementFacade dashboardText;

    @Step("Successful login")
    public void loginVerify() {
        String dashboardTitle = dashboardText.getText();
        assertThat(dashboardTitle, containsString("Dashboard"));
    }
}