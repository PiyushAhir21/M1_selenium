package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
		WebElement iframe1 = driver.findElement(By.className("send-sms-iframe"));
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		WebElement iframe3 = driver.findElement(By.id("send-sms-iframe"));
		
//		name/id and index and webelement
		
//		By index
//		driver.switchTo().frame(0);
		
//		By name/id
//		driver.switchTo().frame("send-sms-iframe");
		
//		By webelement 
//		driver.switchTo().frame(iframe1);
//		driver.switchTo().frame(iframe2);
		driver.switchTo().frame(iframe3);
		
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@title='Instagram']")).click();
	}
}
