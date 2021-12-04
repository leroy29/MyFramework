package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.SearchResults;

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
    
    @Test
    public void performSearch() {
	Homepage homepage = new Homepage(driver);
	homepage.search.click();
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOf(homepage.searchInput));
	
	homepage.searchInput.sendKeys("Dog paw");
	homepage.submit.click();
	
	SearchResults searchResults = new SearchResults(driver);
	Assert.assertTrue(searchResults.firstSearchResult.isDisplayed());
    }

}
