 package Base_coding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class base_class {
	public static WebDriver driver; // class level declaration

	public static void Browser_launching() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
    }
   public static void Window_Maximaization() {
		driver.manage().window().maximize();
   }
   public static void get_url(String url) {
		driver.get(url);
	}
   public static void allow_page(WebElement cc) {
	   cc.click();

}
   public static void loginToApplication(WebElement aa) {
aa.sendKeys("username","password"); 
}
   public static void click(WebElement bb) {
bb.click();
}
   public static void quit_page() {
		driver.quit();
	}
   public static void close_page() {
		driver.close();
		
     //navigate methods
	}
   public static void navigate_to(String aa) {
   driver.navigate().to(aa);
 
}
   public static void Forward_method() {
   driver.navigate().forward();
}
   public static void back_method() {
   driver.navigate().back();
}
   public static void refresh() {
   driver.navigate().refresh();
   // alert method
   
}
 public static void Alert_method(String cc) {
	 if (cc.equalsIgnoreCase("ok")){
		 driver.switchTo().alert().accept();
	}
	 else if (cc.equalsIgnoreCase("cancel")) {
		driver.switchTo().alert().dismiss();
	}
	 else if (cc.equalsIgnoreCase("data")) {
		 driver.switchTo().alert().sendKeys(cc);
	}
	 else if (cc.equalsIgnoreCase("gettext")) {
		 String abc = driver.switchTo().alert().getText();
		 System.out.println(abc);
		// Actions methods
    }
	 }
}



