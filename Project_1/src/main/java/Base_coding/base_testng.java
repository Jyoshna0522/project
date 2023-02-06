package Base_coding; 

import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class base_testng extends base_class{
@Test(priority = 0)
public static void step_1() throws Throwable {
	Browser_launching();
	driver.get("https://www.instagram.com");
	Window_Maximaization();
	Thread.sleep(3000);
	driver.quit();
}
@Test(priority = 1, invocationCount = 2)
public static void facebbok() {
	Browser_launching();
driver.get("https://www.zalando.dk");
Window_Maximaization();
}
@Test(priority = 2 , invocationCount = 1 , invocationTimeOut = 12000)
public static void navigation() throws Throwable {
 navigate_to("https://www.instagram.com");
 
 Forward_method();
 back_method();
 refresh();
 navigate_to("https://adactinhotelapp.com");
 
 
 
}
}
