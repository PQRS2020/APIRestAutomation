package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MyFirstTestCase {

	@Managed
	WebDriver driver;
	
	@Test
	public void myGoogleSearch() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium with Serenity");
	}
}
