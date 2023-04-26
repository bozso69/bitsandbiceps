package pages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginTabPage {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	/** Log in Tab*/
	@FindBy(xpath = "//div[normalize-space()='Log In']")
	WebElement tbLogin;
	
	/** Register in Tab*/
	@FindBy(xpath = "//div[normalize-space()='Register']")
	WebElement tbRegister;
	
	/**User name beviteli mező*/
	@FindBy(xpath = "//input[@id='input-22']")
	WebElement inpUserName;
	
	/**Password beviteli mező*/
	@FindBy(xpath = "//input[@id='input-25']")
	WebElement inpPassWord;
	
	/**Password Login Bomb*/
	@FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[2]/div/div/form/div/div[3]/button/span")
	WebElement btnLogin;
	
	
	/** User Name alatti felírat*/
	@FindBy(xpath = "//div[@class='v-messages__message']")
	WebElement txtUserNameUnder;
	
	/** User Name alatti felírat*/
	@FindBy(xpath = "//div[@class='v-card__text']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]")
	WebElement txtPasswosdUnder;
	
	
	
	public loginTabPage(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	

	
	/**
	 * Annak ellenőrzése, hogy a 'LOG IN'tab megjelenik e vagy sem
	 * 
	 * 
	 * @return WebElement
	 * 
	 */
	public WebElement isLoginTab() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginTab = wait.until(ExpectedConditions.elementToBeClickable(tbLogin));
		
		return loginTab;
	}
	/**
	 * Annak ellenőrzése, hogy a 'Register'tab megjelenik e vagy sem
	 * 
	 * 
	 * @return WebElement
	 * 
	 */
	public WebElement isRegisterTab() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement regTab = wait.until(ExpectedConditions.elementToBeClickable(tbRegister));
		
	
		
		return regTab;
	}
	
	/**
	 * Annak ellenőrzése, hogy a 'User Name'input mező megjelenik e vagy sem
	 * 
	 * 
	 * @return WebElement
	 * 
	 */
	public WebElement isUserNameInput() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userInp = wait.until(ExpectedConditions.elementToBeClickable(inpUserName));
		
	
		
		return userInp;
	}
	/**
	 * Annak ellenőrzése, hogy a 'Password'input mező megjelenik e vagy sem
	 * 
	 * 
	 * @return WebElement
	 * 
	 */
	public WebElement isPasswordInput() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(inpPassWord));
		
	
		
		return elem;
	}
	/**
	 * Annak ellenőrzése, hogy a 'Password'input mező megjelenik e vagy sem
	 * 
	 * 
	 * @return WebElement
	 * 
	 */
	public WebElement isLoginButton() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		
	
		
		return elem;
	}

	/**
	 * Belekattintás a „USER  NAME” beviteli mezőbe
	 * 
	 **/

public void clickUserNameInput() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(inpUserName)).click();
			}
	/**
	 * Belekattintás a „PASSWORD” beviteli mezőbe
	 * 
	 **/

public void clickPasswodInput() {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(inpPassWord)).click();

	
}
/**
 * Visszaadja a 'USER NAME' Input mező alatti szövegt
 * 
 * @return WebElement
 */
public WebElement getUserNameUnderkTxt() {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element = wait.until(ExpectedConditions.visibilityOf(txtUserNameUnder));
	
	return element;					
}

	/**
	 * Visszaadja a 'USER NAME' Input mező alatti szövegt
	 * 
	 * @return WebElement
	 */
public WebElement getPasswordUnderkTxt() {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPasswosdUnder));
	
	return element;		
			
}

}
