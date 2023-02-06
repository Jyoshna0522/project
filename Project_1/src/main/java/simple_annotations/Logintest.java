package simple_annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
@Parameters({"browser"})
@Test(priority = 1)
public void launching_browser(@Optional("chrome")String browser) {
System.out.println("Running browser is : "+  "browser");
 
     if (browser.equals("chrome")) {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\chromeDriver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   }
   else if (browser.equals("firefox")) {
	   driver = new FirefoxDriver();
	}
   else if (browser.equals("InternetExplorer")) {
	   driver = new InternetExplorerDriver();
	   }
   else if (browser.equals("safari")){
	   driver = new SafariDriver();
   } 
     driver.get("https://adactinhotelapp.com");
     driver.manage().window().maximize();
}
@Parameters({"username","password", "loginbutton"})
@Test(priority = 2)
public void login( String username,@Optional("Sujyo@0522")String password, String loginbutton){
	System.out.println("username : "+ username +"and password: "+ password +"and click: "+loginbutton);
	driver.findElement(By.name("username")).sendKeys("username");
	driver.findElement(By.name("password")).sendKeys("password");
	driver.findElement(By.id("login")).click();
}
}
