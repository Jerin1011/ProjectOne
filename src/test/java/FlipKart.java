import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//Entering Url Launch
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		//Searching the product
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement f = d.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		f.click();
		f.sendKeys("redmi");
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//Click the first search product
		WebElement mobile = d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		String pamount = d.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		mobile.click();
		String mbl = mobile.getText();
		//Changing the window
		Set<String> handle = d.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String pwin = it.next();
		String cwin = it.next();
		d.switchTo().window(cwin);
		//Taking the child product title and amount
		String mobileone = d.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(mobileone);
		String camount = d.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		boolean kamount = camount.equals(pamount);
		System.out.println(camount);
		System.out.println("Amount: " + kamount);
		
		
//		try {
//		d.findElement(By.xpath("//span[text()='Cart']")).click();
//		d.findElement(By.xpath("//div[text()='Remove']")).click();
//		d.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
//		Thread.sleep(2000);
//		d.navigate().back();
//		
//		}catch(Exception e) {
//			System.out.println("throw");
//		}
		
		
//		Thread.sleep(2000);
//		d.navigate().back();
//		Thread.sleep(2000);
		
		//Click Add to Cart Button
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(1000);
		//Exception Handling Error Message
		try {
		WebElement error = d.findElement(By.xpath("//div[@class='_2sKwjB']"));
		
		if(error.equals(error)) {
			d.findElement(By.xpath("//span[text()='Cart']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//div[text()='Remove']")).click();
//			d.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
//			d.navigate().forward();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_CONTROL);
			d.switchTo().window(pwin);
			
			d.findElement(By.xpath("//div[text()='REDMI 10 (Pacific Blue, 64 GB)']")).click();
			
			Set<String> handle2 = d.getWindowHandles();
			Iterator<String> it2 = handle2.iterator();
			String pwin2 = it2.next();
			String cwin2 = it2.next();
			d.switchTo().window(cwin2);
//			Click add to cart
			d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//			d.findElement(By.xpath("//span[text()='Cart']")).click();
			if(error.equals(error)) {
				
			d.findElement(By.xpath("//span[text()='Cart']")).click();
			String addtext = d.findElement(By.xpath("//a[text()='REDMI 10 (Pacific Blue, 64 GB)']")).getText();
			boolean equals = addtext.equals(mobileone);
			System.out.println(addtext);
			System.out.println("Mobile Name:" + equals);
			}
			
			
			else {
//			d.findElement(By.xpath("//span[text()='Cart']")).click();
			String addtext = d.findElement(By.xpath("//a[text()='REDMI 10 (Pacific Blue, 64 GB)']")).getText();
			boolean equals = addtext.equals(mobile);
			System.out.println(equals);
			}
			
		}else {
			//Clicking here the add to cart button
//			d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//			Thread.sleep(2000);
//			String adtext = d.findElement(By.xpath("//a[text()='REDMI 10 (Pacific Blue, 64 GB)']")).getText();
//			boolean b = adtext.equals(mobileone);
//			System.out.println("Mobile: " + b);
		}
		}catch(Exception e){
//			d.findElement(By.xpath("//span[text()='Cart']")).click();
			Thread.sleep(2000);
			String adtext = d.findElement(By.xpath("//a[text()='REDMI 10 (Pacific Blue, 64 GB)']")).getText();
			System.out.println(adtext);
			
			String addtext2 = d.findElement(By.xpath("//div[@class='_20RCA6']")).getText();
			String context = addtext2.concat(adtext);
//			System.out.println(context);
			
			System.out.println(addtext2);
			System.out.println(mbl);
			boolean b = adtext.equals(mbl);
			System.out.println("Mobile: " + b);
			System.out.println("sucess");
		}
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//	
//		WebElement error1 = d.findElement(By.xpath("//div[@class='_2sKwjB']"));
//	
//		if(error1.equals(error1)) {
//			d.findElement(By.xpath("//span[text()='Cart']")).click();
//		}else {
//			d.findElement(By.xpath("//span[text()='Cart']")).click();
//		}
//		d.findElement(By.xpath("//span[text()='Cart']")).click();
//		String adtext = d.findElement(By.xpath("//a[text()='REDMI 10 (Pacific Blue, 64 GB)']")).getText();
//		boolean b = adtext.equals(mobileone);
//		System.out.println("Mobile: " + b);
//		d.switchTo().window("mobile");
//		Thread.sleep(5000);
		
		
		d.quit();
	
	}

	}
