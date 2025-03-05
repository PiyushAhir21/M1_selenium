package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgainJavaScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.zomato.com/");

		WebElement element1 = driver.findElement(By.xpath("//h5[text()='Popular cuisines near me']"));
//		Actions act = new Actions(driver);
//		act.scrollToElement(element1).build().perform();
//		js.executeScript("arguments[2].scrollIntoView(true)","ab","cd",element1 );

		WebElement searchField = driver
				.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant')]"));
//		searchField.sendKeys("Dhokla");
		js.executeScript("arguments[0].value='Dhokla'", searchField);

		WebElement orderOnline = driver.findElement(By.xpath("//img[@alt='Order Online']"));
		js.executeScript("arguments[0].click();", orderOnline);
	}
}
