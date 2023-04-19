
public class FlipkartComLaunch extends CommonClass{

	public static void main(String[] args) {
		FlipkartComLaunch driver = new FlipkartComLaunch();
		
			driver.browserLanuch();
			driver.launchURL();
			driver.windowMax();
			driver.waits();
			driver.clickElement("xpath", "//button[@class='_2KpZ6l _2doB4z']");
//			driver.sendKeys("xpath", "//input[@title='Search for products, brands and more']", "vivo");
			driver.findElement("xpath", "//input[@title='Search for products, brands and more']").sendKeys("vivo");
			
			driver.clickElement("xpath", "//button[@class='L0Z3Pu']");
//			driver.pressEnter();

			driver.getTitle();
			driver.getAttribe("xpath", "(//script[@type='application/json'])[1]", "type");
			driver.getText("xpath", "(//div[@class='_4rR01T'])[1]", "jerin");
			driver.clickElement("xpath", "(//div[@class='_4rR01T'])[3]");
			driver.windowHandle();
			driver.getURL();
			
//			driver.getText("xpath", "//button[@type='button']");
//			driver.getText("xpath", "//button[@type='button']", "jerin");
			
//			driver.getText("xpath", "//span[text()='Buy Together and Save upto 30%']");
			driver.getText("xpath", "//span[text()='Buy Together and Save upto 30%']", "Buy Together and Save upto 30%");
			driver.clickElement("xpath", "(//a[@target='_blank'])[6]");
//			driver.getText("xpath", "//div[@class='_30jeq3 _16Jk6d']");
			driver.windowHandle();
			driver.getText("xpath", "//div[@class='_30jeq3 _16Jk6d']", "₹199");
//			driver.parentWind();
//			driver.windowHandle();
//			driver.getText("xpath", "(//div[@class='_4rR01T'])[4]"," jerin");
			
			
			
//			driver.driverClose();
			
		
		
		
		
		
	}

}
