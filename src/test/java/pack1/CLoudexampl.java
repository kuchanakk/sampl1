package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CLoudexampl {
	
	public static  String USERNAME = "kirankumar69";
	public static  String AUTOMATE_KEY = "7tuyBZ4XqsNkYkqzkbzm";
	public static  String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "14");
		caps.setCapability("device", "iPhone 12");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("browserstack.local", "false");

WebDriver driver = new RemoteWebDriver(new URL(URL),caps);

	
	
	}

}
