import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    SearchProduct searchProduct;

    public HomePage(WebDriver driver) {

        super(driver);
        searchProduct = new SearchProduct(driver);

    }

    public void searchProduct(){

        this.searchProduct=searchProduct;

    }
}
