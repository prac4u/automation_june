package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(tagName = "button")
	WebElement loginButton;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	

	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public HomePage login(String username, String pass)
	{
		enterUsername(username);
		enterPassword(pass);
		clickLoginButton();
		return new HomePage(driver);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isUsernamePresent()
	{
		return username.isDisplayed();
	}

}
