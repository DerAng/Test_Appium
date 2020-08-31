package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {

		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "WAS-LX3");
			caps.setCapability(MobileCapabilityType.UDID, "6XTDU17717001183");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

			URL url = new URL("http://localhost:4723/wd/hub");
			// http://localhost:4723/wd/hub

			driver = new AppiumDriver<MobileElement>(url, caps);
			// driver = new AndroidDriver<AndroidElement> (url,caps);
			driver.manage().deleteAllCookies();
			

		} catch (Exception e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}

	}

	@Test
	public void sampleTest() {
		System.out.println("I am inside sample Test");
	}

	@AfterTest
	public void tearDown() {
		driver.quit(); // Cierra el navegador una vez completa la prueba
	}

}
