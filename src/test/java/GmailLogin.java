import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
			
		
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://login.yahoo.com/");
			WebElement username = d.findElement(By.xpath("//input[@autocapitalize='none']"));
			username.click();
			username.sendKeys("Jerin@yahoo.com");
			d.findElement(By.xpath("//input[@id='login-signin']")).click();
			Thread.sleep(5000);
			WebElement err = d.findElement(By.xpath("//p[@data-error='messages.INVALID_USERNAME']"));
			
			String text = err.getText();
			System.out.println(text);
			String s ="Sorry, we don't recognize this email";
			boolean valid = text.equals(s);
	//		System.out.println(s);
			System.out.println(valid);
			d.findElement(By.xpath("//a[@id='createacc']")).click();
			WebElement surname = d.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
			surname.sendKeys("Jerin");
			d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("A");
			d.findElement(By.xpath("//input[@type='password']")).sendKeys("123654");
			d.findElement(By.xpath("//button[@id='usernamereg-show-button']")).click();
			d.close();
		
	}

}
