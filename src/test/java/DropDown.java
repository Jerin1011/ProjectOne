import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jerin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("jerin@gmail.com");
		
//		Select a dropdown through Index
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(date);
		s.selectByIndex(5);
		
//		Select a dropdown through Value		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthselect = new Select(month);
		monthselect.selectByValue("8");
		
//		Select a dropdown through Visible Text
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearselect = new Select(year);
		yearselect.selectByVisibleText("2019");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)","");
		
		System.out.println("Scrolled");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
