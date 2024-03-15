package basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Parameters("Browser")
@Test
public class Excecution4 {
	//Crossbrowser execution---executing testscript in method
	public WebDriver driver;
	

	public void MyntraTest(String Browser) {
		if(Browser.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		else {
			driver= new EdgeDriver();
		}
		driver.get("https://www.myntra.com/");
	}

}
