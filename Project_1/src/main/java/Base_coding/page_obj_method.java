package Base_coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class page_obj_method {
	public static WebDriver driver;
	@FindBy(xpath="//button[@class='_a9-- _a9_0']")
	private   WebElement allow_page;

	public  WebElement getAllow_page() {
		return allow_page;
	}
	@FindBy(name="username")
	private WebElement email;
	
	@FindBy(name="password")
	private  WebElement password;
	@FindBy(xpath="//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")
	private  WebElement click;

	public  WebElement getEmail() {
		return email;
	}
	public  WebElement getPassword() {
		return password;
	}
	public  WebElement getClick() {
		return click;
	}
	
	public page_obj_method(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);
}
	}
		
		




 