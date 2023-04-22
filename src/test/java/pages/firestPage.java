package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class firestPage {

	private WebDriver driver;

@FindBy(xpath = "//img[@src='/static/images/barbell_notes_horizontal_white.png']")
WebElement pngBarbel;
	
	public firestPage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	/**Annak ellenőrzése, hogy a "Register" tab megjelen-e*/
	public boolean isRegistertab() {
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.elementToBeClickable(pngBarbel)).isEnabled();			 	 
	}

	}
