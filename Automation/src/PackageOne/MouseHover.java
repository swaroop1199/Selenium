package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[2]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		
	}

	}


