
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Logoutxpaths;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
    
    WebDriver d;
    
    public Logout( WebDriver d){
    
    this.d=d;
    
    
  }
    
  public void exit(){
  
      
      
 Logoutxpaths lg = new Logoutxpaths(d);     
      
  WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
  Actions a = new Actions(d);
  
  
  w.until(ExpectedConditions.visibilityOf(lg.Profileicon()));
  a.moveToElement(lg.Profileicon()).build().perform();
  lg.Profileicon().click();

  w.until(ExpectedConditions.visibilityOf(lg.logoutoption()));
  lg.logoutoption().click();
  
  if(lg.yesButton().isDisplayed()){
   w.until(ExpectedConditions.visibilityOf(lg.yesButton()));
  lg.yesButton().click();
  
  w.until(ExpectedConditions.visibilityOf(lg.Email_id_Field()));
  
  }
  
  else{
  
  
  System.out.println("yes confrim button for Logout not found");
  
  }
  
  }    
    
}
