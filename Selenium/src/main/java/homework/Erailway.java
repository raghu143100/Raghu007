package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailway {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://erailway.co.in/");
		driver.findElementById("source").sendKeys("MAS",Keys.TAB);
		driver.findElementById("destination").sendKeys("SBC",Keys.TAB);
		driver.findElementByXPath("//button[text()='Get Trains']").click();
		WebElement table = driver.findElementByXPath("//table[@id='train_title']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//Row count
		System.out.println("Total rows count ="+rows.size());		
		//	System.out.println("Total rows count ="+columns.size());
		for (int i=1; i<rows.size();i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			System.out.println(columns.get(1).getText());
		}
		driver.close();
	}
}