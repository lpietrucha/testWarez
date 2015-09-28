package pl.testWarez.seleniumWorkshop.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * Sample page
 *
 * @author Sebastiano Armeli-Battana
 */
public class HomePage extends Page {

	private final String H1_TAG = "h1";

	@FindBy(how = How.TAG_NAME, using = H1_TAG)
	@CacheLookup
	private WebElement h1Element;

	@FindBy(how = How.ID, using = "lst-ib")
	private WebElement searchField;

	@FindBy(how = How.NAME, using = "btnK")
	private WebElement searchButton;

	@FindBy(how = How.CSS, using = ".rc cite")
	private List<WebElement> resultLinks;

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public void typeTextIntoSearchField(String textToSearch) {
		 searchField.sendKeys(textToSearch);
	}

	public String getFirstResultLink() {
		return resultLinks.get(0).getText();
	}

}
