package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	public DuplicateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID, using="sectionHeaderTitle_leads")
	private WebElement eleHeader;
	public DuplicateLead verifyHeaderTitle(String expectedText) {
		verifyExactText(eleHeader, expectedText);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@value='Create Lead']")
	private WebElement eleCreateLead;
	
	public ViewLead clickCreateLead() {
		click(eleCreateLead);
		return new ViewLead();
	}

}
