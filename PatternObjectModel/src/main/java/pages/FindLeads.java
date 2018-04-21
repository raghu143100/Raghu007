package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	


	@FindBy(how=How.XPATH, using="//input[@name='id']")
	private WebElement eleCreateLead;
	@And("Enter Lead ID in New Window (.*)")
	public FindLeads enterLeadIDNewWindow(String id) {
		switchToWindow(1);
		type(eleCreateLead, id);
		return this;
	}
	@And("Enter Lead ID (.*)")
	public FindLeads enterLeadID(String id) {
		type(eleCreateLead, id);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Phone']")
	private WebElement elePhoeTab;

	public FindLeads clickPhoneTab() {
		click(elePhoeTab);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Email']")
	private WebElement eleEmailTab;

	public FindLeads clickEmailTab() {
		click(eleEmailTab);
		return this;
	}

	@FindBy(how=How.XPATH, using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleLeadFirstName;
	@And("Enter Lead FirstName (.*)")
	public FindLeads enterLeadFirstName(String name) {
		clear(eleLeadFirstName);
		type(eleLeadFirstName, name);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;

	public FindLeads enterPhoneNumber(String phone) {
		type(elePhoneNumber, phone);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='emailAddress']")
	private WebElement eleEmailID;

	public FindLeads enterEmailID(String email) {
		type(eleEmailID, email);
		return this;
	}

	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement eleclickFindLeadsButton;
	@And("Click FindLeads Button")
	public FindLeads clickFindLeadsButton() {
		click(eleclickFindLeadsButton);
		return this;
	}

	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleSelectFirstResult;
	@And("Select First Result New Window")
	public MergeLeads selectFirstResultNewWindow() {
		clickWithNoSnap(eleSelectFirstResult);
		switchToWindow(0);
		return new MergeLeads();
	}
	@And("Select First Result")
	public ViewLead selectFirstResult() {
		clickWithNoSnap(eleSelectFirstResult);
		return new ViewLead();
	}
	
	public FindLeads getLeadID() {
		firstResultLeadID = getText(eleSelectFirstResult);
		return this;
	}
	


}