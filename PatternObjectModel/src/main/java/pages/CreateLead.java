package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//input[@id='createLeadForm_companyName']")
	private WebElement eleCompanyName;
	@And("Enter Company Name (.*)")
	public CreateLead typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='createLeadForm_firstName']")
	private WebElement eleFirstName;
	@And("Enter First Name (.*)")
	public CreateLead typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='createLeadForm_lastName']")
	private WebElement eleLastName;
	@And("Enter Last Name (.*)")
	public CreateLead typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//select[@id='createLeadForm_dataSourceId']")
	private WebElement eleSource;
	@And("Select SourceID (.*)")
	public CreateLead selectSource(String value) {
		selectDropDownUsingText(eleSource, value);
		return this;
	}

	@FindBy(how=How.XPATH, using="//select[@id='createLeadForm_marketingCampaignId']")
	private WebElement eleCampaign;
	@And("Select CampaignId (.*)")
	public CreateLead selectCompaign(int value) {
		selectDropDownUsingIndex(eleCampaign, value);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@class='smallSubmit']")
	private WebElement eleCreateLeadButton;
	@When("Click on Create lead button")
	public ViewLead clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLead();
	}
}
