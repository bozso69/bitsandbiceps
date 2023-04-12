package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Utils.Util;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.firestPage;

public class firestPagesTest {

	@Severity(SeverityLevel.CRITICAL)
	@Test
	@Tag("Regression")
	@DisplayName("Bit - 002.1 - Front Page oldal felírat ellenőrzés")
	// @Disabled()	
	@Order(1)
	@Tag("FirestPage")	
	void Bit_002_1(){
		Util util = new Util();
		
		WebDriver driver = util.start();
		firestPage firestPage = new firestPage(driver);

		assertThat(firestPage.isRegistertab());
		
		util.end(0, driver);
		
		
	}
}
