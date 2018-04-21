package learningselenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IndedJob {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		Actions build=new Actions(driver);

		WebElement result1 = driver.findElementByXPath("(//a[@data-tn-element='jobTitle'])[1]");
		build.sendKeys(result1, Keys.CONTROL).click().perform();
		Set<String> window1 = driver.getWindowHandles();
		ArrayList<String> listwindow = new ArrayList<String>();
		listwindow.addAll(window1);
		driver.switchTo().window(listwindow.get(1));
		System.out.println("Title of the page :"+driver.getTitle());
		driver.switchTo().window(listwindow.get(0));
		WebElement result2 = driver.findElementByXPath("(//a[@data-tn-element='jobTitle'])[2]");
		build.sendKeys(result2, Keys.CONTROL).click().perform();
		Set<String> window2 = driver.getWindowHandles();
		ArrayList<String> listwindow2 = new ArrayList<String>();
		listwindow2.addAll(window2);
		driver.switchTo().window(listwindow2.get(2));
		System.out.println("Title of the page :"+driver.getTitle());
		driver.switchTo().window(listwindow2.get(0));

		WebElement list = driver.findElementByXPath("//div[contains(@class,'row')]");
		List<WebElement> list2 = list.findElements(By.xpath("(//a[contains(@target,'_blank')])"));
		System.out.println(list2.size());

		for(int i=2; i<list2.size(); i++) {
			WebElement webElement = list2.get(i);
			build.sendKeys(webElement, Keys.CONTROL).click().perform();
			Set<String> window3 = driver.getWindowHandles();
			ArrayList<String> listwindow3 = new ArrayList<String>();
			listwindow3.addAll(window3);
			driver.switchTo().window(listwindow3.get(i));
			System.out.println("Title of the page :"+driver.getTitle());
			driver.switchTo().window(listwindow3.get(0));
		}
		driver.quit();
	}
}