package TestngDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
 
	@BeforeTest
	public void method1() {
		System.out.println("Test1 of Method1");
	}
	
	@AfterTest
	public void method2() {
		System.out.println("Test1 of Method2");
		}
	
	@Test
	public void method3() {
		System.out.println("Test1 of Method3");
		}
	
	@BeforeSuite
	public void method4() {
		System.out.println("Test1 of Method4");
	}
	
	@AfterSuite
	public void method5() {
		System.out.println("Test1 of Method5");
	}
}
