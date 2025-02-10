package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
//		driver.findElement(By.id("email")).sendKeys("admin");
//		driver.findElement(By.name("pass")).sendKeys("Facebook@123");
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
//		driver.findElement(By.className("_8esh")).click();
		
//		tagname
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println(images.size());
//		for (WebElement image : images) {
//			System.out.println(image.getAttribute("src"));
//		}
		

//		 id locator
//		 WebElement email = driver.findElement(By.id("email"));
//		 email.sendKeys("selenium");

//		 name locator
//		 WebElement pass = driver.findElement(By.name("pass"));
//		 pass.sendKeys("qwerty");

//		 class locator --> Least recommened (InvalidSelectorException)
//		 driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("phone");

//		 tagname locator
//		Thread.sleep(2000);
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		for (WebElement link : links) {
//			System.out.println(link.getText());
//		}

//		linkText locator
		Thread.sleep(3000);
//		driver.findElement(By.linkText("Sign up")).click();
		
//		Partial link text locator
//		driver.findElement(By.partialLinkText("Books")).click();

		Thread.sleep(5000);
		driver.close();
	}
}
