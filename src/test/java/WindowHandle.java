import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//Entering Url Launch
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		//Searching the product
				d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//				d.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
				WebElement f = d.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
				f.click();
				f.sendKeys("printers");
				d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				Thread.sleep(2000);
				
				//Click the first search product
				d.findElement(By.xpath("//a[@title='Canon PIXMA GM2070 Single Function WiFi Monochrome Inkjet Printer with Voice Activated Printing Google Assistant and Alexa with Auto-Duplex & Optional Color Printing']")).click();
//				String pwin = d.getWindowHandle();
				Set<String> allwin = d.getWindowHandles();
				Iterator<String> it1 = allwin.iterator();
				String pwin = it1.next();
				String cwin = it1.next();
				Thread.sleep(2000);
//				d.switchTo().window(pwin);
//				d.close();
				d.switchTo().window(cwin);
				String printeramount = d.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
				System.out.println(printeramount);
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor)d;
				js.executeScript("window.scrollBy(0,5000)", "");
				Thread.sleep(2000);
				String simlar = d.findElement(By.xpath("//div[text()='Similar Products']")).getText();
				System.out.println(simlar);
				
				
				if(simlar.equals(simlar)) {
					d.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[12]")).click();
					System.out.println("Sucess");
					d.switchTo().window(cwin);
					d.close();
//					d.switchTo().window(cwin);
					
					Set<String> allwin2 = d.getWindowHandles();
					Iterator<String> it2 = allwin2.iterator();
					String pwin1 = it2.next();
					String cwin1 = it2.next();
					
					
						d.switchTo().window(cwin1);
					
					
					Thread.sleep(2000);
					System.out.println("Sucess");
//					String simlar1 = d.findElement(By.xpath("//div[text()='Similar Products']")).getText();
//					System.out.println(simlar1);
//					
					String ch2amount = d.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
					System.out.println(ch2amount);
					d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
					
				}
				
//d.quit();
	}

}
