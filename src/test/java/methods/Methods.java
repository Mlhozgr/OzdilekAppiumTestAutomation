package methods;
import basetest.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
public class Methods {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public  AppiumDriver<MobileElement>  appiumDriver;
    BaseTest baseTest;
    public Methods(){
        baseTest = new BaseTest();
        this.appiumDriver = BaseTest.appiumDriver;
    }



    public void scrolls() throws InterruptedException {
        // Logger.info("Sayfa Asagi Kaydiriliyor Lutfen Bekleyiniz...");
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width*0.5);
        int start_y = (int) (dimension.height*0.8);

        int end_x = (int) (dimension.width*0.5);
        int end_y = (int) (dimension.height*0.2);
        for(int i=0; i<48; i++){
            TouchAction action =
                    new TouchAction(appiumDriver)
                            .press(PointOption.point(start_x, start_y))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                            .moveTo(PointOption.point(end_x, end_y))
                            .release().perform();

        }
}


}
