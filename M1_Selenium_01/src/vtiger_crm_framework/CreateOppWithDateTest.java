package vtiger_crm_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateOppWithDateTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\User\\git\\M1_selenium\\M1_Selenium_01\\resource\\commondata.properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);

		String URL = pObj.getProperty("url");
		String BROWSER = pObj.getProperty("bro");
		String USERNAME = pObj.getProperty("un");
		String PASSWORD = pObj.getProperty("pwd");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Login
		driver.get(URL);
		
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys(USERNAME);
		
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys(PASSWORD);
		
		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		submitBtn.click();

//		create Opportunity
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();

		String potentialName = "vtiger_" + (int) (Math.random() * 100);
		driver.findElement(By.name("potentialname")).sendKeys(potentialName);

		Thread.sleep(2000);
		String parentID = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='related_to_display']/following-sibling::img")).click();
		Thread.sleep(2000);

		Set<String> IDs = driver.getWindowHandles();
//		IDs.remove(parentID);
		for (String id : IDs) {
			driver.switchTo().window(id);

			if (driver.getCurrentUrl().contains("module=Accounts&action")) {
				break;
			} else {
				System.out.println("bcz ashutosh ne bola...");
			}
		}

		String orgName = "jspider_123";

		Thread.sleep(2000);

		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();

//		dynamic xpath
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();

		driver.switchTo().window(parentID);

		WebElement dateWE = driver.findElement(By.id("jscal_field_closingdate"));
		dateWE.clear();
		String date = "2025-05-13";
		dateWE.sendKeys(date);

//		save 
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();

//		verification
		String actPotName = driver.findElement(By.id("dtlview_Opportunity Name")).getText();
		boolean status = actPotName.equals(potentialName);
		if (status) {
			System.out.println("Potential created successfully");
		}

		String actOrgName = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		boolean status2 = actOrgName.equals(orgName);
		if (status2) {
			System.out.println("Organization verified successfully");
		}

		String actDate = driver.findElement(By.xpath("//td[text()='Expected Close Date']/following-sibling::td")).getText();
		boolean dateStatus = actDate.contains(date);
		if (dateStatus) {
			System.out.println("Date verified successfully");
		}

//		logout
		WebElement profile = driver.findElement(By.cssSelector("img[src=\"themes/softed/images/user.PNG\"]"));
//		profile hover
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
		driver.findElement(By.linkText("Sign Out")).click();

//		closing browser
		driver.close();
	}
}
