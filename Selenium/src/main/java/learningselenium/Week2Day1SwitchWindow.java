package learningselenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day1SwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Project\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		driver.findElementByXPath("//a[text()='Contact Us']").click();
		Set<String> secondwindow = driver.getWindowHandles();
		ArrayList<String> listwindow = new ArrayList<String>();
		listwindow.addAll(secondwindow);
		driver.switchTo().window(listwindow.get(1));
		System.out.println(driver.getTitle());
		WebElement fax = driver.findElementByXPath("//b[text()='Fax no. : ']/..");
		System.out.println(fax.getText());
		driver.switchTo().window(listwindow.get(1)).close();
		driver.switchTo().window(listwindow.get(0));
		driver.findElementByXPath("//input[@id='usernameId']").sendKeys("helloirctc");
	}
}