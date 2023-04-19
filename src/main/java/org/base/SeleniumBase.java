package org.base;

import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {
	static WebElement frame;
	static WebDriver driver;
	static WebElement username;
	String correcttext = "Sorry, we don't recognize this email.";
	String Url="https://demoqa.com/login";
	Robot r;
	String text = "jerin";
	String text2;
//	static JavascriptExecutor js ;
	private String title;
	
	public void browserLanuch() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void waits() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void windowMax() {
		driver.manage().window().maximize();
	}
	public void launchURL() {
		driver.get(Url);
	}
	public WebElement findElement(String findBy, String valueBy){
		if(findBy.equals("id")) {
			username = driver.findElement(By.id(valueBy));
		}else if(findBy.equals("className")) {
			username = driver.findElement(By.className(valueBy));
		}else if(findBy.equals("xpath")) {
			username = driver.findElement(By.xpath(valueBy));
		}
		return username;
	}
	public void sendKeys(String Attrib, String Value, String text) {
		WebElement element = findElement(Attrib, Value);
		element.sendKeys(text);
	}
	public void clickElement(String Attrib, String Value) {
//		WebElement el-		+ement = findElement(Attrib,Value);
//		element.click();
	}
	public void getTextTwo(String Attrib, String value) {
		
		WebElement element2 = findElement(Attrib, value);
		text2 = element2.getText();
		System.out.println(text2);
	}
	public void getText(String Attrib, String Value, String givenvalue) {
		WebElement element = findElement(Attrib,Value);
		String text = element.getText();
		boolean textcontains = text.contains("Invalid username or password!");
		System.out.println(text);
		if(text.equals(givenvalue)) {
//			System.out.println("Comparing the Actual and Expected Text = Pass");
			clickElement("xpath", "//button[@id='newUser']");
		}else {
			System.out.println("Log in Successfully");
		}
	}
	
	
	public void testOver() {
		System.out.println("Test Over");
	}
	public void driverClose() {
		System.out.println("Driver Closed");
		driver.quit();
	}
	public void windowHandle() {
		String pwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String cwin : allwin) {
			driver.switchTo().window(cwin);
			String ur2 = driver.getCurrentUrl();
			if(ur2.equals("https://www.flipkart.com/vivo-t1-44w-midnight-galaxy-128-gb/p/itm2a08ebbea3689?pid=MOBGDRHVZN29ZJF4&lid=LSTMOBGDRHVZN29ZJF4WEHAX7&marketplace=FLIPKART&q=vivo&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_3&otracker=search&otracker1=search&fm=Search&iid=284bc656-e42f-4631-a0cb-4c840a84e271.MOBGDRHVZN29ZJF4.SEARCH&ppt=sp&ppn=sp&ssid=bkmvwxlza80000001680599251079&qH=b09207f5c299c427")) {
				System.out.println("Switch Suffy");	
				break;
			}
		}
	}
	public void parentWind() {
		String handle = driver.getWindowHandle();
	}
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Main Title = "+ title);
	}
	public void getURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL = "+ currentUrl);
	}
	public void getAttribe(String by, String value, String type) {
		WebElement attr = findElement(by, value);
		String attribute = attr.getAttribute(type);
		System.out.println("Attribe Value = "+attribute);
	}
	public void javascriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
//		js.executeScript(Attrib, value);
		js.executeScript("window.scrollBy(0, 500)","");
	}
	
	public void explicitWaits(String path, String value) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		frame = findElement(path, value);
		wait.until(ExpectedConditions.visibilityOf(frame));
		driver.switchTo().frame(frame);
		
//		wait.until(ExpectedCondition.class(path,value));
	}
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}
}


