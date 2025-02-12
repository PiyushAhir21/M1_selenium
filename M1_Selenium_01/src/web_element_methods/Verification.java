package web_element_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiAh6y9BhBREiwApBLHC4MFRLC_jC7KcN7QuWyVEWkeXpOj31H9H--EHHpjFDrzRe8tpHFRURoC3goQAvD_BwE&gclsrc=aw.ds");
		
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='formField']/a/i"));
		
		Boolean displayed = checkbox.isDisplayed();
		System.out.println(displayed);
		
		Boolean enabled = checkbox.isEnabled();
		System.out.println(enabled);
		checkbox.click();
			
		Thread.sleep(2000);
		Boolean selected = checkbox.isSelected();
		System.out.println(selected);
	}
}
