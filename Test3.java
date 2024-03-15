package basictestng;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeSuite
	public void Bs() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void as() {
		System.out.println("after suite");
	}
	@BeforeMethod
	
	public void BM() {
		System.out.println("before metod");
	}
	@AfterMethod
		public void AM(){
		System.out.println("after methhod");
	}
	@BeforeClass
	public void BC() {
		System.out.println("before class");
	}
	@AfterClass
	public void AC() {
		System.out.println("After class");
	}
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	@AfterTest
	public void At() {
		System.out.println("After test");
	}
	
	@Test(priority=0,invocationCount=1)
	public void ajio() {
		System.out.println("ajio");
		
	}

}
