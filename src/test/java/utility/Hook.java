/**
 * 
 */
package utility;

import cucumber.api.java.Before;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Hook {

	private static WebDriver driver;
	public static TouchAction touch;


	@Before("@appium")
	public WebDriver setUpAppium() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "My Phone");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//App//Wave.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
//		touch = new TouchAction((MobileDriver) driver);
//		touch.press(10, 10).waitAction(300000).moveTo(10,-200).release().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;


	}

	public void tearDown() {
		driver.quit();


	}

	public static WebDriver getDriver() {
		return driver;

	}
}



