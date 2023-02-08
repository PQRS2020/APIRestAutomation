package hrmPages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class orangeHRMHomePage extends PageObject {

	public void verifyTitle()
	{
		String title=getDriver().getTitle();
		Assert.assertTrue(title.contains("OrangeHRM"));
	}
	
	public void enterUsernamePassword()
	{
		WebElementFacade username= $(By.id("txtUsername"));
		username.type("Admin");
		WebElementFacade password= $(By.name("txtPassword"));
		password.typeAndEnter("admin123");
	}
	
	public void verifyLogin()
	{
		String current_url=getDriver().getCurrentUrl();
		Assert.assertTrue(current_url.contains("dashboard"));
	}
}
