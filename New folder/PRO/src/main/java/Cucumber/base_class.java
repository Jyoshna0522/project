package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	public static WebDriver driver;

public void Browser_lauching() {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\New folder\\PRO\\Chrome\\chromedriver.exe");
      driver= new ChromeDriver();
}
public void maximization() {
     driver.manage().window().maximize();
}
public void Get_url(String url) {
driver.get(url);
}
public void login() {
WebElement username= driver.findElement(By.id("username"));
username.sendKeys("username");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("password");
WebElement loginbutton = driver.findElement(By.id("login"));
loginbutton.click();
}

}
