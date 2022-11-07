package org.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCode {

	public static WebDriver driver;
	
	public static WebDriver Browserlaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
	}
	
	public static  void urlLaunch(String url) {
		driver.get(url);
}
	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
}
	public static void sendKeys(WebElement F ,String E) {
		F.sendKeys(E);
}
	public static void click(WebElement c) {
		c.click();
}
	public static void JavaScript(String script, WebElement K) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(script, K);
}
	public static String getText(WebElement T) {
		String text = T.getText();
		System.out.println(text);
		return text;
}
    public static String window2() {
		String parentId = driver.getWindowHandle();
		Set<String> allid2 = driver.getWindowHandles();
	for(String eachId : allid2) {
		if(!parentId.equals(eachId)) {
			driver.switchTo().window(eachId);
		}
	}
	return null;
}
    public static String Actions(WebElement a) {
    	 Actions a1=new Actions(driver);
        a1.moveToElement(a).perform();
		return null;
}
     public static void Alerts() {
     Alert a= driver.switchTo().alert();
     a.accept();
}
    public static void Alerts2() {
	Alert a=driver.switchTo().alert();
     a.dismiss();
}
    public static void urlLaunch2(String url2) {
		driver.navigate().to(url2);
}
    public static void TotalTable() {
	   List<WebElement> webTable = driver.findElements(By.tagName("table"));
}
    
    public static void DropDown(WebElement D, int d) {
		Select s=new Select(D);
		s.selectByIndex(d);
}
    public static void Navigate() {
		driver.navigate().back();

	}
    
    
	
	
	
}
