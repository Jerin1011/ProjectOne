import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
//			driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
			String title = driver.getCurrentUrl();
			if(title.contains("droppable")) {
			System.out.println("Opend Correct Page");
			}else {
			System.out.println("Wrong Page Opend");
			}

//			Simple Tags
//			WebElement dragelm = driver.findElement(By.id("draggable"));
//			WebElement dropelm = driver.findElement(By.id("droppable"));
			WebElement dragelm = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement dropelm = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
			
			Actions a = new Actions(driver);
			a.dragAndDrop(dragelm, dropelm).perform();
//			dropelm.click();
			
//			Thread.sleep(3000);
//			WebElement droptext = driver.findElement(By.xpath("//p[text()='Drop here']"));
			WebElement droptext = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
			String drtext = droptext.getText();
			System.out.println("Simple droped Text = " + drtext);

			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@data-rb-event-key='accept']")).click();
			WebElement dragelm2 = driver.findElement(By.xpath("//div[@id='acceptable']"));
			WebElement dropelm2 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
			
			a.dragAndDrop(dragelm2, dropelm2).perform();
			WebElement droptext2 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
			String drtext2 = droptext2.getText();
			System.out.println("Accept droped Text = " + drtext2);

	driver.quit();
	
	
	
	
	}

}
