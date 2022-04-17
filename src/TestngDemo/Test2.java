package TestngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeTest
	public void method1() {
		System.out.println("Test2 of Method1");
	}
	
	@AfterTest
	public void method2() {
		System.out.println("Test2 of Method2");
		}
	
	@Test
	public void method3() {
		System.out.println("Test2 of Method3");
		}

	@BeforeClass
	public void method4() {
		System.out.println("Test2 of Method4");
		}
	
	@AfterClass
	public void method5() {
		System.out.println("Test2 of Method5");
		}
	
	
	
	
}
