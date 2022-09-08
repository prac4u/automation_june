package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import constants.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginTest()
	{
		String expected = "PIM";
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		String actual = homePage.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyLoginPageTitle()
	{
		String actual = loginPage.getPageTitle();
		Assert.assertEquals(actual, Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test
	public void usernamePresence()
	{
		boolean actual = loginPage.isUsernamePresent();
		Assert.assertEquals(actual, true);
	}
	

}
