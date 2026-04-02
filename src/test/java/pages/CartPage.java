package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void placeOrder() {

        driver.findElement(By.id("cartur")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Place Order']")
        )).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModal")));

        driver.findElement(By.id("name")).sendKeys("Anand");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Ahmedabad");
        driver.findElement(By.id("card")).sendKeys("1234567890123456");
        driver.findElement(By.id("month")).sendKeys("03");
        driver.findElement(By.id("year")).sendKeys("2026");

        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sweet-alert")));

        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }

}

