package Fitpeo;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitpeoAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\WIN10\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        // Maximize the browser
	        driver.manage().window().maximize();
	        // Launch Website
	        driver.get("https://fitpeo.com/");
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        WebElement RevCal = driver.findElement(By.xpath("//div[@class='MuiBox-root css-3f59le']/header/div/div[3]/div[6]/a/div"));
	        RevCal.click();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	      //This will scroll the page Horizontally till the element is found
	        WebElement scrolldown = driver.findElement(By.xpath("//div[@class='MuiBox-root css-79elbk']"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        WebElement slider = driver.findElement(By.xpath("//div[@class='MuiBox-root css-j7qwjs']/span[1]/span[3]/input"));
	        Actions action = new Actions(driver);
	        action.dragAndDropBy(slider,(int) 93.8, 0).perform();
	        action.click();    
	        
	    //  Select checkbox
	        try {
	        Thread.sleep(2000);
	        WebElement CPT99091chkbox = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[1]/label/span[1]/input"));
	        CPT99091chkbox.click();
	        WebElement CPT99453chkbox = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[2]/label/span[1]/input"));
	        CPT99453chkbox.click();
	        WebElement CPT99454chkbox = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[3]/label/span[1]/input"));
	        CPT99454chkbox.click();
	        WebElement CPT99474chkbox = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[8]/label/span[1]/input"));
	        CPT99474chkbox.click();
	        }
	        
	        catch (Exception e) {
	        	System.out.print(e);
			}
	        
	    //  Validate Value Total Recurring Reimbursement
	        
	        try {
	        
	        WebElement totalrec = driver.findElement(By.xpath("//div[@class='MuiBox-root css-rfiegf']/header/div/p[4]"));
	        
	        String text = totalrec.getText();
	        System.out.print("Verify the header displaying: " + text);
	        
	        }
	        catch (NumberFormatException e) {
	        	System.out.print(e);
			}
	   //   Close the Window     
	        driver.close();       
	                
	        
	}

}
