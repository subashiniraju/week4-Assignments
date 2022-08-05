package week4.day1Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> column = driver.findElements(By.xpath("(//table)[1]//th"));
		int columnsize = column.size();
		System.out.println(columnsize);
		
		List<String> library=new ArrayList<String>();
		for (int i = 1; i < columnsize-1 ; i++) {
	    String text = driver.findElement(By.xpath("(//table)[1]/tbody/tr[1]/td["+i+"]")).getText();
		library.add(text);
			
		}
		System.out.println("Market Share:");
		System.out.println(library);
		
		List<String> library1=new ArrayList<String>();
		for (int j = 1; j < columnsize-1 ; j++) {
			String text1 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td["+j+"]")).getText();
			library1.add(text1);
			
			}System.out.println("Absolute Usage:");
			System.out.println(library1);
		
			}
		
	
			}
		
		


