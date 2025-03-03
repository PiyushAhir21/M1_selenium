package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		Actions act = new Actions(driver);
//		act.scrollToElement(ele).build().perform();
		act.scrollByAmount(0, 500).build().perform();
		
		
	}
}
