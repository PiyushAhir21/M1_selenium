package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://demowebshop.tricentis.com/");
//		driver.get("https://demoapp.skillrary.com/product.php");
//		driver.get("https://www.google.co.in/");
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

//		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));

//		WebElement plus = driver.findElement(By.id("add"));

//		WebElement google = driver.findElement(By.xpath("//img[@class='lnXdpd']"));

		WebElement passField = driver.findElement(By.id("password"));
		passField.sendKeys("123456789");

		WebElement eye = driver.findElement(By.xpath("//input[@id='password']/following-sibling::div"));

		Actions act = new Actions(driver);
		Thread.sleep(2000);

//		act.moveToElement(comp).build().perform();
//		act.doubleClick(plus).build().perform();
//		act.contextClick(google).build().perform();
		act.clickAndHold(eye).perform();
		Thread.sleep(3000);
		act.release(eye).perform();

		Thread.sleep(2000);

		driver.close();
	}
}
