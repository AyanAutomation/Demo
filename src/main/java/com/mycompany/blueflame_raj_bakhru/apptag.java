
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class apptag {
    
    
    
    
    WebDriver d;
    
    public apptag(WebDriver d){
    
    
    this.d = d;
    
    
    
    
    }
    
  public void alphabetically_app_name() throws InterruptedException, AWTException{
  
  Blueflamemodel_defaultmodel_switch swtch = new Blueflamemodel_defaultmodel_switch(d);
  
  swtch.switchingTodefaultAimodel();
  
        String Editor_Box = "//p[@data-placeholder = 'Ask me a question' ]";
        
        String prompt_option ="//p[normalize-space()='DealCloud']";
        String Keyword = "@D";
        
        
        
        
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        
    d.findElement(By.xpath(Editor_Box)).sendKeys(Keyword);
        
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
    d.findElement(By.xpath(prompt_option)).click();
 }  
    
}
