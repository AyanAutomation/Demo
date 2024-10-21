
package com.mycompany.blueflame_raj_bakhru;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Multiparameter {
    
    WebDriver d;
    
    
    public Multiparameter(WebDriver d ){
    
    
    this.d = d;
    
    
    }
    
    
  public void  Cursorpositioncheck() throws InterruptedException{
  
  
        String Editor_Box = "//p[@class='is-empty is-editor-empty']";
        String Send ="//i[@class='ico1']";
        String prompt_option ="//p[contains(text(),'Run Multi Recipe { Parameter A } { Parameter B } {')]";
        String parameterbox = "//textarea[@aria-invalid='false']";
        String newchatbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/button[1]";
        String Keyword ="Multi recipe";
  
  
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
      /*   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
         d.findElement(By.xpath(newchatbutton)).click(); */
        
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");  
      
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        
        d.findElement(By.xpath(Editor_Box)).sendKeys(Keyword);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
        
        Thread.sleep(2000);
        d.navigate().refresh();
        
        
  
  }
    
    
  
  
  
    
}
