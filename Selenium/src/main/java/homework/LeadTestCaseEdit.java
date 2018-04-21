package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadTestCaseEdit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CRM/SFA")));
		driver.findElementByLinkText("CRM/SFA").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
		driver.findElementByLinkText("Leads").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/crmsfa/control/findLeads']")));
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("g");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("//a[contains(@href,'updateLeadForm?partyId')]").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Testing");
		driver.findElementByXPath("//input[@value='Update']").click();
		WebElement text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		System.out.println("Compnay Name will contains with ID :"+text.getText());
		driver.close();
	}
}