package tests;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.firestPage;
import setting.driverSetting;


public class smoke{
	
	
	@Severity(SeverityLevel.CRITICAL)
	@Test
	@Tag("Regressio")
	@Tag("FirestPage")
	@DisplayName("Bit - 001 : Smoke test")
	// @Disabled()	
	@Order(1)
	@Tag("ZoltanTest")	
	void bit_001() {
		WebDriver driver = driverSetting();
		firestPage firestPage = new firestPage(driver);
		
		driver.quit();
	}

	private WebDriver driverSetting() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.bitsandbiceps.xyz/");
		return driver;
	}

	

	



}
