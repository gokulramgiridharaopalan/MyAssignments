package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;

//

public class Login {

	public static void main(String[] args) {
		
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver  driver = new ChromeDriver(options);
			//EdgeDriver  driver1 = new EdgeDriver();
		driver.get("http:leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(150);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(150);
		//Get Title -> Get the title of the current page
		String title = driver.getTitle();
		System.out.println(title);
		// click crfma link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//driver.close();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Intel");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Goku");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		WebElement webel = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select sour = new Select(webel);
		sour.selectByValue("INR");
		WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select soul = new Select(own);
		soul.selectByVisibleText("Partnership");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gokulram@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
