package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FisrtTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\WORK\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		
		//drive.get("https://en.wikipedia.org/");
		//drive.findElement(By.id("seachButton")).click();
		
		drive.get("https://www.facebook.com/");
		//drive.findElement(By.id("u_0_b")).click();
		//drive.findElement(By.className("uiButtonConfirm"));
		
		//drive.findElement(By.name("websubmit")).click();
		
		//drive.findElement(By.linkText("Terms")).click();
		
		//drive.findElement(By.partialLinkText("Forgotten")).click();
		
		List<WebElement> lists = drive.findElements(By.tagName("a"));
		System.out.println(lists.size());
		
		for(WebElement l : lists){
			System.out.println();
		}
		
		String title = drive.getTitle();
		System.out.println(title);
		
		//get the URL
		String currentURL = drive.getCurrentUrl();
		System.out.println(currentURL);
		
		//get the page source
		String pageSource = drive.getPageSource();
		System.out.println(pageSource);
		
		//close the browers
		//drive.close();
		
		drive.quit();
	}

}
