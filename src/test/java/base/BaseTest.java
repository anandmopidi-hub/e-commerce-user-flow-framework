package base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver;
	   public WebDriverWait wait;
	   public Properties prop;
	   @BeforeMethod
	   public void setup() throws Exception {
	       prop = new Properties();
	       FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	       prop.load(fis);
	       ChromeOptions options = new ChromeOptions();
	       Map<String, Object> prefs = new HashMap<>();
	       prefs.put("credentials_enable_service", false);
	       prefs.put("profile.password_manager_enabled", false);
	       prefs.put("profile.password_manager_leak_detection", false);
	       options.setExperimentalOption("prefs", prefs);
	       driver = new ChromeDriver(options);
	       driver.manage().window().maximize();
	       driver.get(prop.getProperty("url"));
	       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   }
	   @AfterMethod
	   public void tearDown() {
	       driver.quit();
	   }	
}
