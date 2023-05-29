package Utils;

import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import pages.LandingPage;

public class Util {
	
	private static final String Url  = "https://www.bitsandbiceps.xyz/";
	private static final String UrlApp = "https://www.bitsandbiceps.xyz/app/access";

	public WebDriver start() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	/** Nulla esetén nem zárja le az oldalt. Minden más értéknél lezárja
	 * 
	 * @param i 0 - brosert bezárja  vagy !0 - browsert NEM zárja be
	 * @param driver
	 */
	public void end(int i, WebDriver driver) {
		if (i == 0) {
			driver.quit();
			
		}
		
	}
	/** Az oldal kiindulópontja a gyökér/app oldalon van
	 * */
	
	
	public WebDriver startApp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(UrlApp);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	public void login(String userName, String password, WebDriver driver) {
		LandingPage landingPage = new LandingPage(driver);
		pages.login login = new pages.login(driver);
		
		landingPage.clickLogInButton();
		
		login.setUserNameInputMezo(userName);
		login.setPasswordInputMezo(password);
		
		login.clickLoginButton();
	}
	
}
