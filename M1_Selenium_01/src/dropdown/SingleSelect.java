package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selDay = new Select(day);
		selDay.selectByIndex(0);		
		
		WebElement month = driver.findElement(By.id("month"));
		Select selMon = new Select(month);
		selMon.selectByValue("1");
		
		List<WebElement> months = selMon.getOptions();
		for (WebElement mon : months) {
			System.out.println(mon.getText());
		}
		
		WebElement year = driver.findElement(By.id("year"));
		Select selYea = new Select(year);
		selYea.selectByVisibleText("1947");
		
		
		
	}
}
