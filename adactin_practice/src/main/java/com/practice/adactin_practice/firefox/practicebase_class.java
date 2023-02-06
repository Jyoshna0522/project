package com.practice.adactin_practice.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practicebase_class {
public static WebDriver driver;
public static void Browser_lauch(String value) {
	 if (value.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\Admin\\eclipse-workspace\\selenium\\adactin_practice\\pom.xml");
	 
	  driver = new ChromeDriver();
	 }else if (value.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\selenium\\adactin_practice\\src\\firefox\\Firefox Installer.exe");
		driver = new FirefoxDriver();
	 }
	 }
	 public static void window_maximization() {
		 driver.manage().window().maximize();
	}
	 public static void get_url(String url) {
		 driver.get("url");
}
}
