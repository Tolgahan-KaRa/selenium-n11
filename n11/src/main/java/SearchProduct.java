import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct extends BasePage {

    By searchBox = By.id("searchData");
    By searchButton = By.className("searchBtn");

    public SearchProduct(WebDriver driver) {

        super(driver);

    }

    public void search(String text) {

        type(searchBox,text);
        click(searchButton);

    }


}
