package Runner;


import Base_coding.base_class;
import Base_coding.page_obj_method;

public class Runner_pom extends base_class{

  public static void sigin() {
Browser_launching();
Window_Maximaization();
get_url("https://www.instagram.com");
page_obj_method ss = new page_obj_method(driver);
allow_page(ss.getAllow_page());
loginToApplication(ss.getEmail());
loginToApplication(ss.getPassword());
click(ss.getClick());
	
	}
  public static void main(String[] args) {
	  sigin();
	
}
}

