package web_driver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Window win = driver.manage().window();

//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();

//		win.maximize();
//		Thread.sleep(1000);
//		win.minimize();
//		Thread.sleep(1000);
//		win.fullscreen();
//		Thread.sleep(1000);

//		Dimension dim1 = win.getSize();
//		System.out.println("size is : " + dim1);
//
//		int w = dim1.getWidth();
//		int h = dim1.getHeight();
//		System.out.println("width is : " + w + "height is : " + h);
		
		Dimension dim2 = new Dimension(500, 1000);
		win.setSize(dim2);
		
//		Point pt1 = win.getPosition();
//		System.out.println(pt1);
		
		Point pt2 = new Point(500, 250);
		win.setPosition(pt2);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
