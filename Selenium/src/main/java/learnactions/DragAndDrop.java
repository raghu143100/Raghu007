package learnactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions build=new Actions(driver);
		WebElement drag = driver.findElementById("draggable");
		int x = drag.getLocation().getX();
		int y = drag.getLocation().getY();
		WebElement drop = driver.findElementById("droppable");
		build.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		WebElement drag1 = driver.findElementById("draggable");
		int x1 = drag.getLocation().getX();
		int y1 = drag.getLocation().getY();
		build.clickAndHold(drag1).moveByOffset(-(x1-x), -(y1-y)).release().perform();
	}
}