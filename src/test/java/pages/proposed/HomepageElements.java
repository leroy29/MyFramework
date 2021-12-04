package pages.proposed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class HomepageElements {
    private WebDriver driver;

    @FindBy(id = "NewsletterPopup-newsletter-popup")
    protected WebElement newsLetterPopup;

    @FindBy(xpath = "//a[@href='/search']")
    protected WebElement search;

    @FindBy(xpath = "//input[@placeholder='Search our store']")
    protected WebElement searchInput;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement submit;

    protected HomepageElements(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
}
