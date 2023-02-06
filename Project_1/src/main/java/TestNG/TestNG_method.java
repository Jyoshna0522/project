package TestNG;

import java.util.Iterator;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_method {

	@Test (priority = 0)
public static void sigIn() {
	System.out.println("Zalando sigIN");
}
	//public static void main(String[] args) 
	
	@Test(dependsOnMethods = "sigIn")
	public static void login() {
    System.out.println("Zalando login");
	}
	@Test(dependsOnMethods = "login")
	public static void email() {
    System.out.println("jyoshna@gmail.com");
	}
	@Ignore
	public static void password() {
		System.out.println("1235@05");
	}
	@Test
	public static void click() {
    System.out.println("click login button");	
    }
	@Test(enabled = true)
	public static void zalando_page() {
    System.out.println("open URL");
	}
	
	@Test(priority = 3)
	public static void shoes() {
    for (int i = 0; i < 8; i++) {
    	System.out.println(i);
    }
}
	//@Test
	//public static void Gender(String abc) {
   //if (abc.equalsIgnoreCase("men")) {
   
	  // System.out.println("men shoes");
	 //  }
   //else if (abc.equalsIgnoreCase("women")) {
	  // System.out.println("women shoes");
	  // Gender("men");
	 // }
	  // }
	    }
