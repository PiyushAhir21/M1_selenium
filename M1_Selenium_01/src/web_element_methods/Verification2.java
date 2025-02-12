package web_element_methods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Verification2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		
		
		driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox.click();
		
		Thread.sleep(2000);
		
		Boolean selected = checkbox.isSelected();
		System.out.println(selected);
		
	}
}
