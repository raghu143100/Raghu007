package homework;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Project\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("test007456");
		driver.findElementById("userRegistrationForm:password").sendKeys("ravindra");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("ravindra");
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select dd=new Select(securityQ);
		//List<WebElement> options = dd.getOptions();
		dd.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Chintu");
		WebElement language = driver.findElementById("userRegistrationForm:prelan");
		Select l1=new Select(language);
		l1.selectByVisibleText("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Raghu");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("sandeep");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Shetty");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
		Select dob=new Select(dobDay);
		dob.selectByVisibleText("13");
		WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select month=new Select(dobMonth);
		month.selectByVisibleText("DEC");
		WebElement dateOfBirth = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select year=new Select(dateOfBirth);
		year.selectByValue("1993");
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select ocupation=new Select(occupation);
		ocupation.selectByVisibleText("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("3532464365364");
		driver.findElementById("userRegistrationForm:idno").sendKeys("ASDF345432");
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		Select country=new Select(countries);
		country.selectByVisibleText("India");
		List<WebElement> count = country.getOptions();
		for(int i=1;i<count.size();i++)
		{
			System.out.println(count.get(i).getText());
		}
		int total=count.size();
		System.out.println("Total countries :" +total);
		driver.findElementById("userRegistrationForm:email").sendKeys("dummy@gamil.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543456");
		WebElement nationalityId = driver.findElementById("userRegistrationForm:nationalityId");
		Select nation=new Select(nationalityId);
		nation.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("ramnagar");
		driver.findElementById("userRegistrationForm:street").sendKeys("ramstreet");
		driver.findElementById("userRegistrationForm:area").sendKeys("rammandir");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600063",Keys.TAB);
		Thread.sleep(5000);
		WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
		Select city=new Select(cityName);
		city.selectByValue("Kanchipuram");
		Thread.sleep(5000);
		WebElement postofficeName = driver.findElementById("userRegistrationForm:postofficeName");
		Select pin=new Select(postofficeName);
		pin.selectByValue("Old Perungalathur B.O");
		/*List<WebElement> options5 = pin.getOptions();
		pin.selectByIndex(options5.size()-1);*/
		driver.findElementById("userRegistrationForm:landline").sendKeys("044123456");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
	}
}