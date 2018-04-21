package learningselenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week1Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load the driver	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Create a object for driver
		ChromeDriver driver=new ChromeDriver();

		//maximize the window
		driver.manage().window().maximize();
		//enter the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//find the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//find the the password
		driver.findElementById("password").sendKeys("crmsfa");
		//login into the page
		driver.findElementByClassName("decorativeSubmit").click();

		Thread.sleep(5000);

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Axxenture");
		driver.findElementById("createLeadForm_firstName").sendKeys("Raghusandeep");
		driver.findElementById("createLeadForm_lastName").sendKeys("Shetty");
		WebElement Source=driver.findElementById("createLeadForm_dataSourceId");
		Select dd =new Select(Source);
		dd.selectByVisibleText("Employee");
		Thread.sleep(5000);
		WebElement Source2=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd2 =new Select(Source2);
		List<WebElement> options = dd2.getOptions();
		dd2.selectByIndex(options.size()-1);
		Thread.sleep(5000);
		WebElement Source3=driver.findElementById("createLeadForm_currencyUomId");
		Select dd3 =new Select(Source3);
		List<WebElement> options3 = dd3.getOptions();
		dd3.selectByIndex(options3.size()-2);
		Thread.sleep(5000);
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(5000);
		driver.findElementByClassName("subMenuButtonDangerous").click();
	}
}