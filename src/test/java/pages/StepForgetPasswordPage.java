package pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StepForgetPasswordPage extends PageObject {

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/div/form/h6")
    WebElementFacade forgetLink;

    @Step("Verify Forget Password Page ")
    public boolean ForgetPasswordPage() {
        Boolean resetPasswordButton = forgetLink.isDisplayed();

        return resetPasswordButton;
    }
}
