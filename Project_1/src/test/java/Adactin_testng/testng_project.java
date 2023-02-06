package Adactin_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng_project {
	public WebDriver driver;
	@Test(priority = -2)
public void Setproperty() {
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\chromeDriver\\chromedriver.exe");
}
	@Test(priority = -1)
public void Browser_launch() {
        driver = new ChromeDriver();
}
	@Test
public void get_url() {
    driver.get("https://adactinhotelapp.com");
    driver.manage().window().maximize();
    }
	@Test(priority = 1, invocationCount = 3)
public void Refresh() {
driver.navigate().refresh();
}
	@Test(priority = 2)
public void login() {
driver.findElement(By.id("username")).sendKeys("vktjyoshna");
driver.findElement(By.id("password")).sendKeys("Sujyo@22");
}
	@Test(priority = 3)
public void click() {
driver.findElement(By.id("login")).click();
}
}
