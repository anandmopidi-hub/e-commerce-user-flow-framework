package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
	WebDriver driver;
	   WebDriverWait wait;
	   public SignupPage(WebDriver driver, WebDriverWait wait) {
	       this.driver = driver;
	       this.wait = wait;
	   }
	   public void signup(String user, String pass) {
	       driver.findElement(By.id("signin2")).click();
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
	       driver.findElement(By.id("sign-username")).sendKeys(user);
	       driver.findElement(By.id("sign-password")).sendKeys(pass);
	       driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	       wait.until(ExpectedConditions.alertIsPresent()).accept();
	   }
	}



