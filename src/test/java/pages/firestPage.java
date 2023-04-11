package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class firestPage {

	private WebDriver driver;

@FindBy(xpath = "//img[@src='/static/images/barbell_notes_horizontal_white.png']")
WebElement pngBarbel;
	
	public firestPage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	/** Annak ellenőrzése, hogy a Barbel PNg megjeleni e vagy sem*/
	public boolean isBarbelPng() {

		List<WebElement> buttons = driver.findElements((By) pngBarbel);
		if (buttons.size() > 0 && buttons.get(0).isDisplayed()) {			
			return true;
		}

		return false;

	}
}
