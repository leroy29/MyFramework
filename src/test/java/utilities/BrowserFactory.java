package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    
    public static WebDriver getBrowser(BrowserType type) {
	WebDriver driver = null;
	switch(type) {
		case CHROME: {
		    break;
		}
		case FIREFOX: {
		    System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		    driver = new FirefoxDriver();
		    break;
		}
		default: {
		    break;
		}
	}
	return driver;
    }
}
