package Adactin;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mini_project {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
    			"C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("Jyoshnasuresh");
		WebElement PSWD = driver.findElement(By.id("password"));
		PSWD.sendKeys("Sujyo@05");
		WebElement LGN = driver.findElement(By.id("login"));
		LGN.click();
		System.out.println("***************** Single dropdown*****************");
		//single dropdown
		WebElement location = driver.findElement(By.id("location"));
		Select location_select = new Select(location);
		location_select.selectByValue("Brisbane");
		WebElement hostel = driver.findElement(By.id("hotels"));
		Select hostel_select =new Select(hostel);
		hostel_select.selectByVisibleText("Hotel Sunshine");
		WebElement room = driver.findElement(By.name("room_type"));
		Select room_select =new Select(room);
		room_select.selectByIndex(2);
		WebElement No_of_rooms = driver.findElement(By.id("room_nos"));
		Select No_of_room_select =new Select(No_of_rooms);
		WebElement start_date = driver.findElement(By.id("datepick_in"));
		start_date.clear();
		start_date.sendKeys("05/08/2022");
        WebElement end_date = driver.findElement(By.id("datepick_out"));
        end_date.clear();
        end_date.sendKeys("10/08/2022");
       WebElement adult_no = driver.findElement(By.id("adult_room"));
       Select adult_No_select = new Select(adult_no);
       adult_No_select.selectByVisibleText("2 - Two");
       WebElement child_no = driver.findElement(By.name("child_room"));
       Select Child_no_select = new Select(child_no);
       Child_no_select.selectByVisibleText("4 - Four");
       WebElement search = driver.findElement(By.id("Submit"));
       search.click();
    WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
     logout.click();
	}
}
//     TakesScreenshot screenshot =(TakesScreenshot) driver;
//     File source = screenshot.getScreenshotAs(OutputType.FILE);
//     File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\Screenshot\\screenshot3.png");
//     FileUtils.copyFile(source, destination);
//     WebElement login_again = driver.findElement(By.xpath("//a[@href='index.php']"));
     