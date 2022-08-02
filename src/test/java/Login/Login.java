package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='txtUsername']")
	private WebElement username;

	@FindBy(xpath = "//*[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='btnLogin']")
	private WebElement btn;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getBtn() {
		return btn;
	}

	public void setBtn(WebElement btn) {
		this.btn = btn;
	}

	public Login(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
