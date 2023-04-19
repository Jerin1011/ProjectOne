package org.testcase;

import org.base.SeleniumBase;
import org.openqa.selenium.JavascriptExecutor;
import org.pom.RegisterPage;
import org.pom.WelcomPage;
import org.testng.annotations.Test;

public class DemoQaTastCase extends SeleniumBase {
@Test
	public void method1() throws InterruptedException {
		DemoQaTastCase c = new DemoQaTastCase();
			WelcomPage w = new WelcomPage();
			RegisterPage r = new RegisterPage();
			c.browserLanuch();
			c.launchURL();
			c.windowMax();
			w.enterUsername("jerin");
			w.enterPassword("jerj@1236547");
//			w.javascriptExecutor("xpath", "//p[@id='name']");
//			w.scrollBy();
			w.clickLogin();
			Thread.sleep(2000);
			w.loginValidation("Invalid username or password!");
			Thread.sleep(2000);
			r.javascriptExecutor();
			r.firstName("jerin");
			r.lastName("A");
			r.userName("jeroin@21234");
			r.passwordName("12365478sfg");
			r.explicitWaits("xpath", "//iframe[@title='reCAPTCHA']");
			
			
//			r.switchToFrame();
			r.checkBoxRobot();
			r.parentFrame();
			r.clickRegister();
	
	
	}

}
