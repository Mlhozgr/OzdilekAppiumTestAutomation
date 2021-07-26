import basetest.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.android.AndroidDriver;
import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

public class StepImplementation extends BaseTest {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Methods methods;

    public StepImplementation() {
        methods = new Methods();
    }

    @Step("<id>id li elemente tıkla")
    public void clickByid(String id){
        appiumDriver.findElement(By.id(id)).click();
        logger.info("Elemente tiklandi");


    }
    @Step("<key> xpath li elemente tıkla")
    public  void clickByxpath(String key){
        appiumDriver.findElement(By.xpath(key)).click();
        logger.info("Elemente tiklandi");

    }
    @Step("Sayfanın en aşagasına gelene kadar swipe et")
    public void swipe() throws InterruptedException{
    methods.scrolls();
    logger.info("Sayfanin en asagisina gelindi");

    }
    @Step("<key> li elementin olup olmadığını kontrol")
    public void assertId(String key){
        Assert.assertTrue("Sayfa acilamadi",appiumDriver.findElement(By.id(key)).isDisplayed());
        logger.info("Sayfa kontrolu yapildi");
    }
    @Step("<key> saniye bekle")
    public void wait(int key) throws InterruptedException{
      Thread.sleep(key*1000);
        logger.info("1 saniye beklendi");

    }

}
