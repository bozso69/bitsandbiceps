package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;

import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.LandingPage;

public class LandingpageTest {

	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.1 - Landing Page eleme ellenőrzése")
	// @Disabled()	
	@Order(1)
	void Bit_002_1(){
		
		Util util = new Util();
		
		WebDriver driver = util.start();
		LandingPage landingPage = new LandingPage(driver);
		
		List<String> expectedTextsOnWindow = new ArrayList<>();
		
		
		expectedTextsOnWindow.add(" Get Started For Free");
		
		expectedTextsOnWindow.add("Bringing Data to everyday lifting");
		expectedTextsOnWindow.add("Take your performance to the next level");
		
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		util.end(0, driver);
		
		
	}
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.2 - Landing Page Menü elemei")
	//@Disabled()	
	@Order(2)
	void Bit_002_2() {
		Util util = new Util();
		WebDriver driver = util.start();
		
		List<String> expectedTextsOnWindow  = new ArrayList<>();
			expectedTextsOnWindow.add("Features");
			expectedTextsOnWindow.add("Prices");
			expectedTextsOnWindow.add("Blog");
			expectedTextsOnWindow.add("Log in");
			expectedTextsOnWindow.add("Get Started For Free");
		
    assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
	
    util.end(0, driver);
	}
	
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.3 - Features Főcim elemei")
	//@Disabled()	
	@Order(3)
	void Bit_002_3() {
		Util util = new Util();
		WebDriver driver = util.start();
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.clickFeaturesButton();
		List<String> expectedTextsOnWindow  = new ArrayList<>();
		expectedTextsOnWindow.add("Features");
		expectedTextsOnWindow.add("Interactive Analytics");
		expectedTextsOnWindow.add("Live Tracker");
		expectedTextsOnWindow.add("Team Management");
		expectedTextsOnWindow.add("Individualized Workouts");
		expectedTextsOnWindow.add("Cycle Planner");
	
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		
		util.end(0, driver);
	}
	
}
