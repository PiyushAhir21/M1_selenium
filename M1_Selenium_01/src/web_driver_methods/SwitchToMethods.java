package web_driver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String parentID = driver.getWindowHandle();

		driver.findElement(By.linkText("Meta Pay")).click();
		
		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(parentID);
		
		for (String id : IDs) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.findElement(By.linkText("The metaverse")).click();
		}
		
		driver.switchTo().window(parentID);
		
		Thread.sleep(3000);
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
