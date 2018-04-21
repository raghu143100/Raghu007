package wdMethods;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException has occured");
			e.printStackTrace();
		}finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		WebDriverWait wait= new WebDriverWait(driver,40);

		try {
			switch (locator) {
			case "id":
				wait.until(ExpectedConditions.elementToBeClickable(By.id(locValue)));
				ele = driver.findElementById(locValue);
				break;
			case "class":
				wait.until(ExpectedConditions.elementToBeClickable(By.className(locValue)));
				ele = driver.findElementByClassName(locValue);
				break;
			case "LinkText":
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText(locValue)));
				ele = driver.findElementByLinkText(locValue);
				break;
			case "Xpath":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locValue)));
				ele = driver.findElementByXPath(locValue);
				break;
			case "Name":
				wait.until(ExpectedConditions.elementToBeClickable(By.name(locValue)));
				ele = driver.findElementByName(locValue);
				break;
			case "Tag":
				wait.until(ExpectedConditions.elementToBeClickable(By.tagName(locValue)));
				ele = driver.findElementByTagName(locValue);
				break;
			case "CSS":
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locValue)));
				ele = driver.findElementByCssSelector(locValue);
				break;			
			}
		}catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {


		WebDriverWait wait2= new WebDriverWait(driver, 40);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id(locValue)));
		return driver.findElementById(locValue);
	} 


	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data, Keys.TAB);
			System.out.println("The Entered Value "+data);
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}

	}

	public void clickWithNoSnap(WebElement ele) {

		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}

	}

	public String getText(WebElement ele) {

		String gettext = ele.getText();
		System.out.println("The Text captured is : " +gettext);
		takeSnap();
		return gettext;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {

		try {
			Select dd=new Select(ele);
			dd.selectByVisibleText(value);
			java.util.List<WebElement> options = dd.getOptions();
			/*for(int i=1;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}*/
			System.out.println("Total values :" +options.size()+" The given value is selected as :"+value);
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		try {
			Select dd=new Select(ele);
			dd.selectByIndex(index);
			java.util.List<WebElement> options = dd.getOptions();
			/*for(int i=1;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}*/
			System.out.println("Total values :" +options.size()+" The given value is selected as :"+index);
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {

		try {
			Select dd=new Select(ele);
			dd.selectByValue(value);
			java.util.List<WebElement> options = dd.getOptions();
			/*for(int i=1;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}*/
			System.out.println("Total values :" +options.size()+" The given value is selected as :"+value);
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}
	}


	public boolean verifyTitle(String expectedTitle) {

		try {
			String title = driver.getTitle();

			if(title.equals(expectedTitle))
				System.out.println(("Exptected Value :"+expectedTitle)+"\n"+("The current value :"+title)+"Matched");
			else
				System.out.println(("Exptected Value :"+expectedTitle)+"\n"+("The current value :"+title)+"Not Matched");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}

		return true;
	}
	
	public void getTitle(){

			System.out.println(driver.getTitle());
			
	}

	public void verifyExactText(WebElement ele, String expectedText) {

		try {
			String text = ele.getText();

			if(text.equals(expectedText))
				System.out.println(("Exptected Value :"+expectedText)+"\n"+("The current value :")+text+"Matched");
			else
				System.out.println(("Exptected Value :"+expectedText)+"\n"+("The current value :")+text+"NOT Matched");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		try {
			String text = ele.getText();

			if(text.contains(expectedText))
				System.out.println(("Exptected Value :"+expectedText)+"\n"+("The current value :"+text)+"Matched");
			else
				System.out.println(("Exptected Value :"+expectedText)+"\n"+("The current value :"+text)+"NOT Matched");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			String attribute2 = ele.getAttribute(attribute);

			if(attribute2.equals(value))
				System.out.println(("Exptected Value :"+value)+"\n"+("The current value :"+attribute2)+"Matched");
			else
				System.out.println(("Exptected Value :"+value)+"\n"+("The current value :"+attribute2)+"NOT Matched");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		try {
			String attribute2 = ele.getAttribute(attribute);

			if(attribute2.contains(value))
				System.out.println(("Exptected Value :"+value)+"\n"+("The current value :"+attribute2)+"Matched");
			else
				System.out.println(("Exptected Value :"+value)+"\n"+("The current value :"+attribute2)+"NOT Matched");
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}

	}

	public void verifySelected(WebElement ele) {

		try {
			System.out.println("The checkbox is selection state is - " + ele.isSelected());
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void unselect(WebElement ele) {

		try {
			boolean selected = ele.isSelected();

			takeSnap();
			if (selected==true)
			{
				ele.click();
				System.out.println("The element is unselected successfully");
			}
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}

	}
	public void select(WebElement ele) {

		try {
			boolean selected = ele.isSelected();

			takeSnap();
			if (selected==false)
			{
				ele.click();
				System.out.println("The element is selected successfully");
			}
		} catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}


	}

	public void verifyDisplayed(WebElement ele) {

		try {
			System.out.println("The checkbox is selection state is - " + ele.isDisplayed());
		}catch (ElementNotVisibleException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (TimeoutException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}catch (StaleElementReferenceException e) {
			System.out.println("Stale exception has occured");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("WebDriverException has occured");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally{
			takeSnap();
		}

	}

	public void switchToWindow(int index) {

		try {
			Set<String> allwindows = driver.getWindowHandles();
			ArrayList<String> listwindows = new ArrayList<String>();
			listwindows.addAll(allwindows);
			driver.switchTo().window(listwindows.get(index));
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}

	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void switchToFrameUsingID(String id) {
		try {
			driver.switchTo().frame(id);
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}
	
	
	public void switchToFrameUsingName(String name) {
		try {
			driver.switchTo().frame(name);
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void switchToFrameUsingIndex(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void typeOnAlert(String data ) {
		try {
			driver.switchTo().alert().sendKeys(data);
			System.out.println("The Entered Value "+data);
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
	}

	public void dismissAlert() {

		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}


	}

	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		System.out.println("The Text contains in the alert :"+""+text);
		return text;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Snapshots/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("IOException has occured");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
		i++;
	}



	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBrowsers() {
		driver.quit();

	}

	public void clear(WebElement ele) {

		try {
			ele.clear();
			System.out.println("The element is clicked successfully");
		} catch (Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}finally {
			takeSnap();
		}

	}
}