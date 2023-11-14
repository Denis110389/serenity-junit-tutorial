package serenityswag.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0}")
    public void as(User user) {
        openUrl("https://www.saucedemo.com/");

        // Login as a standard user
        $("[name=user-name]").sendKeys(user.getUsername());
        $("[name=password]").sendKeys(user.getPassword());
        $("[name=login-button]").click();
    }

}
