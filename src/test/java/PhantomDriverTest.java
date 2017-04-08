import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;

/**
 * Created by lvlmd on 4/7/17.
 */
public class PhantomDriverTest {
    @Test
    public static void main(String[] args) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/usr/local/bin/phantomjs");

        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.nbcolympics.com");
        System.out.println(driver.getTitle());
        //System.out.print("Test PASSED");
        driver.close();
        driver.quit();
    }

}
