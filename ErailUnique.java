package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		
//		Set the system property and Launch the URL
		
//		Click the 'sort on date' checkbox
		
//		clear and type in the from station text field
		
//		clear and type in the to station text field
		
//		Add a java sleep for 2 seconds
		
//		Store all the train names in a list
		
//		Get the size of it
		
//		Add the list into a new Set
		
//		And print the size of it
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://erail.in/");
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Chennai Beach Jn");
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Bangalore Cant");
		Thread.sleep(2000);
		List <WebElement> trainNames =driver.findElementsByXPath("//table [@class='DataTable TrainList TrainListHeader']//td[2]/a");
		List <String> trainList =new ArrayList<String>();
		for (WebElement element: trainNames)
		{
			trainList.add(element.getText());
		}
		
		System.out.println("Train List "+trainList.size());
		
		Set <String> trainSet =new HashSet<String>();
		for (String str:trainSet)
		{
			trainSet.add(str);
		}
		
		System.out.println("Train List after added into set "+trainSet.size());
		

	}

}