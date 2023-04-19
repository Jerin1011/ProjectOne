import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.KeyStore.Entry.Attribute;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonClass{
		WebDriver d ;
	WebElement username;
	String correcttext = "Sorry, we don't recognize this email.";
	String Url="https://www.flipkart.com/";
	Robot r;
	String text2;
	JavascriptExecutor js ;
	private String title;
	
	public void browserLanuch() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
	}
	public void waits() {
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void windowMax() {
		d.manage().window().maximize();
	}
	public void launchURL() {
		d.get(Url);
	}
	public WebElement findElement(String findBy, String valueBy){
		if(findBy.equals("id")) {
			username = d.findElement(By.id(valueBy));
		}
		else if(findBy.equals("className")) {
			username = d.findElement(By.className(valueBy));
		}else if(findBy.equals("xpath")) {
			username = d.findElement(By.xpath(valueBy));
		}
		return username;
	}
	public void sendKeys(String Attrib, String Value,  String text) {
		WebElement element = findElement(Attrib, Value);
		element.sendKeys(text);
	}
	public void clickElement(String Attrib, String Value) {
		WebElement element = findElement(Attrib,Value);
		element.click();
	}
	public void getTextTwo(String Attrib, String value) {
		
		WebElement element2 = findElement(Attrib, value);
		text2 = element2.getText();
		System.out.println(text2);
	}
	public void getText(String Attrib, String Value, String givenvalue) {
//		String correcttext=d
		WebElement element = findElement(Attrib,Value);
		String text = element.getText();
		System.out.println(text);
		if(text.equals(givenvalue)) {
			System.out.println("Comparing the Actual and Expected Text = Pass");
		}else {
			System.out.println("Comparing the Actual and Expected Text = Fail");
		}
	}
	
	
	public void testOver() {
		System.out.println("Test Over");
	}
	public void driverClose() {
		System.out.println("Driver Closed");
		d.quit();
	}
	public void windowHandle() {
		String pwin = d.getWindowHandle();
		Set<String> allwin = d.getWindowHandles();
		for(String cwin : allwin) {
			d.switchTo().window(cwin);
			String ur2 = d.getCurrentUrl();
			if(ur2.equals("https://www.flipkart.com/vivo-t1-44w-midnight-galaxy-128-gb/p/itm2a08ebbea3689?pid=MOBGDRHVZN29ZJF4&lid=LSTMOBGDRHVZN29ZJF4WEHAX7&marketplace=FLIPKART&q=vivo&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_3&otracker=search&otracker1=search&fm=Search&iid=284bc656-e42f-4631-a0cb-4c840a84e271.MOBGDRHVZN29ZJF4.SEARCH&ppt=sp&ppn=sp&ssid=bkmvwxlza80000001680599251079&qH=b09207f5c299c427")) {
				System.out.println("Switch Suffy");	
				break;
			}
		}
	}
	public void parentWind() {
		String handle = d.getWindowHandle();
	}
	public void getTitle() {
		String title = d.getTitle();
		System.out.println("Main Title = "+ title);
	}
	public void getURL() {
		String currentUrl = d.getCurrentUrl();
		System.out.println("URL = "+ currentUrl);
	}
	public void getAttribe(String by, String value, String type) {
		WebElement attr = findElement(by, value);
		String attribute = attr.getAttribute(type);
		System.out.println("Attribe Value = "+attribute);
	}
	public void javascriptExecutor(String value, String Attrib) {
		js = (JavascriptExecutor)d;	
		js.executeScript(Attrib, value);
	}
	public void scrollBy(String attrib) {
//		js.executeScript("aruguments[0].scrollIntoView(true)", value);
		js.executeScript(attrib,"");
	
	}
}

