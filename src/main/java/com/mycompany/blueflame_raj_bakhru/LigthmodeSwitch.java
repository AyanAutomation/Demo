
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Light_Darkmodeswitch;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LigthmodeSwitch {
    
    WebDriver d;
   
    public LigthmodeSwitch(WebDriver d){
   
    this.d = d;
 }

    public void switchonLightmode(){
        
        Light_Darkmodeswitch sw = new Light_Darkmodeswitch(d);
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
        
      w.until(ExpectedConditions.visibilityOf(sw.lightMode()));
        boolean  modeStatus = sw.lightMode().isSelected();
        
         //System.out.println(modeStatus);
        
       if( modeStatus= true){
         
       sw.lightMode().click();
       }
       
       else{
               
               System.out.println("lightmode is enabled");
          }
    
 }
    
  
    public void switchOFFLightmode(){
    
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
        Light_Darkmodeswitch sw = new Light_Darkmodeswitch(d);
       
       w.until(ExpectedConditions.visibilityOf(sw.darkmodebutton()));
        
       
        boolean  modeStatus = sw.darkmodebutton().isSelected();
       
            if( modeStatus= true){
         
          sw.darkmodebutton().click();
       }
       
       else{
               
               System.out.println("darkmode is already enabled");
          }
 }
    
}
