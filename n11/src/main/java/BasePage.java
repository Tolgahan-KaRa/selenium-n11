import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;

    }

    public WebElement find(By locator){

        return driver.findElement(locator);

    }

    public List<WebElement> findAll(By locator){

        return driver.findElements(locator);

    }

    public void click(By locator){

        find(locator).click();

    }

    public void type(By locator , String text){

        find(locator).sendKeys(text);

    }

    public boolean isDisplayed(By locator){

        return find(locator).isDisplayed();

    }

    public void scroll(Integer x , Integer y){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+ x +","+ y +")");

    }

    public void visibilityScroll(By locator){

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", locator);
        waiting(locator, 5);
    }

    public void waiting(By locator, Integer x){

        WebDriverWait wait = new WebDriverWait(driver, x);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
