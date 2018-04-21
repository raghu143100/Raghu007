package learningselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetSizeofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Load the driver	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Create a object for driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.google.com/");
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='lst-ib']")));
		driver.findElementByXPath("//input[@id='lst-ib']").sendKeys("Raghusandeep",Keys.ENTER);
		List<WebElement> raghu = driver.findElementsByXPath("//a[contains(@href,'Raghu')]");
		System.out.println("Total number :" + raghu.size());
	}
}