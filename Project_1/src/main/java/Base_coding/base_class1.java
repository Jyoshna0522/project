package Base_coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class base_class1 extends base_class{
	public static void main(String[] args) throws Throwable {
		Browser_launching();
		Window_Maximaization();
		get_url("https://www.instagram.com");
		WebElement allow_page = driver.findElement(By.xpath("//button[@class='_a9-- _a9_0']"));
		allow_page.click();
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("james@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("1234@ghf");
		Thread.sleep(3000);
		WebElement bb = driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']"));
		bb.click();	
		Thread.sleep(4000);
		//driver.quit();
		//driver.close();
		// navigated methods
		navigate_to("https://www.youtube.com");
		back_method();
		Forward_method();
		refresh();
		//driver.quit();  
		driver.close();
		Alert_method("gettext");
		}
}