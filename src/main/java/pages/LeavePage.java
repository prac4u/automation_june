package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;
	
	@FindBy(xpath = "//button[@type='reset']")
	WebElement resetButton;
	
	WebDriver driver;
	
	
	public LeavePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isResetButtonPreset()
	{
		return resetButton.isDisplayed();
	}
	
	public boolean isSearchButtonPreset()
	{
		return resetButton.isDisplayed();
	}
	
	

}
