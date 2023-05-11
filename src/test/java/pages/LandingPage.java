package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LandingPage {

	private WebDriver driver;

@FindBy(xpath = "//img[@src='/static/images/barbell_notes_horizontal_white.png']")
WebElement pngBarbel;

/*Menu*/

/*Features Menüpont*/
@FindBy(xpath = "//a[normalize-space()='Features']")
WebElement btnFeatures;

/*Features Prices Menüpont*/
@FindBy(xpath = "//a[normalize-space()='Prices']")
WebElement btnPrices;

/*Blog menüpont*/
@FindBy(xpath = "//a[normalize-space()='Blog']")
WebElement btnBlog;

/*Log in menüpont*/
@FindBy(xpath = "//a[normalize-space()='Log in']")
WebElement btnLogIn;

/*Get Started For Free menüpont*/
@FindBy(xpath = "//a[@id='menubtn']")
WebElement btnGetStartedForFree;




	
	public LandingPage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
/** "Features" Menüpontra - Klikkelés*/ 
	public void clickFeaturesButton() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(btnFeatures)).click();
	
}
	/** "Features Prices Menüpont" - Klikkelés*/ 
	public void clickFeaturesPricesButton() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(btnPrices)).click();
	
}
	/** "Blog Menüpont - Klikkelés*/ 
	public void clickBlogButton() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(btnBlog)).click();
	
}
	/** "LOG IN" Menüpont - Klikkelés*/ 
	public void clickLogInButton() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(btnLogIn)).click();
	
}
	/** "Get Started For Free" Menüpont - Klikkelés*/ 
	public void clickGetStartedForFreeButton() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(btnGetStartedForFree)).click();
	
}
	
	
	
}