package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search 
{
	WebDriver driver;
	By searchbar=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By senddata=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By sclick=By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By animalid=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.get("https://google.com");
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println(driver.getTitle());
	

		}
		public void jpet_search()
		{
			driver.findElement(searchbar).click();
			driver.findElement(senddata).sendKeys("bulldog");
			//driver.findElement(sclick).click();			
		}

		public void senddata() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(sclick).click();		
			driver.findElement(animalid).click();
		}

		public void sbutton() 
		{
		
		driver.close();
		}

}
