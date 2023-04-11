package pages;

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


}
