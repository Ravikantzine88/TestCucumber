package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Login.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	
	WebDriver driver;
	Login lip;

	@Before
	public void seturl() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravik\\eclipse-workspace\\TestCucumber\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^Lounch URL$")
	public void lounch_url() throws Throwable {

		System.out.println("Lounch URL");
	}

//	 @When("^Enter (.+) and (.+)$")
//	    public void enter_and(String username, String password) throws Throwable {
	    	
	 @When("^Enter username and password$")
	  public void enter_username_and_password() throws Throwable {
		lip=new Login(driver);
		Thread.sleep(3000);
		lip.getUsername().sendKeys("Admin");
		Thread.sleep(3000);
		lip.getPassword().sendKeys("admin123");
		System.out.println("Enter username and password");

	}

	@Then("^Click on login$")
	public void click_on_login() throws Throwable {

		System.out.println("Click on login");
		Thread.sleep(3000);
		lip.getBtn().click();
	}

}
