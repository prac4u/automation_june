package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	
	WebDriver driver;
	By selectEmployee = By.xpath("//h6[text()='Select Employee']");
	
	
	public TimePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	//PageActions
}
