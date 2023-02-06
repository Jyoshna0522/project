package practicebaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice_baseclass {
	public static WebDriver driver;
	public static void Launching_browser(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\Chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		}else if (value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\firefox\\Firefox Installer.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
public static void get_url(String url) {
    driver.get(url);
}
}
