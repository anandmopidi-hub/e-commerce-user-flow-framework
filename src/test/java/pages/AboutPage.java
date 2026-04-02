package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
	

	    WebDriver driver;
	    WebDriverWait wait;

	    public AboutPage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait = wait;
	    }

	    public void playVideo() throws InterruptedException {

	        driver.findElement(By.linkText("About us")).click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("videoModal")));

	        ((JavascriptExecutor) driver)
	                .executeScript("document.querySelector('button.vjs-play-control').click();");

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//div[@id='videoModal']//button[text()='Close']")).click();
	    }
	
}



