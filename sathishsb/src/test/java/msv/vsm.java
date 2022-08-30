package msv;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class vsm {
	
	
	@Test
	public void sa() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println(d.getTitle());//4
		System.out.println(d.getCurrentUrl());//4
		d.navigate().refresh();//4
		WebElement ele = d.findElementByLinkText("Images");//4
		ele.click();//4
		d.quit();//4
		
		
	}
	
	

}
