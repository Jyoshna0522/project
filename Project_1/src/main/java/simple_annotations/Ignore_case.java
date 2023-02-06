package simple_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_case {
	WebDriver driver;
	@Test (priority = -2)
private void browser() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\chromeDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 System.out.println("browser");
	}
	@Test
	private void geturl() {
   driver.get("https://www.amazon.in");
   System.out.println("geturl");
	}
 @Test(priority = -1)
	private void maximize() {
driver.manage().window().maximize();
System.out.println("maximize");
	}
 @Ignore
 private void mobiles() {
System.out.println("mobiles");
}
 @Test(enabled = false)
 private void kids() {
System.out.println("kids");
}
 @Test(priority = 2)
 private void quit() {
driver.quit();
System.out.println("quit");
}
	


}
