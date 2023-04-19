package org.pom;
import org.apache.xmlbeans.impl.soap.Text;
import org.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomPage extends SeleniumBase{
	

	public void enterUsername(String text) {
	sendKeys("xpath", "//input[@id='userName']", text);
	}
	public void enterPassword(String pass) {
		sendKeys("xpath", "//input[@id='password']", pass);
	}
	public void clickLogin() {
		clickElement("xpath", "//button[@id='login']");
	}
	
	public void loginValidation(String valid) {
		getText("xpath", "//p[@id='name']", valid);
		}
	
	}
		
	

