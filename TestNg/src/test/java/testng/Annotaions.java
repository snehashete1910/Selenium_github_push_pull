package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Annotaions {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("its is before suite");
	}

	@AfterSuite
	public void afteresuit() {
		System.out.println("its is after suite");
	}

	@BeforeTest
	public void befortest() {
		System.out.println("its is before test");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("its is after test");
	}

	public void beformethod() {
		System.out.println("its is before method");
	}

	@AfterMethod
	public void aftemethod() {
		System.out.println("its is after method");
	}

	@BeforeClass
	public void beforeclas() {
		System.out.println("its is before class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("its is after class");
	}
	@Test
	public void tes1()
	{
		System.out.println("this is test 1");
	}
	@Test
	public void tes2()
	{
		System.out.println("this is test 2");
	}
	@Test
	public void tes3()
	{
		System.out.println("this is test 3");
	}
}
