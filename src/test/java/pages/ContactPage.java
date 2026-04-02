package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
	WebDriver driver;
    WebDriverWait wait;

    public ContactPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void sendMessage() {

        driver.findElement(By.linkText("Contact")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleModal")));

        driver.findElement(By.id("recipient-email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("recipient-name")).sendKeys("Anand");
        driver.findElement(By.id("message-text")).sendKeys("Automation Test");

        driver.findElement(By.xpath("//button[text()='Send message']")).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }

}


