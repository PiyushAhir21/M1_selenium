package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expressions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\User\\Desktop\\HTML.html");
		
//		cssSelector
//		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("iphone");
		
//		driver.findElement(By.cssSelector("a[class='_1TOQfO']")).click();
		
//		xpath
//		Xpath by attribute 
//		driver.findElement(By.xpath("//a[@class='wsejfv']")).click();
		
//		Xpath by text()
//		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		
//		Xpath by contains()
//		driver.findElement(By.xpath("//a[contains(text(),'Become a')]")).click();
		
//		xpath by multiple attributes
		driver.findElement(By.xpath("//input[@type='text'and @value='A']")).sendKeys("ABCD");
		
		
	}
}
