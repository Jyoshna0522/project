package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Browser_launch {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		 //day 1 class-web-launch and navigate methods
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\chromeDriver\\chromedriver.exe");//(string key,string value);
      
            //webDriver refName= new chromeDriver();
      WebDriver driver = new ChromeDriver();//upCasting
       
       driver.get("https://demo.automationtesting.in/Frames.html");
//     driver.manage().window().maximize();
//     driver.navigate().to("https://www.youtube.com/");
//     driver.navigate().back();
//     driver.navigate().forward();
//     driver.navigate().refresh();
       
       //day 4 & 5 class-create account
		
//       System.setProperty("webdriver.chrome.driver", 
//    			"C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\chromeDriver\\chromedriver.exe");//(string key,string value);
//    	      
//       WebDriver driver = new ChromeDriver();//upCasting
//       driver.get("https://www.facebook.com/");
//       WebElement Create_account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//       Create_account.click();
//       Thread.sleep(3000);
//       WebElement firstname = driver.findElement(By.name("firstname"));
//       firstname.sendKeys("jyoshna");
//       WebElement surname = driver.findElement(By.name("lastname"));
//       surname.sendKeys("kamatham");
//       WebElement emailid = driver.findElement(By.name("reg_email__"));
//       emailid.sendKeys("kamathamjyoshna@gmail.com");
//       WebElement re_enteremail = driver.findElement(By.name("reg_email_confirmation__"));
//       re_enteremail.sendKeys("kamathamjyoshna@gmail");
//       WebElement password = driver.findElement(By.id("password_step_input"));
//       password.sendKeys("1234567@cbcz");
//       WebElement gender = driver.findElement(By.name("sex"));
//       gender.click();
//       // 
//    // we can use single dropdown method to select DOB
//       WebElement day = driver.findElement(By.id("day"));
//       Select day_of_date =new Select(day);
//       day_of_date.selectByIndex(21);
//       WebElement month = driver.findElement(By.id("month"));
//       Select day_of_month= new Select(month);
//       day_of_month.selectByValue("12");
//       WebElement year = driver.findElement(By.id("year"));
//       Select day_of_year= new Select(year);
//       day_of_year.selectByVisibleText("1998");
//       WebElement signup = driver.findElement(By.name("websubmit"));
//       signup.click();
       
//       //Takesscreenshot refName=(TakesScreenshot) driver(refName)
//       TakesScreenshot screenshot=(TakesScreenshot) driver;
//       File source = screenshot.getScreenshotAs(OutputType.FILE);
//       File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\Screenshot\\screenshot2.png");
//      FileUtils.copyFile(source, destination);
       
       //NOTE: selectByValue/selectByVisibleText both are same we can use string ("") and for selectByIndex we can use integer().
       
//       WebElement facebookid = driver.findElement(By.id("email"));
//     facebookid.sendKeys("james@gmail.com");
//     WebElement password = driver.findElement(By.name("pass"));
//     password.sendKeys("123456@a");
//     WebElement login = driver.findElement(By.name("login"));
//     login.click();
    
       

//       WebElement facebookid = driver.findElement(By.id("email"));
//       facebookid.sendKeys("james@gmail.com");
//       WebElement password = driver.findElement(By.name("pass"));
//       password.sendKeys("123456@a");
//       WebElement login = driver.findElement(By.name("login"));
//       login.click();
          //driver.get("https://www.amazon.in/");
//      driver.manage().window().maximize();
//      driver.navigate().to("https://www.youtube.com/");
//      driver.navigate().back();
//      driver.navigate().forward();
//      driver.navigate().refresh();
      
       //minimize method
      
//      Dimension d= new Dimension(250,300);
//      driver.manage().window().setSize(d);
//      Point p = new Point(300,400);
//      driver.manage().window().setPosition(p);
//     String title = driver.getTitle();
//     System.out.println("title of the page");
//     String currentUrl = driver.getCurrentUrl(); 
//     System.out.println("currentUrl");
//     String pageSource = driver.getPageSource();
//     System.out.println("pageSource");

          //FaceBook login
       
     //  WebDriver driver = new ChromeDriver();//upCasting
      // driver.get("https://www.facebook.com/");

//      WebElement facebookid = driver.findElement(By.id("email"));
//       facebookid.sendKeys("james@gmail.com");
//       WebElement password = driver.findElement(By.name("pass"));
//       password.sendKeys("123456@a");
//       WebElement login = driver.findElement(By.name("login"));
//       login.click();
       
       
       //day 8: Alert  URL(https://demo.automationtesting.in/Alerts.html)
       
       //simple alert
//       
//       WebElement simple = driver.findElement(By.xpath("//a[@href='#OKTab']"));
//       simple.click();
//       
//       WebElement simple_type = driver.findElement(By.xpath("// button[@class='btn btn-danger']"));
//       simple_type.click();
//       driver.switchTo().alert().accept();
//       
//       //******************confirm alert *******************
//       
//       WebElement confirm = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
//       confirm.click();
//
//        driver.findElement(By.xpath("// button[@class='btn btn-primary']")).click();
//       // driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
       
       // *************prompt alert*******************
       
//        WebElement text = driver.findElement(By.xpath("//a[@href='#Textbox']"));
//        text.click();
//        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//        driver.switchTo().alert().getText();
//        driver.switchTo().alert().sendKeys("jyoshna suresh");
//        driver.switchTo().alert().accept();
//        
//        TakesScreenshot screenshot =(TakesScreenshot) driver;
//        File source = screenshot.getScreenshotAs(OutputType.FILE);
//        File destination =new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\Screenshot\\screenshot6.png");
//        FileUtils.copyFile(source, destination);
        
       //day 10: Actions URL (http://www.leafground.com/pages/drop.html)
		
           // Actions a = new Actions(driver);
//		WebElement from_element = driver.findElement(By.id("draggable"));
//		WebElement to_element = driver.findElement(By.id("droppable"));
//		// a.dragAndDrop(from_element, to_element).build().perform();
//		a.clickAndHold(from_element).build().perform();
//		a.moveToElement(from_element);
//		a.release(to_element);
//		TakesScreenshot screenshot =(TakesScreenshot) driver;
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\Screenshot\\screenshot5.png");
//		FileUtils.copyFile(source, destination);
      
       // WebElement books = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));//right click
        //  a.contextClick(books).build().perform();
//          TakesScreenshot screenshot =(TakesScreenshot) driver;
//  		File source = screenshot.getScreenshotAs(OutputType.FILE);
//  		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\selenium\\Screenshot\\screenshot5.png");
//  		FileUtils.copyFile(source, destination);
       
          //day 11: robot URL(https://www.amazon.in/)
       
       //syntax:  robot refName = new robot();

//        Actions a = new Actions(driver);
//        WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
//        a.contextClick(mobile).build().perform();
       
//       Robot r = new Robot();
//       r.keyPress(KeyEvent.VK_DOWN);
//       r.keyRelease(KeyEvent.VK_DOWN);
//       r.keyPress(KeyEvent.VK_ENTER);
//       r.keyRelease(KeyEvent.VK_ENTER);
//       
//       WebElement today_deal = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
//       a.contextClick(today_deal).build().perform();
//       r.keyPress(KeyEvent.VK_DOWN);
//       r.keyRelease(KeyEvent.VK_DOWN);
//       r.keyPress(KeyEvent.VK_ENTER);
//       r.keyRelease(KeyEvent.VK_ENTER);
//       WebElement book = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
//       a.contextClick(book).build().perform();
//       r.keyPress(KeyEvent.VK_DOWN);
//       //r.keyPress(KeyEvent.VK_DOWN);
//       r.keyRelease(KeyEvent.VK_DOWN);
//       r.keyPress(KeyEvent.VK_ENTER);
//       r.keyRelease(KeyEvent.VK_ENTER);
       WebElement single_frame = driver.findElement(By.id("singleframe"));
    driver.switchTo().frame(single_frame);
    Thread.sleep(3000);
    WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
    text.sendKeys("selenium");
    driver.switchTo().defaultContent();
    Thread.sleep(3000);
    WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
    multi.click();
       
       
       

       
        
     
	}
	

}
