package Org.Campaign;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(com.GenericUtility.ListenerUtility.class)
public class ToLerarn_ListenerUtilityImplementation {

	@Test
	
	public void test() {
		
		Reporter.log("Testcase Executed-Line 1",true);
		Reporter.log("Testcase Executed-Line 2",true);
		Reporter.log("Testcase Executed-Line 3",true);
	
		Assert.assertEquals("abc", "acc");
		Reporter.log("Testcase Executed-Line 4",true);
		Reporter.log("Testcase Executed-Line 4",true);
	}
}
