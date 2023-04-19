import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
//		js.executeScript(null, args)
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		boolean pwindspy = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).isDisplayed();
		if(pwindspy) {
			System.out.println("Succfly changed to new window");
		}else {
			System.out.println("window not opened");
		}
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		String pwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String cwin:allwin) {
			driver.switchTo().window(cwin);
		}
		boolean childwindipy = driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed();
		if(childwindipy) {
			System.out.println("Switched to 2nd window successfully");
		}else {
			System.out.println("Window Not Switched successfully");
		}
		
		driver.switchTo().window(pwin);
		WebElement switchpwin = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
		String switchpwintext = switchpwin.getText();
		System.out.println("Parent Window get Text = " + switchpwintext);
		driver.quit();
	}

}
