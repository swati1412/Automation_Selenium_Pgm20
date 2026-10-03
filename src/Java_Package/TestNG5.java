package Java_Package;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {
	
	
	@Test(groups = "Regression")
    public void regressionTest() {
        System.out.println("Regression Test");
    }

    @Test(groups = "Sanity")
    public void sanityTest() {
        System.out.println("Sanity Test");
    }

	@Test(groups = "Smoke")
    public void smokeTest() {
        System.out.println("Smoke Test");
	}

	// @Test - 1st way
	public void a() {
		System.out.println("Hello a test method");
	}
	
	
	// 2nd Way - Widely used in industry
	@Test(enabled=false)
	public void b()
	{
		System.out.println("Hello b test method");
	}
	
	
	@Test (enabled=true)
	public void c()
	{
		System.out.println("Hello c test method");
	}
	
	
	// Rerun Test Script - 2 Times
	@Test(invocationCount=2)
	public void d()
	{
		System.out.println("Hello d test method");
	}
	
	// 3rd Way - invocation count 0 times
	@Test(invocationCount=0)
	public void e()
	{
		System.out.println("Hello e test method");
	}
	
	// Conditional Skipping
	@Test
	public void f()
	{
		System.out.println("Hello f test method");
		throw new SkipException("Skipping f test method");
		//System.out.println("Hello Unreachable Code");
		
	}
		@Test
	    public void testMethod() {
	        System.out.println("Hello TestNG5");
	}
}
