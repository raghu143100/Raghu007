package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//a[text()='Leads']")
	private WebElement eleLeads;
	@And("Click Leads Tab")
	public MyLeads clickLeadsMenu() {
		click(eleLeads);
		return new MyLeads();
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Accounts']")
	private WebElement eleAccounts;
	
	public Accounts clickAccountsMenu() {
		click(eleAccounts);
		return new Accounts();
	}

}
