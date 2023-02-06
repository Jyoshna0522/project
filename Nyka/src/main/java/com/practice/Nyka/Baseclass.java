package com.practice.Nyka;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Baseclass {
	public static WebDriver driver;
public static void Browser_launch() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\Chrome\\chromedriver.exe");
	driver = new ChromeDriver();
}
public static void Maximization() {
driver.manage().window().maximize(); 
}
public static void get_url(String url) {
driver.get(url);
}
public static void allow_page(WebElement cc) {
	cc.click();
}

public static void signup(WebElement ab, String values) {
	ab.sendKeys(values); 
	}

public static void click_button(WebElement bc) {
	bc.click();
	  
}
public static void Quit_page() {
driver.quit();
}
public static void close() {
driver.close();
}
public static void navigate_to (String url) {
driver.navigate().to(url);
}
public static void navigate_refresh() {
driver.navigate().refresh();
}
public static void navigate_back() {
driver.navigate().back();
}
public static void navigate_forward() {
driver.navigate().forward();
}
public static void Takescreenshot() {
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File source = ts.getScreenshotAs(OutputType.FILE);
//	File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Nyka\\Screenshot//img.png");
//	FileUtils.copyFile(source, destination);
}
}

