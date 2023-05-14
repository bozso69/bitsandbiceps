package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
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
import pages.login;

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
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.4 - Prices Főcim elemei")
	//@Disabled()	
	@Order(4)
	void Bit_002_4() {
		Util util = new Util();
		WebDriver driver = util.start();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickFeaturesPricesButton();
		
		List<String> expectedTextsOnWindow  = new ArrayList<>();
		expectedTextsOnWindow.add("5 kg Plan");
		expectedTextsOnWindow.add("10 kg Plan ");
		expectedTextsOnWindow.add("20 kg Plan ");
		
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		util.end(0, driver);
	}
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.5 - Blog Főcim elemei")
	//@Disabled()	
	@Order(5)
	void Bit_2_5() {
		Util util = new Util();
		WebDriver driver = util.start();
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.clickBlogButton();
		List<String> expectedTextsOnWindow  = new ArrayList<>();
		expectedTextsOnWindow.add("The intuitive coach");
		expectedTextsOnWindow.add("Part one of our series on various coaching styles");
		expectedTextsOnWindow.add("Which type of coach are you?");
		expectedTextsOnWindow.add("Part Two: When Numbers Lead The Dance");
		expectedTextsOnWindow.add("The Science and Art of Coaching Weightlifting");
		expectedTextsOnWindow.add("on coaching styles - part three");
		
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		
		util.end(0, driver);
	}
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.6 - Log In")
	//@Disabled()	
	@Order(6)
	void Bit_002_6() {
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
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 002.8 - A landing page lábléc")
	//@Disabled()	
	@Order(7)
	void Bit_002_7() {
		Util util = new Util();
		WebDriver driver = util.start();
		LandingPage landingPage = new LandingPage(driver);
		
		List<String> expectedTextsOnWindow  = new ArrayList<>();
		expectedTextsOnWindow.add(" Get Started For Free");
		expectedTextsOnWindow.add("Contact Us");
		
		expectedTextsOnWindow.add("Address");
		expectedTextsOnWindow.add("2330 Dunaharaszti, Hungary, Vörösmarty M. u. 55.");
		
		expectedTextsOnWindow.add("Email");
		expectedTextsOnWindow.add("info@barbellnotes.com");
		
		expectedTextsOnWindow.add("Tax Number");
		expectedTextsOnWindow.add("12345678-1-41");
		
		expectedTextsOnWindow.add("Company");
		expectedTextsOnWindow.add("Barbell Notes Ltd.");
		
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		
		util.end(0, driver);
	}
}
