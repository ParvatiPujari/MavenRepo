package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyHomePage {
	
	@Test
	public void VerifyHP() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".home")).isDisplayed();
		
	}

}
