import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By resultTextLabel = By.className("resultText");
    By pagenations = By.className("pagination");
    By pagenationFourPage = By.xpath(".//*[@class='pagination']/a[4]");
    By laptopName = By.className("productName");

    public ProductsPage(WebDriver driver) {

        super(driver);

    }

    public boolean isProductsPage() {

        return isDisplayed(resultTextLabel);

    }

    public void selectAProduct() {

        for (int i=0 ; i<5 ; i++) {
            isPagination();
        }
        waiting(pagenations,5);
        click(pagenationFourPage);
        waiting(laptopName,5);
        click(laptopName);

    }

    private void isPagination(){

        scroll(0,1100);

    }
}
