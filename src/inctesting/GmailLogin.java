package inctesting;

import org.openqa.selenium.By;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	WebDriver driver;
	
	public void openchrome() throws InterruptedException
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayush\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();  
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		Thread.sleep(2000);
	
	    
	}

	public void gmaillogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@data-action=\"sign in\"and text()=\"Sign in\"]")).click();
		WebElement Username= driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Username.sendKeys(excel.getData(1,1,0);
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		Thread.sleep(5000);
		WebElement Password = driver.findElement(By.xpath("//div/input[@type=\"password\"]"));
	     Password.sendKeys(excel.getData(1,1,1);
	     driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	     
		
	}
	public void compaosemail() throws InterruptedException
	{
		Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@role=\"button\" and text()=\"Compose\"]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[text()=\"Recipients\"]")).click();
		Thread.sleep(3000);
		WebElement email =driver.findElement(By.xpath("//div/textarea[@name=\"to\"]"));
		Thread.sleep(3000);
		email.sendKeys("ayushsengar98@gmail.com");
		WebElement subject =driver.findElement(By.xpath("//input[@name=\"subjectbox\"]"));
		subject.sendKeys("Incubyte");
		WebElement textarea =driver.findElement(By.xpath("//div[@role=\"textbox\"]"));
		textarea.sendKeys("Automation QA test for Incubyte");
		driver.findElement(By.xpath("//div[@class=\"dC\"]/div")).click();
			
		
	}
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@class=\"gb_Aa gbii\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a[text()=\"Sign out\"]")).click();
	}
	public static void main(String[] args) throws InterruptedException
	{
		
		Exceldata excel= new Exceldata("C:\\Users\\ayush\\OneDrive\\Desktop\\Testdata\\testdata.xlsx");
			// TODO Auto-generated method stub
		GmailLogin obj= new GmailLogin();
		obj.openchrome();
		obj.gmaillogin();
		obj.compaosemail();
		obj.logout();
		
		
			
		}

	

}
