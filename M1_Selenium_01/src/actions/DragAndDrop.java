package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement norway = driver.findElement(By.id("box101"));
		WebElement oslo = driver.findElement(By.id("box1"));
		
		WebElement US = driver.findElement(By.id("box103"));
		WebElement washington = driver.findElement(By.id("box3"));
		
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		
		WebElement spain = driver.findElement(By.id("box107"));
		WebElement madrid = driver.findElement(By.id("box7"));
		
		WebElement Italy = driver.findElement(By.id("box106"));
		WebElement Rome = driver.findElement(By.id("box6"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(oslo, norway).perform();
		Thread.sleep(1000);
		act.dragAndDrop(washington, US).perform();
		Thread.sleep(1000);
		act.dragAndDrop(Seoul, SouthKorea).perform();
		Thread.sleep(1000);
		act.dragAndDrop(madrid, spain).perform();
		Thread.sleep(1000);
		act.dragAndDrop(Rome, Italy).perform();
		
		
		Thread.sleep(2000);

		driver.close();
	}
}
