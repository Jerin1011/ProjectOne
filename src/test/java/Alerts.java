import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts {

	@Test
	public void handlingAlert() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("javascript_alerts"))
			System.out.println("Page navigated Successfully--Pass");
		else
			System.out.println("Page not navigated Successfully--Fail");
		
		boolean result = driver.findElement(By.xpath("//h3[text()='JavaScript Alerts']")).isDisplayed();
		if(result)
			System.out.println("Page navigated Successfully--Pass");
		else
			System.out.println("Page not navigated Successfully--Fail");
		
//		Simple Alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
		String simtext = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("[Simple Alert] = " + simtext);
		
//		Confirmation Alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		alertObj.dismiss();
		String context = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("[Confirmation Alert] = " + context);
		
//		Prompt Alert
		WebElement pralert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		pralert.click();
		alertObj.sendKeys("12366");
		alertObj.accept();
		String prtext = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("[Prompt Text] = " + prtext);
	driver.quit();

		
	
	}

}
