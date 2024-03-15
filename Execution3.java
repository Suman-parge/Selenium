package basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Execution3 {
	//for parallel execution classes
	@Test
	public void SkillraryTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		
	}
	@Test
	public void VtigerTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
	}
}
