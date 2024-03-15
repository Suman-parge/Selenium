package basictestng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert {

	@Test 
		// TODO Auto-generated method stub
	public void myntra() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		String title = d.getTitle();
		System.out.println(title);
		String url = d.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.myntra.com/")) {
			System.out.println("url is matching");
		}
		else{
			System.out.println("url is not matching");
		}

	}

}
