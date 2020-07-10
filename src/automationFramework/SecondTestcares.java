package automationFramework;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;

public class SecondTestcares {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WORK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.economist.com/");
		
		//String title = driver.getTitle();
		
		//int titleLng = driver.getTitle().length();
		
		//System.out.println(title);
		//System.out.println(titleLng);
		/*
		String URL ="https://en.wikipedia.org/";
		driver.get(URL);
		driver.findElement(By.linkText("Help")).click();
		
		driver.findElement(By.linkText("Help")).click();

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(URL);
		
		driver.navigate().refresh();
		
		driver.quit();
		*/
		
		//String url = "http://omayo.blogspot.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html/";
		driver.get(url);
		/*
		String hanlder = driver.getWindowHandle();
		System.out.println(hanlder);
		
		//Click on "Selenium Tutorial" link to open a new window
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		
		Set<String> handlers = driver.getWindowHandles();
		System.out.println(handlers);
		
		String winHandles = handlers.iterator().next();
		String secondWindowHandler = winHandles;
		
		driver.switchTo().window(secondWindowHandler);
		System.out.println(secondWindowHandler);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.linkText("Cruises")).click();
		Thread.sleep(700);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ta1")).sendKeys("blaw blaw");
		Thread.sleep(700);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		Thread.sleep(3000);
		
		Dimension d1 = new Dimension(300, 200);
		driver.manage().window().setSize(d1);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Point p1 = new Point(300, 400);
		driver.manage().window().setPosition(p1);
		Thread.sleep(3000);
		*/
		
		WebElement element = driver.findElement(By.linkText("this"));
		element.click();
		
		WebElement textbox = driver.findElement(By.id("fname"));
		textbox.sendKeys("blabla ");
		textbox.clear();
		Thread.sleep(3000);
		
		
		driver.quit();
	
	}

}
