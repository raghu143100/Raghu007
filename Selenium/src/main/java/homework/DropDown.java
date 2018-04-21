package homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dd1 = driver.findElementById("dropdown1");
		Select s1=new Select(dd1);
		s1.selectByIndex(3);
		//size.selectByIndex(total.size()-2);
		WebElement dd2 = driver.findElementByName("dropdown2");
		Select s2=new Select(dd2);
		s2.selectByVisibleText("UFT/QTP");
		WebElement dd3 = driver.findElementById("dropdown3");
		Select s3=new Select(dd3);
		s3.selectByValue("3");
		WebElement dd4 = driver.findElementByClassName("dropdown");
		Select s4=new Select(dd4);
		List<WebElement> total = s4.getOptions();
		System.out.println("Total number of dropdowns : "+total.size());
		driver.findElementByXPath("//div[@id='contentblock']/section/div[5]/select").sendKeys("UFT/QTP");
		WebElement dd6 = driver.findElementByXPath("//div[@id='contentblock']/section/div[6]/select/option[4]");
		dd6.click();
	}
}