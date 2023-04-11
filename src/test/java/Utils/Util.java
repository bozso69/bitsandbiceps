package Utils;

import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Util {
	
	String url = "https://www.bitsandbiceps.xyz/";

	public WebDriver start() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(url);
		return driver;
	}
	//* Nulla esetén nem zárja le az oldalt. Minden más értéknél lezárja
	public void end(int i, WebDriver driver) {
		if (i == 0) {
			driver.quit();
			
		}
		
	}

}
