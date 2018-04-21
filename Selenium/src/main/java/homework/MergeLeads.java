package homework;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'ComboBox_partyIdFrom')]/img")));
		driver.findElementByXPath("//a[contains(@href,'ComboBox_partyIdFrom')]/img").click();
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> listwindows = new ArrayList<String>();
		listwindows.addAll(allwindows);
		driver.switchTo().window(listwindows.get(1));
		WebDriverWait driv=new WebDriverWait(driver,30);
		WebElement gettext = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a");
		String inputtext = gettext.getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(inputtext);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driv.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a")));
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a").click();
		driver.switchTo().window(listwindows.get(0));
		driver.findElementByXPath("//a[contains(@href,'ComboBox_partyIdTo')]/img").click();
		Set<String> allwindows2 = driver.getWindowHandles();
		ArrayList<String> listwindows2 = new ArrayList<String>();
		listwindows2.addAll(allwindows2);
		driver.switchTo().window(listwindows2.get(1));
		WebElement gettext2 = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a");
		String inputtext2 = gettext2.getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(inputtext2);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driv.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a")));
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a").click();
		driver.switchTo().window(listwindows.get(0));
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.switchTo().alert().accept();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(inputtext);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driv.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a")));
		WebElement finaltext = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a");
		String ftext = finaltext.getText();
		if(inputtext!=ftext)
		{
			WebElement error = driver.findElementByXPath("//div[text()='No records to display']");
			System.out.println(error.getText());
		}
		driver.close();
	}
}