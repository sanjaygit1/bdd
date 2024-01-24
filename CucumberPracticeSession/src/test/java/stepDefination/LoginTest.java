package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver driver;
	
	
	
//	@Given("launch the browser")
//	public void launch_the_browser() {
//	   driver=new ChromeDriver();
//	}
//	@When("user enters facebook url")
//	public void user_enters_facebook_url() {
//	    driver.get("https://www.facebook.com");
//	}
//	@Then("Facebook login page should be displayed")
//	public void facebook_login_page_should_be_displayed() {
//	   String title = driver.getTitle();
//	   Assert.assertEquals(title, "log in");
//	}
	//hooks
	@Before("@smokeTest")
	public void launchbrowser_and_logintoApplication_with_chrome()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@After("@smokeTest,@RegTest")
	public void closebrowser()
	{
		driver.quit();
	}
	
	@Before("@RegTest")
	public void launchbrowser_and_logintoApplication_with_firefox()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	

	@Given("user is on facebook loginPage")
	public void user_is_on_facebook_login_page() {
	   System.out.println("user is on login page");
	}
	
	@When("user enters valid username {string} and valid pwd {string}")
	public void user_enters_valid_username_and_valid_pwd(String username, String password) {
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^user enters valid username (.+) and valid pwd (.+)$")
	public void user_enters_valid_username_admin1_and_valid_pwd_admin(String username,String password) 
	{	
		driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);	    
	}
	
	@Then("user click on login btn")
	public void user_click_on_login_btn() {
		driver.findElement(By.name("login")).click();
	}
	
	@Then("homePage should be displayed")
	public void home_page_should_be_displayed() {
	   System.out.println("homepage is displaying");
	}
	
	@Then("notification module should be displayed")
	public void notification_module_should_be_displayed() {
	    System.out.println("notification module is displaying");
	}
}
