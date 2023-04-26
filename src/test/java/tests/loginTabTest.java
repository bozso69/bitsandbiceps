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
import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.loginTabPage;

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
		
		WebDriver driver = util.startApp();
		loginTabPage loginTabPage = new loginTabPage(driver);
	
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
		WebDriver driver = util.startApp();
		loginTabPage loginTabPage = new loginTabPage(driver);
		
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
	@Tag("ZoltanTest")
	void Bit_004_21() {
		Util util = new Util();
		WebDriver driver = util.startApp();
		loginTabPage loginTabPage = new loginTabPage(driver);
		
		loginTabPage.clickUserNameInput();
		loginTabPage.clickPasswodInput();
		
		loginTabPage.clickUserNameInput();
		
		SoftAssertions contentAssert = new SoftAssertions();	
		contentAssert.assertThat(loginTabPage.getUserNameUnderkTxt().getText())
				.isEqualToIgnoringCase("Required.");
		contentAssert.assertAll();
		
			
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
	@Order(3)
	void Bit_004_3() {
		
	}
	
	
}
