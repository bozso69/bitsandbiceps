package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;

import Utils.Util;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.loginTabPage;

public class regisztraciosTabTest {
	
	@SuppressWarnings("unused")
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	@Tag("Regression")
	@DisplayName("Bit - 005.1- Regisztrációs oldal Smoke teszt")
	//@Disabled()	
	@Order(1)
	@Tag("ZoltanTest")
	void bit_005_1() {
		Util util = new Util();
		
		WebDriver driver = util.startApp();
		loginTabPage loginTabPage = new loginTabPage(driver);
		
		assertThat(loginTabPage.isLoginTab().isDisplayed());
		assertThat(loginTabPage.isRegisterTab().isDisplayed());
		
		util.end(1, driver);
		
		}

}
