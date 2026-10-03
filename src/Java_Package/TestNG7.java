package Java_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	@Test
	public void a() {
		Assert.assertTrue(3 < 12);
		System.out.println("Hello a test method");
	}

	@Test
	public void b() {
		Assert.assertFalse(3 > 12);
		System.out.println("Hello b test method");
	}

	@Test
	public void c() {
		Assert.assertTrue(3 > 12);
		System.out.println("Hello c test method");

	}

	@Test(dependsOnMethods={"a","b","c"})
	public void d()
	{
		System.out.println("Hello d Test method");
	}

	@Test
	public void e() {
		int actuallnteger = 2;
		int expectedInteger = 2;
		Assert.assertEquals(actuallnteger, expectedInteger);
		System.out.println("Hello equal assertion");

	}

}
