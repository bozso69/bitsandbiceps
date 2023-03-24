package tests;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import bitUtils.bitWebDriver;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.firestPage;
import setting.driverSetting;


public class smokeTest{
	
	
	@Severity(SeverityLevel.CRITICAL)
	@Test
	@Tag("Regression")
	@DisplayName("Bit - 001.1 : Smoke test")
	// @Disabled()	
	@Order(1)
	@Tag("Smoke")	
	@Tag("ZoltanTest")	
	void Bit_001_1() {
		
	bitWebDriver bitWebDriver = new bitWebDriver();	
		
		WebDriver driver = bitWebDriver.weblapElerese();
		
		bitWebDriver.lezaras(0, driver);
	}


}