package generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenericUtils 
{
     public static void getscreenshot(WebDriver driver,String name)
     {
    	 SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy");
    	 String date = s.format(new Date());
    	 TakesScreenshot ts = (TakesScreenshot) driver;
    	 File src = ts.getScreenshotAs(OutputType.FILE);
    	 File dest = new File("./ScreenShot/"+date+" "+name+".png");
    	 try 
    	 {
			Files.copy(src, dest);
		 } 
    	 catch (IOException e) 
    	 {
			
		 }
     }
     public static void SelectByIndex(WebElement element,int index)
     {
    	 Select sel = new Select(element);
    	 sel.selectByIndex(index);
     }
     public static void SelectByValue(WebElement element, String value)
     {
    	 Select sel = new Select(element);
    	 sel.selectByValue(value);
     }
     public static void SelectByVisibleText(WebElement element,String text)
     {
    	 Select sel = new Select(element);
    	 sel.selectByVisibleText(text);			 
     }
     public static void JavaScriptClickOnOkButton(WebDriver driver)
     {
    	 driver.switchTo().alert().accept();
     }
     public static void JavaScriptClickOnCancelButton(WebDriver driver)
     {
    	 driver.switchTo().alert().dismiss();
     }
     public static void JavaScriptEnterText(WebDriver driver,String text)
     {
    	 Alert alert = driver.switchTo().alert();
    	 alert.sendKeys(text);
    	 alert.accept();
     }
}
