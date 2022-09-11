package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {
	
	WebDriver driver;
	By selectEmployee1 = By.xpath("//h6[text()='Select Employee']");
	
	
	public Test(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	

}
