import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By basketButton = By.className("product-add-cart");
    By basketButtonLocator = By.className("addBasketUnify");
    By basketAddNum = By.className("basketTotalNum");
    By basket = By.className("myBasketHolder");

    public ProductDetailPage(WebDriver driver) {

        super(driver);

    }

    public boolean isProductDetailPage() {

        waiting(basketButton,5);
        return isDisplayed(basketButton);

    }

    public void addProductInBasket() {

        click(basketButtonLocator);
        waiting(basketAddNum,5);
        click(basket);

    }

    public boolean isAddBasket() {

        waiting(basketAddNum,5);
        return isDisplayed(basketAddNum);

    }
}
