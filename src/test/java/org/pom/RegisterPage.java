package org.pom;

import org.base.SeleniumBase;

public class RegisterPage extends SeleniumBase{
	public void firstName(String fname) {
		sendKeys("xpath", "//input[@id='firstname']", fname);
	}
	public void lastName(String lname) {
		sendKeys("xpath", "//input[@id='lastname']", lname);
	}
	public void userName(String uname) {
		sendKeys("xpath", "//input[@id='userName']", uname);
	}
	public void passwordName(String pname) {
		sendKeys("xpath", "//input[@id='password']", pname);
	}
	public void checkBoxRobot() {
		clickElement("xpath", "//div[@class='recaptcha-checkbox-border']");
	}
	public void clickRegister() {
		clickElement("xpath", "//button[@id='register']");
	}
}
