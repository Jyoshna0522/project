package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertx {
	@Test(retryAnalyzer = retry.class)
	private void demo_assert() {
                 // hard assert ( without object creation)
//		String actual = "jyoshna";
//		String expected= "suresh";
//      Assert.assertEquals(actual, expected );   
      
	
      //soft assert (with object creation)

    SoftAssert sj = new SoftAssert();
    String actual ="gold";
    String expected= "diamond";
    int aa = 22;
    int bb = 05;
    boolean cc= false;
    boolean dd= true;
    sj.assertEquals(actual, expected);
    sj.assertEquals(aa, bb);
    sj.assertEquals(cc, dd);
    sj.assertAll();
	}
}

