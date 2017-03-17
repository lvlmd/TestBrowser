import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFFTest {

        private static WebDriver driver;

        @BeforeClass
        public static void StartBrowserTest(){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        @Test
        public void OpenFFBrowserTest()
        {
           //WebDriver driver = new FirefoxDriver();
            //driver.manage().window().maximize();
            driver.get("http://moldgaster.com");
            //driver.close();
            //driver.quit();
        }
        @AfterClass
        public static void CloseBrowserTest(){
            driver.close();
            driver.quit();
        }

}
