package learningselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week1Day2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load the driver	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Create a object for driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("g");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait driv=new WebDriverWait(driver,10);
		driv.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();		
	}
}