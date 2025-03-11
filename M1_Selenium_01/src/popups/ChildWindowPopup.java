package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/21");

		String parentID = driver.getWindowHandle();

		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();

		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(parentID);

		for (String id : IDs) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().equals("https://www.flipkart.com/")) {
				Thread.sleep(3000);
				driver.manage().window().maximize();
				break;
			}
		}
		
		
	}
}
