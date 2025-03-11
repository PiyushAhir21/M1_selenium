package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[@class = 'main-3']")).click();
		
		Thread.sleep(3000);
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		
		Thread.sleep(3000);
		fileUpload.sendKeys("C:\\Users\\User\\Desktop\\Ashutosh_Resume.pdf");
		
		
	}
}
