package serenityswag.inventory;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.LoginActions;
import serenityswag.authentication.User;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class WhenViewingHighlightedProductsTest {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    ProductListPageObject productList;

    @Test
    public void shouldDisplayHighlightedProductsOnTheWelcomePage(){
        login.as(User.STANDARD_USER);


        List<String> productsOnDisplay = productList.titles();
        assertThat(productsOnDisplay).hasSize(6)
                                     .contains("Sauce Labs Backpack");
    }
}
