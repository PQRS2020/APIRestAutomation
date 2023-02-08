package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hrmPages.HomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginApplicationWithPO extends PageObject {

	@Managed
	WebDriver driver;
	
	@Steps
	HomePage home;
	
	@Test
	public void loginAsAdmin() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		home.verifyTitle();
		home.enterCredentials();
		home.verifyDashboard();
	}
}
