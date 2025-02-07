package web_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
//		driver.get("https://x.com/");
		
		Navigation nav = driver.navigate();
		
		nav.to("https://x.com/notifications");
		
		nav.back();
		
		nav.forward();
		
		nav.refresh();
	}
	

}
