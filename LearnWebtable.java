package week4.day1Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get size of row//table1
		  List<WebElement> row = driver.findElements(By.xpath("(//table)[1]//tr"));
		  int size = row.size();
		  System.out.println(size);
		  //get size of column
		  List<WebElement> colCount = driver.findElements(By.xpath("(//table)[1]//tr/td"));
		  int size2 = colCount.size();
		  System.out.println(size2);
		
	}

}
