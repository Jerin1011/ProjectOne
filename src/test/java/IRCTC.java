import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://www.irctc.co.in/");
		Thread.sleep(2000);

//		try {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
//		}catch(Exception e){
//			System.out.println("didnot know to handle the alert");
//		}
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']")).click();
//		try {
////			
//			}catch(Exception e){
//				System.out.println("didnot know to handle the alert");
//			}
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys("Tvl1234");
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Irtc@123");
		d.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Irtc@123");
		d.findElement(By.xpath("//input[@formcontrolname='secAns']")).sendKeys("IRTC");
		d.findElement(By.xpath("//div[@class='ng-tns-c65-14 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		WebElement lang = d.findElement(By.xpath("//div[@class='ng-tns-c65-14 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		lang.click();
		d.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();
		d.findElement(By.xpath("//button[@label='Continue']")).click();
		d.findElement(By.xpath("//input[@id='firstName']")).sendKeys("jerin");
		d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("A");
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Select Occupation']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//span[@class='ng-star-inserted'])[3]")).click();
		Thread.sleep(2000);
		WebElement date = d.findElement(By.xpath("//input[@placeholder='Date Of Birth']"));
		date.click();
		date.sendKeys("11-11-1886");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-17 ng-star-inserted'])[5]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-clickable']")).click();
		d.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable ng-star-inserted'])[1]")).click();
		d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9236547892");
		WebElement nationlity = d.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']"));
		Select s = new Select (nationlity);
//		s.selectByIndex(93);
		s.selectByValue("94");
		
		WebElement nationlity1 = d.findElement(By.xpath("class=\"form-control ng-pristine ng-invalid ng-touched\""));
		Select s1 = new Select (nationlity1);
		s.selectByValue("94");
		
		d.findElement(By.xpath("//button[@class='search_btn train_Search ng-star-inserted']")).click();
		
		
		
		Thread.sleep(10000);
		System.out.println("Test Runned Successfully");

		
		
		
		
		//		d.close();
		
		
		
	}

}	
