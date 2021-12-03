package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {
    
    private WebDriver driver;
    
    @FindBy(xpath = "(//a[@class='grid-product__link '])[1]")
    public WebElement firstSearchResult;
    
    public SearchResults(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }

}
