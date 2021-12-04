package pages.proposed;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomepageValidators {
    private WebDriver driver;
    private HomepageElements elements;
    
    public HomepageValidators(WebDriver driver, HomepageElements elements) {
	this.driver = driver;
	this.elements = elements;
    }
    
    public void assertTitleIs(String expectedTitle) {
	Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}
