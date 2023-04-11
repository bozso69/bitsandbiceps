package setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverSetting {

	public WebDriver driverSetting() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.bitsandbiceps.xyz/");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
	}


}
