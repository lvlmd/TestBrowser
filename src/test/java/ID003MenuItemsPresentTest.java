import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by lvlmd on 4/2/17.
 */
public class ID003MenuItemsPresentTest {
    public static WebDriver driver;

    @BeforeClass
    public static void startDriver(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void CheckThePage() {

        final String TheTestPageURL = "http://www.nbcolympics.com/";

        driver.navigate().to(TheTestPageURL);
        WebElement ScheduleMenuItem = driver.findElement(By.cssSelector("html.no-js.js body.html.front.not-logged-in.no-sidebars.page-node.page-node-.page-node-3626.node-type-home-page.nbcolympics-set-user-geolocation-processed.insert-xfinity-ad-processed.remind-me-modal-handler-processed.ng-scope div.mobile-overflow-wrapper header.site-header.header div.region.region-header section#block-olympics-main-menu-olympics-global-navigation.block.block-olympics-main-menu nav.nav.wrapper.clearfix div.nav-top ul.nav-main.left li.menu-1026.first"));
        assertEquals(ScheduleMenuItem.getText(), "Schedule");

    }

    @AfterClass
    public static void stopDriver(){
            driver.close();
            driver.quit();
        }
    }
