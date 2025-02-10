package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expressions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
//		cssSelector
//		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("iphone");
		
//		driver.findElement(By.cssSelector("a[class='_1TOQfO']")).click();
		
//		xpath
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='wsejfv']")).click();
		
		
	}
}
