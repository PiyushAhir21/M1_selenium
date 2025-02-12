package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		WebElement loginBtn = driver.findElement(By.name("login"));
		String text = loginBtn.getText();
		System.out.println(text);
		
		String attribute = loginBtn.getAttribute("type");
		System.out.println(attribute);
		
		String cssValue = loginBtn.getCssValue("font-family");
		System.out.println(cssValue);
		
		String tag = loginBtn.getTagName();
		System.out.println(tag);
		
	}
}
