package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Arguments {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");

//		WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Login']"));
//		WebElement flight = driver.findElement(By.xpath("//span[text()='Flight Bookings']"));
//		WebElement search = driver.findElement(By.name("q"));
		WebElement backToTop = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
//		loginBtn.click();

		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[1].click()", loginBtn, flight);
//		jse.executeScript("arguments[0].value='iphone'", search);
//		jse.executeScript("arguments[0].value=arguments[1]", search, "iphone");

//		jse.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("arguments[0].scrollIntoView(true)",backToTop);
		
		
		Thread.sleep(5000);
		driver.close();
		/*
		 * window.location="fully qualified path";
		 * window.location.href="fully qualified path";
		 * window.open("fully qualified path") document.location="fully qualified path";
		 * 
		 *  
		 * 
		 */

	}

}
