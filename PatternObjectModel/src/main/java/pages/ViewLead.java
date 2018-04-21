package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH, using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleVerifyFirstName;

	public ViewLead verifyFirstName(String data) {

		verifyExactText(eleVerifyFirstName, data);
		return this;	
	}

	@FindBy(how=How.XPATH, using="//a[contains(@href,'updateLeadForm?partyId')]")
	private WebElement eleclickEdit;
	@And("Click Edit Button")
	public ViewLead clickEditButton() {
		click(eleclickEdit);
		return this;
	}

	@FindBy(how=How.XPATH, using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleenterCompanyName;
	@And("Change the Company Name (.*)")
	public ViewLead enterCompnayName(String data) {
		clear(eleenterCompanyName);
		type(eleenterCompanyName, data);
		return this;
	}

	@FindBy(how=How.XPATH, using="//input[@value='Update']")
	private WebElement eleclickUpdate;
	@When("Click Update Button")
	public ViewLead clickUpdateButton() {
		click(eleclickUpdate);
		return this;
	}

	@FindBy(how=How.XPATH, using="//a[@href='javascript:document.deleteLeadForm.submit()']")
	private WebElement eleclickDeleteButton;

	public MyLeads clickDeleteButton() {
		click(eleclickDeleteButton);
		return new MyLeads();
	}

	@FindBy(how=How.XPATH, using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleGetFirstLeadName;

	public ViewLead getFirstLeadName() {
		leadFirstLeadName = getText(eleGetFirstLeadName);
		return this;
	}

	public ViewLead verifyDuplicatedLeadName() {
		verifyExactText(eleGetFirstLeadName, leadFirstLeadName);
		return this;
	}

	@FindBy(how=How.XPATH, using="//a[text()='Duplicate Lead']")
	private WebElement eleClickDuplicateButton;

	public DuplicateLead clickDuplicateButton() {
		click(eleClickDuplicateButton);
		return new DuplicateLead();
	}

}