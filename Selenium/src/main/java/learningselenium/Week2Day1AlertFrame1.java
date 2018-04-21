package learningselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day1AlertFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String msg="Hello Alert";
		driver.switchTo().alert().sendKeys(msg);
		driver.switchTo().alert().accept();
		WebElement get = driver.findElementByXPath("//p[contains(text(),'How are you')]");
		String store = get.getText();
		if(store.contains(msg))
			System.out.println("The entere text matched");
		else
			System.out.println("Does not match the entered text");
	}
}