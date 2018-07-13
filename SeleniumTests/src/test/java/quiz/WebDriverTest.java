package quiz;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class WebDriverTest
{
    private static WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException
    {
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());

        driver.manage().window().maximize();
        driver.get("localhost:8080");
    }

    @Test
    public void test()
    {
    }
}
