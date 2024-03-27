package steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import pages.StepDashboardPage;

public class DashboardPageDefinitions {

    @Steps
    StepDashboardPage dashPage;

    @Step
    public void verifyAdminLogin() {
        dashPage.loginVerify();
    }
}
