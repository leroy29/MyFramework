package pages.proposed;

import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    private HomepageElements elements;
    
    public Homepage(WebDriver driver) {
	this.driver = driver;
	this.elements = new HomepageElements(driver);
    }
    
    public HomepageValidators validate() {
	return new HomepageValidators(this.driver, this.elements);
    }
}
