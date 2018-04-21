package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//a[text()='Create Lead']")
	private WebElement eleCreateLead;
	@And("Click Create Lead")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Merge Leads']")
	private WebElement eleMergeLeads;
	@And("Click Merge Leads")
	public MergeLeads clickMergeLeads() {
		click(eleMergeLeads);
		return new MergeLeads();
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Find Leads']")
	private WebElement eleclickFindLeads;
	@And("Click Find Leads")
	public FindLeads clickFindLeads() {
		click(eleclickFindLeads);
		return new FindLeads();
	}
}
