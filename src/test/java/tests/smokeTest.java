package tests;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.firestPage;


public class smokeTest{
	
	
	@Severity(SeverityLevel.CRITICAL)
	@Test
	@Tag("Regression")
	@DisplayName("Bit - 001.1 : Smoke test")
	// @Disabled()	
	@Order(1)
	void Bit_001_1() {
		
	Util util = new Util();	
		
		WebDriver driver = util.start();
		
		util.end(0, driver);
	}


}
