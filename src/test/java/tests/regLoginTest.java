package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.LandingPage;

public class regLoginTest {
	@Severity(SeverityLevel.CRITICAL)

	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)
	@Tag("Regression")
	@DisplayName("Bit - 003.1 - Regisztráció / Login oldal betöltése")
	// @Disabled()	
	@Order(1)
	
	void Bit_003_1(){
		Util util = new Util();
		WebDriver driver = util.start();
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.clickLogInButton();
		
List<String> expectedTextsOnWindow  = new ArrayList<>();
		
		
		expectedTextsOnWindow.add("Log In");
		expectedTextsOnWindow.add("Register");
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		util.end(0, driver);
	}

}
