package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
       driver.findElement(By.name("LC20lb MBeuO DKV0Md")).click();
//	
       
//        wait = WebDriverWait(driver, 10)
//        		elem = wait.until(EC.presence_of_element_located((By.XPATH, "//span[text()='Next']/parent::div")))
//        		driver.execute_script("arguments[0].click();", elem)
//		
		driver.close();

		
		
	}
}