
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chatlogo {
    
    WebDriver d;
    
    
    
    public chatlogo(WebDriver d){
       
    this.d = d;
   
    }
    
    
    public void thirdpartylogocheck() throws InterruptedException, AWTException{
    
String pitchbookchat = "//div[@class = 'MuiBox-root css-1myck0y']//p[@aria-label='PitchBook Logo Message']";
String gratachat = "//div[@class = 'MuiBox-root css-1myck0y']//p[@aria-label='Grata Logo Chat']";
String dealcloudchat = "//div[@class = 'MuiBox-root css-1myck0y']//p[@aria-label='DealCLoud Logo Message']";
String capiqchat = "//div[@class = 'MuiBox-root css-1myck0y']//p[@aria-label='CAP IQ Logo Message']";
String copyButton = "//*[@id=\"33942305-cabd-4539-bd1a-2b92ab37497c_panel\"]/div/div/div/div/div[4]/div[1]/div/div/button[1]";
String Pitchbooklogo = "//p[contains(text(),'Model changed to BlueFlame AI Agent')]";                     
                      //*[@id="bae693ab-02bd-4fc2-b853-cd8e4299dadc_panel"]/div/div/div  
                     //p[contains(text(),'@Pitchbook lightning summary on company: Rostec')]
String capIQInside_ChatElement_xpath = "//*[@id=\"f541d944-8953-461e-ad1a-3368f65e16a7_panel\"]/div/div/div/div/div[4]/div[1]/div/div/button[1]";
                     
                     

        
        
        
        
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    Robot r = new Robot();
    JavascriptExecutor js = (JavascriptExecutor)d;
   
    d.navigate().refresh();
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gratachat)));
 d.findElement(By.xpath(gratachat)).click();
 Thread.sleep(3400);
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pitchbookchat)));
 d.findElement(By.xpath(pitchbookchat)).click();
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(copyButton)));
 a.moveToElement(d.findElement(By.xpath(copyButton))).build().perform(); 
 //d.findElement(By.xpath(Messagetext)).click();
 Thread.sleep(2000);
 
 js.executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.xpath("//button[@aria-label='Rostec - www.rostec.ru']")));

 
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Pitchbooklogo)));
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dealcloudchat)));
 d.findElement(By.xpath(dealcloudchat)).click();
 Thread.sleep(3400);
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(capiqchat)));
 d.findElement(By.xpath(capiqchat)).click();
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(capIQInside_ChatElement_xpath)));
 a.moveToElement(d.findElement(By.xpath(capIQInside_ChatElement_xpath))).build().perform(); 
 //d.findElement(By.xpath(Messagetext)).click();
 Thread.sleep(2000);
 js.executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.xpath("//button[@aria-label='Rostec Corporation']")));
 
 Thread.sleep(2400); 
    
    }
     
    
    
}
