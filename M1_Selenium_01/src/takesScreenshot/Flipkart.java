package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class Flipkart {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.flipkart.com/");

//		Taking screenshot of a webpage
//		TakesScreenshot tks = (TakesScreenshot) driver;
//		File src = tks.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./errorShots/ss.png");
//		FileHandler.copy(src, dest);
//		Files.copy(src, dest);

//		Taking screenshot of a webelement 
		WebElement flight = driver.findElement(By.xpath("//img[@alt='Flight Bookings']"));
		File src1 = flight.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./errorShots/flight.png");
		Files.copy(src1, dest1);
		
		driver.close();
	}
}
