package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LeavePage;

public class LeavePageTest extends BaseTest{

	
	
	@Test
	public void isResetButtonPreset()
	{
		LeavePage leavePage = homePage.navigateToLeavePage();
		Assert.assertEquals(leavePage.isResetButtonPreset(), true);
	}
	
	
	@Test
	public void isSearchButtonPreset()
	{
		LeavePage leavePage = homePage.navigateToLeavePage();
		Assert.assertEquals(leavePage.isSearchButtonPreset(), true);
	}
}
