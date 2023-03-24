package bitUtils;

import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class bitWebDriver {
	
	String url = "https://www.bitsandbiceps.xyz/";

	public WebDriver weblapElerese() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(url);
		return driver;
	}

	public void lezaras(int i, WebDriver driver) {
		if (i == 0) {
			driver.quit();
			
		}
		
	}

}
