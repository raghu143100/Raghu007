package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("	");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		driver.findElementById("buttonFromTo").click();
		boolean checkbox = driver.findElementById("chkSelectDateOnly").isSelected();
		if(checkbox==true)
		driver.findElementById("chkSelectDateOnly").click();
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//Row count
		System.out.println("Total Train list ="+rows.size());		
		//	System.out.println("Total rows count ="+columns.size());
		for (int i=0; i<rows.size();i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			System.out.println(columns.get(1).getText());
		}
		driver.close();
	}
}