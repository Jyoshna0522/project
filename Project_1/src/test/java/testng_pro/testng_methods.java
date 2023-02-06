package testng_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng_methods {

		public static WebDriver driver;
		@Test(priority = -1)
		public void Setproperty() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\chromeDriver\\chromedriver.exe");
		}
		@Test(dependsOnMethods = "Setproperty")
	public void browser_launch() {
		 driver = new ChromeDriver();
		}
		@Test(priority = 1)
		public void Get_url() {
	driver.get("https://www.amazon.com" );
		}
		@Test(priority = 2,enabled = true)
		public void maximization() {
	driver.manage().window().maximize();
		}
		@Test(priority = 2)
		public void navigate() {
	driver.navigate().to("https://www.facebook.com");
		}
		@Test(priority = 3, invocationCount = 3, timeOut = 11000)
		public  void refresh() {
	driver.navigate().refresh();
		}
		@Test(priority = 4, expectedExceptions = ArithmeticException.class)
		public void maths() {
	   int a=10;
	   System.out.println(a/0);
		}
	}


