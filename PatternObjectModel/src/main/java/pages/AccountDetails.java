package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountDetails extends ProjectMethods{
	
	public AccountDetails() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//a[text()='Find Accounts']")
	private WebElement eleFindAccount;
	
	public Accounts clickFindAccount() {
		click(eleFindAccount);
		return new Accounts();
	}
	
}
