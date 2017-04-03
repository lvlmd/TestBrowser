import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by lvlmd on 3/31/17.
 */
public class ID001CheckTheTitleTest {
    private static WebDriver driver;

    @BeforeClass
    public static void StartBrowserTest() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void OpenTheBrowser(){
        driver.get("http://www.nbcolympics.com");
        //assertTrue (driver.getTitle().startsWith("2018 PyeongChang Olympic Games | NBC Olympics"));
        assertTrue (driver.getTitle().startsWith("2018 PyeongChang Olympic Games | NBC Olympics"));
        assertThat (driver.getTitle(), is("2018 PyeongChang Olympic Games | NBC Olympics"));

    }

    @AfterClass
    public static void CloseBrowserTest() {
        driver.close();
        driver.quit();
    }


}
