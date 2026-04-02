package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

   
    public void selectLaptopAndAddToCart() {

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Laptops"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sony vaio i5"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Sony vaio i5']")));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();
        

        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }

}

