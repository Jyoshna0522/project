package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "Qualification")
public void maths() {
System.out.println("Eligiability : " +  "Above 90 percentage");
	}
	@Test(groups = "Qualification")
	public void science() {
System.out.println("Eligiability : " + " Above 75 percentage");
	}
	@Test(groups = "Qualification")
	public void computer_science() {
System.out.println("Eligiability  : " + "Above 80 percentage");
	}
	@Test(groups = "Qualification")
	public void BBA() {
System.out.println("Eligiability : " + "Above 70 percentage");
	}
	@Test(groups = "Qualification")
	public void Bcom_general() {
System.out.println("Eligiability  : " + "Above 80 percentage");
	}
	@Test(groups = "Requirement")
	public void netto() {
System.out.println("Basic identification : " + "CPR");
	}
	@Test(groups ="Requirement")
	public void Fotex() {
System.out.println("Basic identification: " + "RP card");
	}

	

}
