package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




public class regLoginPage {
@SuppressWarnings("unused")
private WebDriver driver;

	public regLoginPage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
}
