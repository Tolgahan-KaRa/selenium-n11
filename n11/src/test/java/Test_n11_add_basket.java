import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_n11_add_basket extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    BasketPage basketPage;

    @Test
    @Order(1)
    public void searchProduct(){

        homePage = new HomePage(driver);
        homePage.searchProduct.search("laptop");
        productsPage = new ProductsPage(driver);
        Assertions.assertTrue(productsPage.isProductsPage()
                ,"You are not producstpage");


    }

    @Test
    @Order(2)
    public void selectProduct(){

        productsPage.selectAProduct();
        productDetailPage = new ProductDetailPage(driver);
        Assertions.assertTrue(productDetailPage.isProductDetailPage()
       ,"You are not productDetailPage");

    }

    @Test
    @Order(3)
    public void addBasket(){

        productDetailPage.addProductInBasket();
        Assertions.assertTrue(productDetailPage.isAddBasket(),
                "Basket is not increase");

    }

    @Test
    @Order(4)
    public void goToBasket(){

        basketPage = new BasketPage(driver);
        basketPage.deleteProduct();
        Assertions.assertTrue(basketPage.isThereAnOrderSummary(),
                "Is not order summary");

    }
}
