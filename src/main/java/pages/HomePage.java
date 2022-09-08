package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.StringUtil;



public class HomePage {
	
	
	@FindBy(className = "oxd-userdropdown-name")
	WebElement username;
	
	@FindBy(xpath = "//span[contains(@class, 'oxd-main-menu-item--name')]")
	List<WebElement> menuItemNames;
	
	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6")
	WebElement pageHeader;
	
	
	@FindBy(xpath = "//span[text()='Leave']")
	WebElement leaveButton;
	
	String xpath = "//li[text()='RANDOM']";
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageActions
	
	public String getUsername()
	{
		
		String user =username.getText();
	
		
		return user;
	}
	
	
	public String getTitle()
	{
		
		
		String title = pageHeader.getText();
		
		
		return title;
	}
	
	
	public List<String> getMenuItems()
	{
	
		List<String> names = new ArrayList();
		
		
		for(WebElement e:  menuItemNames)
		{
			 names.add(e.getText());
		}
		
		
		return names;
	}
	
	
	public void selectDate(String date, String month, String year)
	{
		driver.findElement(By.xpath(StringUtil.getNewXpath(xpath, date)));
	}

	
	public LeavePage navigateToLeavePage()
	{
		leaveButton.click();
		return new LeavePage(driver);
	}
}
