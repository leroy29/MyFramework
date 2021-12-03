package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private WebDriver driver;

    @FindBy(id = "NewsletterPopup-newsletter-popup")
    public WebElement newsLetterPopup;

    @FindBy(xpath = "//a[@href='/search']")
    public WebElement search;
    
    @FindBy(xpath = "//input[@placeholder='Search our store']")
    public WebElement searchInput;
    
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    public Homepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
}
