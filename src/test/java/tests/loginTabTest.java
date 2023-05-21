package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.assertj.core.api.SoftAssertions;
import org.checkerframework.checker.units.qual.Length;

import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.LandingPage;
import pages.login;

public class loginTabTest {
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 004.1 - Login Tab elemek ellenőrzése")
	// @Disabled()	
	@Order(1)
	void bit_004_1() {
		Util util = new Util();
		
		WebDriver driver = util.start();
		login loginTabPage = new login(driver);
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.clickLogInButton();
		
		assertThat(loginTabPage.isLoginTab().isDisplayed());
		assertThat(loginTabPage.isRegisterTab().isDisplayed());
		
		List<String> expectedTextsOnWindow  = new ArrayList<>();
		
		
		expectedTextsOnWindow.add("Don't have an account yet?! Switch tabs to register!");
		expectedTextsOnWindow.add("Forgot your password?");
		assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
		
		assertThat(loginTabPage.isUserNameInput().isDisplayed());
		assertThat(loginTabPage.isPasswordInput().isDisplayed());
		
		assertThat(loginTabPage.isLoginButton().isDisplayed());
		util.end(0, driver);
	}
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 004.2 - Login beviteli mezők ellenőrzése")
	// @Disabled()	
	@Order(2)
	void Bit_004_2() {
		Util util = new Util();
		WebDriver driver = util.start();
		login loginTabPage = new login(driver);
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.clickLogInButton();
		
		assertThat(loginTabPage.isUserNameInput().isDisplayed());
		assertThat(loginTabPage.isPasswordInput().isDisplayed());
		assertThat(loginTabPage.isLoginButton().isDisplayed());
		
		util.end(0, driver);
		
		
	}
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 004.21 - User name és a Password mezők ütessen hagyása.")
	//@Disabled()	
	@Order(3)
	void Bit_004_21() {
		Util util = new Util();
		WebDriver driver = util.start();
		
		
		login loginTabPage = new login(driver);
		

		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLogInButton();
		
		loginTabPage.clickUserNameInput();
		loginTabPage.clickPasswodInput();
		
		
		SoftAssertions contentAssert = new SoftAssertions();	
		contentAssert.assertThat(loginTabPage.getUserNameUnderkTxt().getText())
				.isEqualToIgnoringCase("Required.");
		contentAssert.assertAll();
		
		loginTabPage.clickUserNameInput();
			
		contentAssert.assertThat(loginTabPage.getPasswordUnderkTxt().getText())
				.isEqualToIgnoringCase("Required.");
		contentAssert.assertAll();
		
		
		util.end(0, driver);
	}
	
	
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 004.3 - Hibás login / password hibaüzenet")
	@Disabled()	
	@Order(4)
	void Bit_004_3() {}
	
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 004.4- Többszöri hibás login / password hibaüzenet")
	@Disabled()	
	@Order(5)
	void Bit_004_4() {}
	
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 004.5- Sikeres belépés az oldalra")
	//@Disabled()	
	@Order(6)
	void Bit_004_5() {
		Util util = new Util();
		WebDriver driver = util.startApp();
		login loginTabPage = new login(driver);		
		
		
		assertThat(loginTabPage.isUserNameInput().isDisplayed());
		assertThat(loginTabPage.isPasswordInput().isDisplayed());
		
		loginTabPage.setUserNameInputMezo("TestAthlete1");
		loginTabPage.setPasswordInputMezo("Albert123");
		
		assertThat(loginTabPage.isLoginButton().isDisplayed());
		loginTabPage.clickLoginButton();
		
		util.end(0, driver);
	}
		
		
		
		
		
		
}
