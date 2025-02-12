package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element_ {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");

		Thread.sleep(1000);

		un.clear();

		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("123456789");

		Thread.sleep(200);
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();

	}

}
