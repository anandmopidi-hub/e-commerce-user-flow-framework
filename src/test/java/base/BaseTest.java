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
	     
	    // New code for GitHub Actions
	       ChromeOptions options1 = new ChromeOptions();
	       options1.addArguments("--headless=new"); // Run without a window
	       options1.addArguments("--no-sandbox"); // Required for Linux
	       options1.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
	       options1.addArguments("--window-size=1920,1080"); // Set a virtual screen size

	       driver = new ChromeDriver(options1);
	       driver.manage().window().maximize();
	       driver.get(prop.getProperty("url"));
	       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   }
	   @AfterMethod
	   public void tearDown() {
	       driver.quit();
	   }	
}
