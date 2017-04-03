import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lvlmd on 4/2/17.
 */
public class ID002CheckNewPageTest {

    public static WebDriver driver;

    @BeforeClass
    public static void startDriver(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void CheckThePage(){

        final String TheTestPageURL = "http://www.nbcolympics.com/";

        driver.navigate().to(TheTestPageURL);
        assertThat (driver.getTitle(), is("2018 PyeongChang Olympic Games | NBC Olympics"));
        assertThat (driver.getCurrentUrl(), is(TheTestPageURL));
        assertThat (driver.getPageSource(), containsString("XXIII Olympic Winter Games: Feb. 8-25, 2018"));

    }
    @AfterClass
    public static void stopDriver(){
        driver.close();
        driver.quit();
    }


}
