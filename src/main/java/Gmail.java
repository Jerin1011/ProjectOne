import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https:\\www.gmail.com");
			WebElement findElement = d.findElement(By.xpath("//input[@type='email']"));
			findElement.click();
			findElement.sendKeys("jerinjosuva10@gmail.com");
			d.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(5000);
			String text = d.findElement(By.xpath("(//div[@class='PrDSKc'])[2]")).getText();
			String t = "Try using a different browser. If you’re already using a supported browser, you can try again to sign in.";
			System.out.println(text);
			boolean b = text.equals(t);
			System.out.println(b);
			String text2 = d.findElement(By.xpath("(//div[@class='PrDSKc'])[1]")).getText();
			System.out.println(text2);
			String s2 = "This browser or app may not be secure. Learn more";
			boolean c = text2.equals(s2);
			System.out.println(c);
d.quit();	
	}

}
