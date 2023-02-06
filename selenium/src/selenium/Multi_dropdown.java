package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
    			"C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\chromeDriver\\chromedriver.exe");//(string key,string value);
    	      
       WebDriver driver = new ChromeDriver();//upCasting
       driver.get("http://www.leafground.com/pages/Dropdown.html");
    WebElement multi = driver.findElement(By.xpath("(//option)[26]"));
     Select s= new Select(multi);
     s.selectByValue("2");
     s.selectByIndex(1);
     s.selectByVisibleText("Loadrunner");
     boolean multiple = s.isMultiple();
     System.out.println("To check isMultiple :"  +multiple);
     List<WebElement> options = s.getOptions();
     for (WebElement object : options)
     {
    	 System.out.println(object.getText());
     }
	
	}
     
 
	}


