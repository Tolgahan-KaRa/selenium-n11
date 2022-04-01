import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class BasketPage extends BasePage {

    By modalText = By.className("closeBtn");
    By clickModal = By.className("content");
    By basketNameLocator = By.className("box__title");
    By deleteModalButton = By.xpath(".//*[@id='userKvkkModal']/div[1]/div[2]/span");
    By emtyBasket = By.className("cartEmptyText");
    By deleteProduct = By.cssSelector(".removeProd.svgIcon.svgIcon_trash");


    public BasketPage(WebDriver driver) {

        super(driver);

    }

    public void deleteProduct() {

//        waiting(modalText,5);
//        click(clickModal);
//        waiting(basketNameLocator,5);
        click(deleteModalButton);
        waiting(deleteProduct,5);
        click(deleteProduct);



    }



    public boolean isThereAnOrderSummary() {

        return isDisplayed(emtyBasket);
    }
}
