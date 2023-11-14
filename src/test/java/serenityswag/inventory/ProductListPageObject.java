package serenityswag.inventory;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import java.util.List;

public class ProductListPageObject extends PageObject {
    public List<String> titles(){
        return findAll(By.className("inventory_item_name")).textContents();
    }
}