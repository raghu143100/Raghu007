package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement checkbox = driver.findElementByXPath("//div[@id='contentblock']/section/div[1]/input[1]");
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		WebElement checkbox1 = driver.findElementByXPath("//div[@id='contentblock']/section/div[2]/input[1]");
		System.out.println("The checkbox is selection state is - " + checkbox1.isSelected());
		checkbox1.click();
		System.out.println("The checkbox is selection state is - " + checkbox1.isSelected());
	}
}