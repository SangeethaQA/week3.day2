package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize() ;
		WebElement eleSearch=driver.findElementByXPath("//input[@name='searchVal']");
		eleSearch.sendKeys("Bags");
		eleSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		//driver.findElementByXPath("//input[@id='Men']").click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElementByXPath("//label[@for='Men - Fashion Bags']").click();
		driver.findElementByXPath("//div[@class='length']").getText();
		
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());

		for (WebElement webElement1 : bagNameList) {
			String text = webElement1.getText();
			System.out.println(text);
		}
		
		//
		
		
		
		

	}

}
