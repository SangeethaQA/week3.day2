package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
//		Launch the browser
		
//		Launch the URL - https://erail.in/
		
//		Uncheck the check box - sort on date
		
//		clear and type in the source station 
		
//		clear and type in the destination station
		
//		Find all the train names using xpath and store it in a list
		
//		Use Java Collections sort to sort it and then print it
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://erail.in/");
		driver.manage().window().maximize() ;
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Chennai Beach Jn");
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Bangalore Cant");
		List <WebElement> findTrain =driver.findElementsByXPath("//table [@class='DataTable TrainList TrainListHeader']//td[2]/a");
		List <String> trainnames =new ArrayList<String>();
		
		
		for (WebElement element :findTrain) {
			System.out.println( "Train names for selected station"+ trainnames.add(element.getText()));
			
		}
		Collections.sort(trainnames);
		System.out.println("Train names after sorting : " +trainnames);
		
		
		
		
		
	}



	}


