package TestNgPractice;

import org.testng.annotations.Test;

public class Test_Practice {
	@Test
	public void TestMethod1() {
		System.out.println("-----------testMethod--------");
	}
    @Test
	public void TestMethod2() {
		System.out.println("----------------TestMethod2-------");
	}
    @Test
    public void loginTest()
    {
    	System.out.println("Executing TestMethod login");
    }
    @Test (dependsOnMethods = "loginTest")
    public void logout()
    {
    	System.out.println("Executing logout method");
    }
    
    
    
}
