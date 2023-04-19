import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class CommonFile {
	String correcttext = "Sorry, we don't recognize this email.";
	Robot r;
	
	public void robotClass() throws AWTException {
		r = new Robot();
	}
	public void pressEnter() throws AWTException {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}
