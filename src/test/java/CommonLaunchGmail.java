
public class CommonLaunchGmail extends CommonClass{
	
	public static void main(String[] args) throws InterruptedException {
		CommonLaunchGmail CommonClass =  new CommonLaunchGmail();
			CommonClass.browserLanuch();
			CommonClass.launchURL();
			CommonClass.windowMax();
			
			CommonClass.findElement("xpath", "//input[@autocapitalize='none']");
			CommonClass.clickElement("xpath", "//input[@autocapitalize='none']");
			CommonClass.sendKeys("xpath", "//input[@autocapitalize='none']", "Jerin@yahoo.com");
			CommonClass.clickElement("xpath", "//input[@id='login-signin']");
			Thread.sleep(2000);
//			driver.getText("xpath", "//p[@data-error='messages.INVALID_USERNAME']", "Sorry, we don't recognize this email.");
//			driver.getText("xpath", "//p[@data-error='messages.INVALID_USERNAME']");
			CommonClass.clickElement("id", "createacc");
			
			CommonClass.clickElement("xpath", "//input[@id='usernamereg-firstName']");
			CommonClass.sendKeys("xpath", "//input[@name='firstName']", "Jerin");
			CommonClass.clickElement("xpath", "//input[@name='userId']");
			CommonClass.sendKeys("xapth", "//input[@name='userId']", "jerin");
			CommonClass.clickElement("xpath", "//input[@name='password']");
			CommonClass.sendKeys("xpath", "//input[@name='password']", "Asd123");
			Thread.sleep(2000);
			CommonClass.clickElement("xpath", "//button[@class='show-hide-toggle-button']");
			CommonClass.testOver();
			CommonClass.driverClose();
		
	}
}