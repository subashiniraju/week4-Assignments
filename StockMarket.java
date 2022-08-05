package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StockMarket {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]/tbody//tr"));
		int rowsize = rows.size();
		System.out.println("All security names:"+rowsize);
		List<String> list1=new ArrayList<String>();
		for (int i = 1; i < rowsize; i++) {
			 String securitynames = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr["+i+"]/td[3]")).getText();
			list1.add(securitynames);
			
		}
		System.out.println("Security names:");
		System.out.println(list1);
		
		Set set1=new LinkedHashSet<String>(list1);
		int setsize=set1.size();
		System.out.println("Security names without duplicates:"+setsize);
		if (set1.size()<list1.size()) {
			System.out.println("Duplicate names are availble in the list");
			
		}else {
			System.out.println("No duplicate names");
		}
		
		
		
	}

}
