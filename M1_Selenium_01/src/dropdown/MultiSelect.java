package dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:\\Users\\User\\git\\M1_selenium\\M1_Selenium_01\\src\\dropdown\\multiselect.html");

//		Creating object for select class
		WebElement cars = driver.findElement(By.name("cars"));
		Select selCar = new Select(cars);
		
//		isMultiple()
		Boolean status = selCar.isMultiple();
		System.out.println(status);
		
//		getOptions()
		List<WebElement> allCars = selCar.getOptions();
		for (WebElement c : allCars) {
			System.out.println(c.getText());
		}
		
//		select methods
		selCar.selectByIndex(0);
		Thread.sleep(1000);
		selCar.selectByValue("opel");
		Thread.sleep(1000);
		selCar.selectByVisibleText("Audi");
		
//		ḍeselect methods
		selCar.deselectByValue("opel");
		Thread.sleep(1000);
		selCar.deselectByIndex(3);
		Thread.sleep(1000);
		selCar.deselectByVisibleText("Volvo");
		Thread.sleep(1000);
		selCar.deselectAll();
		
//		getFirstSelectedOption()
		WebElement first = selCar.getFirstSelectedOption();
		System.out.println(first.getText());
		
//		getAllSelectedOptions()
		List<WebElement> SelectedCars =  selCar.getAllSelectedOptions();
		for (WebElement car : SelectedCars) {
			System.out.println(car.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
