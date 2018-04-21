package learnactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions build=new Actions(driver);
		build.moveToElement(driver.findElementByXPath("//span[text()='Electronics']")).perform();
		Thread.sleep(3000);
		build.click(driver.findElementByXPath("//span[text()='Apple']")).perform();
		build.click(driver.findElementByXPath("//img[@alt='iPhone']")).perform();
	}
}