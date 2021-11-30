package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests {
    
    private WebDriver driver;
    
    @BeforeClass
    public void setup() {
	System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://petstore.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    
    @AfterClass
    public void tearDown() {
	driver.quit();
	try {
	    Runtime.getRuntime().exec("taskkill -p geckodriver.exe");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    @Test
    public void assertPopupPresent() {
	Assert.assertEquals(driver.getTitle(), "Petstore.com");
    }

}
