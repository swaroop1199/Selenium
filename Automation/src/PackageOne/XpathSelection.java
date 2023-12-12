package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search_query']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Animal Trailer");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys(Keys.ENTER);
		
}
}