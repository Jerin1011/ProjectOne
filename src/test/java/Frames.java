import java.util.concurrent.TimeUnit;

import org.bouncycastle.math.ec.rfc7748.X25519.Friend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
			String title = driver.getCurrentUrl();
			if(title.contains("nested_frames")) {
			System.out.println("Opend Correct Page");
			}else {
			System.out.println("Wrong Page Opend");
			}
		
//			WebElement firstframe = driver.findElement(By.xpath("//frameset[@rows='50%,50%']"));
//			driver.switchTo().frame(firstframe);
//			System.out.println("Runed first frame");
			
//			going to top Frame
			WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
			driver.switchTo().frame(topframe);
			System.out.println("Runed 1st frame");
			
			//going to middle Frame
			WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
			driver.switchTo().frame(middleframe);
			System.out.println("Runed 2nd frame");
			
			WebElement midtext = driver.findElement(By.xpath("//div[@id='content']"));
					String mtext = midtext.getText();
					System.out.println(mtext);
					
//			driver.switchTo().parentFrame();
//			WebElement left = driver.findElement(By.tag
//					Name("body"));
//					String lefttext = left.getText();
//					System.out.println(lefttext);
//		WebElement ffram = driver.findElement(By.xpath("//frameset[@rows='40%,*,30%']"));
//		driver.switchTo().frame(ffram);
//		System.out.println("one");
//		
//		WebElement firstframe = driver.findElement(By.xpath("//frameset[@cols='30%,30%,30%']"));
//		driver.switchTo().frame(firstframe);
//		System.out.println("changed to 1st frame");

//		WebElement secondframe = driver.findElement(By.xpath("//frame[@name='left']"));
//		driver.switchTo().frame(secondframe);
//		System.out.println("changed to 2st frame");
//		
		
		
		
		
		
//		driver.quit();
	}

}
