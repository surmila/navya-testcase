package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart 
{
	WebDriver driver;
	By animalid=By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/a[1]");
	//By click=By.linkText("EST-7");
	By addtocart=By.xpath("//a[@class='Button']");
	By updatecart=By.xpath("//input[@name='updateCartQuantities']");
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=K9-BD-01");
		System.out.println(driver.getTitle());
	

		}
		public void jpet_cart() throws InterruptedException
		{
			driver.findElement(animalid).click();
			Thread.sleep(3000);
			//driver.findElement(click).click();	
		}

		public void add() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(addtocart).click();		
		}

		public void update() 
		{
			driver.findElement(updatecart).click();	
			driver.close();
		}
}
