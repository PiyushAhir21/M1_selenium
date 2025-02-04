package web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//						driver = new EdgeDriver();
//						driver = new FirefoxDriver();

		driver.get("https://www.instagram.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

//		String pageSource = driver.getPageSource();
//		System.out.println();
		
		driver.findElement(By.xpath("//span[text()='Meta']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
//		driver.close();
		
		
	}
}
