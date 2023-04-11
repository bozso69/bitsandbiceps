package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import bitUtils.bitWebDriver;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class firestPagesTest {

	@Severity(SeverityLevel.CRITICAL)
	@Test
	@Tag("Regression")
	@DisplayName("Bit - 002.1 - Front Page oldal felírat ellenőrzés")
	// @Disabled()	
	@Order(1)
	@Tag("FirestPage")	
	@Tag("ZoltanTest")	
	void Bit_002_1(){
		bitWebDriver bitWebDriver = new bitWebDriver();
	
		
		WebDriver driver = bitWebDriver.weblapElerese();
		
		bitWebDriver.lezaras(1, driver);
		
		
	}
}
