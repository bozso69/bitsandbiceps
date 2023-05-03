package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;

import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.login;

public class regisztraciosTabTest {
	
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 005.1- Regisztrációs oldal Smoke teszt")
	//@Disabled()	
	@Order(1)
	void bit_005_1() {
		Util util = new Util();
		
		WebDriver driver = util.startApp();
		login login = new login(driver);
		
		assertThat(login.isLoginTab().isDisplayed());
		assertThat(login.isRegisterTab().isDisplayed());
		
		util.end(0, driver);
		
		}
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 005.2- Regisztrációs oldal Felület teszt")
	//@Disabled()	
	@Order(2)
	@Tag("ZoltanTest")
	void Bit_005_2() {
		
	Util util = new Util();
	WebDriver driver = util.startApp();
	login login = new login(driver);
	List<String> expectedTextsOnWindow = new ArrayList<>();
	
	assertThat(login.isRegisterTab().isDisplayed());
	
	login.clickRegisterTab();
	
	assertThat(login.isAthleteButton().isDisplayed());
	assertThat(login.isCoachButton().isDisplayed());
	
	 
	
	expectedTextsOnWindow.add("I am an Athlete");
	expectedTextsOnWindow.add("I am a Coach");
	
	
assertThat(driver.getPageSource()).contains(expectedTextsOnWindow);
	
	util.end(0, driver);
	}

}
