package basictestng;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=0,invocationCount=1)
	public void ajio() {
		ChromeDriver d=new ChromeDriver();
		//launch ajio.com
		d.get("https://www.ajio.com/");
	}
	@Test(priority=2)
	public void myntra() {
		ChromeDriver d=new ChromeDriver();
		//launch ajio.com
		d.get("https://www.myntra.com/");
	}
	@Test(priority=0)
	public void amazon() {
		ChromeDriver d=new ChromeDriver();
		//launch ajio.com
		d.get("https://www.amazon.com/");
	}
	

}