package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://demowebshop.tricentis.com/");
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

//		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//
//
//		Alert ale = driver.switchTo().alert(); //NoAlertPresentException
//		ale.accept();
//
//		searchBtn.click();
//
//		driver.findElement(By.linkText("Log in")).click(); // unhandled alert

//		driver.findElement(By.name("submit")).click();

//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
////		driver.switchTo().alert().dismiss();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();

//		prompt popup
		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert ale = driver.switchTo().alert();
		Thread.sleep(1000);
//		ale.accept();
//		System.out.println("alert accepted successfully");
//		ale.dismiss();
//		System.out.println("alert dismissed successfully");
		
		String alertText = ale.getText();
		System.out.println(alertText);
		ale.sendKeys("Mogembo");
		ale.accept();
		
	}
}
