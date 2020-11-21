import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ContactClassicTest {

    @Test
    public void search() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("deviceName","127.0.0.1:7555");
        desiredCapabilities.setCapability("appPackage","com.tencent.wework");
        desiredCapabilities.setCapability("appActivity","com.tencent.wework.launch.WwMainActivity");
        desiredCapabilities.setCapability("noReset","true");

        AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(MobileBy.id("beh")).click();
        Thread.sleep(3000);
        driver.findElement(MobileBy.id("i63")).click();

    }
}
