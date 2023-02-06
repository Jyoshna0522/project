package com.Runner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\selenium\\Nyka\\src\\test\\java\\com\\feature\\Nyka.feature",
glue = "com.stepdefinition",
//tags = "@regression",plugin = {"pretty"},
monochrome = true)

public class Runner  {
	public static WebDriver driver;

	public static void Sigin() throws IOException {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\Chrome\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      FileReader file= new FileReader("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Nyka\\conf.property");
      Properties properties= new Properties();
      properties.load(file);
      driver.get(properties.getProperty("url"));
      driver.findElement(By.xpath("//button[@value='1'])[3]")).click();
      
      driver.findElement(By.id("email")).sendKeys(properties.getProperty("username"));
      driver.findElement(By.id("pass")).sendKeys(properties.getProperty("password"));
      
	}
	public static void main(String[] args) throws IOException {
		Sigin();
	}

}
 