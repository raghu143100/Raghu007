package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
	public MergeLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//a[contains(@href,'ComboBox_partyIdFrom')]/img")
	private WebElement eleFromLead;
	@And("Click From Lead Icon")
	public FindLeads clickFromLeadIcon() {
		click(eleFromLead);
		return new FindLeads();
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(@href,'ComboBox_partyIdTo')]/img")
	private WebElement eleTOLead;
	@And("Click To Lead Icon")
	public FindLeads clickTOLeadIcon() {
		click(eleTOLead);
		return new FindLeads();
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Merge']")
	private WebElement eleMerge;
	@And("Click Merge Button")
	public MergeLeads clickMerge() {
		clickWithNoSnap(eleMerge);
		acceptAlert();
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Find Leads']")
	private WebElement eleclickFindLeads;
	@And("Click Find Leads on MergeLeads")
	public FindLeads clickFindLeads() {
		click(eleclickFindLeads);
		return new FindLeads();
	}
	
		
}