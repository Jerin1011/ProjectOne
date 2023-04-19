import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class AmazonWebSite {
@Test
	public void amazonSite() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
//		d.manage().window().maximize();
		WebElement find = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));	
		find.click();
		find.sendKeys("IOS Apple");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		d.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (256 GB) - Deep Purple']")).click();
	
		Set<String> handles = d.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		d.switchTo().window(child);
		
		WebElement scroll = d.findElement(By.xpath("//h1[@class='a-size-large a-spacing-none']"));
		scroll.click();
		String text = scroll.getText();
		System.out.println("Main page Mobile Name: " + text);
		
		
		try {
			d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
//			d.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
			d.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
			WebElement adtext = d.findElement(By.xpath("//span[@class='a-truncate-cut']"));
			String addpathtext = adtext.getText();
			System.out.println("Add to Cart Mobile Name: " + addpathtext);
			
			boolean equals = addpathtext.equals(text);
			System.out.println("Comparing Mobile Name: " + equals);
			
			
		}catch(Exception e) {
			d.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			Thread.sleep(2000);
			

			System.out.println("handled");
		}
		d.quit();
	}

}
