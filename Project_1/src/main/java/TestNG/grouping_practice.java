package TestNG;

import org.testng.annotations.Test;

public class grouping_practice {
@Test(groups = "Music")	
private void wynk() {
System.out.println("wynk");
}
@Test(groups = "Music")
private void spotify() {
System.out.println("spotify");
}
@Test(groups = "Music")
private void SS_music() {
System.out.println("ss_music");
}
@Test(groups = "Flowers")
private void Rose() {
System.out.println("Rose");
}
@Test
private void chocolate() {
System.out.println("chocolate");
}
@Test(groups = "Flowers")
private void jasmine() {
System.out.println("jasmine");
}
@Test(groups = "Flowers")
private void lotus() {
System.out.println("lotus");
}
}
