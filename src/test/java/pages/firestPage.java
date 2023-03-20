package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class firestPage {

	private WebDriver driver;

	public firestPage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
}
