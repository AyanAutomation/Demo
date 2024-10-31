
package com.mycompany.blueflame_raj_bakhru;

import static dev.failsafe.internal.util.Assert.isTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tilereplace {
    
    WebDriver d;
    


public  Tilereplace(WebDriver d){


this.d =d;

}


public void Replacecheck() throws InterruptedException{


      //@files Search internal files in 
    
    String tileA = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
    
    //Prepare me for my next meeting
    String tileB = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
    
    //@O365 Summarize my emails from the past 12 hours a
    String tileC = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";
    //Run Company Research on {company name}
    String tileD = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]";
    String promptcrossbot = "//*[@id=\"chat_write_area\"]/div/div[2]/div/div/div/div[1]/button";
    
    String Send ="//i[@class='ico1']";
    String Editor_Boxtwo = "//p[@data-placeholder = 'Ask me a question' ]";
    String newchatbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/button[1]/*[1]";
                            
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    JavascriptExecutor js = (JavascriptExecutor)d;    
    Actions a = new Actions(d);
    
    
    
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
     d.findElement(By.xpath(newchatbutton)).click();  
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Boxtwo))); 
      d.findElement(By.xpath(Editor_Boxtwo)).clear();
        
        d.findElement(By.xpath(Editor_Boxtwo)).sendKeys("Testing ");
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptcrossbot)));
       
       d.findElement(By.xpath(promptcrossbot)).click();
       
       
       a.moveToElement(d.findElement(By.xpath("(//div[@class='MuiCardContent-root css-1qw96cp'])[1]"))).build().perform();
      
       // Scroll the container to the target menu item 
      /* Scroll the element into view using scrollIntoView. 
       Here, the behavior: 'smooth' parameter enables a smooth scrolling animation, and inline: 
       'nearest' ensures the container scrolls horizontally or vertically as needed. */
       
       js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });", d.findElement(By.xpath(tileA)));
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tileA)));
       d.findElement(By.xpath(tileA)).click();
       Thread.sleep(1200);
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tileB)));
       d.findElement(By.xpath(tileB)).click();
       Thread.sleep(1200);
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tileC)));
       d.findElement(By.xpath(tileC)).click();
       Thread.sleep(1200);
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tileD)));
       d.findElement(By.xpath(tileD)).click();
       Thread.sleep(1200);
       d.navigate().refresh();
               
}
}