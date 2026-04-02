package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	 WebDriver driver;
	    WebDriverWait wait;
	    public LoginPage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait = wait;
	    }
	    public void login(String user, String pass) {
	    	    // Close signup modal if displayed
	    	    if (!driver.findElements(By.id("signInModal")).isEmpty()) {
	    	        try {
	    	            wait.until(ExpectedConditions.elementToBeClickable(
	    	                    By.xpath("//div[@id='signInModal']//span[@aria-hidden='true']")
	    	            )).click();
	    	        } catch (Exception e) {
	    	            System.out.println("Signup modal not visible");
	    	        }
	    	    }
	    	    wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
	    	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
	    	    driver.findElement(By.id("loginusername")).sendKeys(user);
	    	    driver.findElement(By.id("loginpassword")).sendKeys(pass);
	    	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
	    	}
}

