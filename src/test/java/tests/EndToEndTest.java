package tests;


import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AboutPage;
import pages.CartPage;
import pages.ContactPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SignupPage;


public class EndToEndTest extends BaseTest {
	SignupPage signup;
	   LoginPage login;
	   AboutPage about;
	   ContactPage contact;
	   ProductPage product;
	   CartPage cart;
	   @Test(priority = 1)
	   public void verifyHomePage() {
	       Assert.assertTrue(driver.getTitle().contains("STORE"));
	      
	   }
	   @Test(priority = 2)
	   public void signupTest() {
	       signup = new SignupPage(driver, wait);
	       signup.signup(prop.getProperty("username"), prop.getProperty("password"));
	   }
	   @Test(priority = 3)
	   public void loginTest() {
	       login = new LoginPage(driver, wait);
	       login.login(prop.getProperty("username"), prop.getProperty("password"));
	   }
	   @Test(priority = 4)
	   public void aboutTest() throws Exception {
	       about = new AboutPage(driver, wait);
	       about.playVideo();
	   }
	   @Test(priority = 5)
	   public void contactTest() {
	       contact = new ContactPage(driver, wait);
	       contact.sendMessage();
	   }
	   @Test(priority = 6)
	   public void productTest() {
	       product = new ProductPage(driver, wait);
	       product.selectLaptopAndAddToCart();
	   }
	   @Test(priority = 7)
	   public void cartTest() {
	       cart = new CartPage(driver, wait);
	       cart.placeOrder();
	   }
	}

