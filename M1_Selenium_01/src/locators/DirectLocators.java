package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
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
		driver.findElement(By.partialLinkText("Books")).click();

		Thread.sleep(5000);
		driver.close();
	}
}
