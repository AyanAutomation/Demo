
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.TilerReplaceCheck;
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

 
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    JavascriptExecutor js = (JavascriptExecutor)d;    
    Actions a = new Actions(d);
    TilerReplaceCheck rp = new TilerReplaceCheck(d);
    
    
    w.until(ExpectedConditions.visibilityOf(rp.newchatbutton())); 
    rp.newchatbutton().click();  
    w.until(ExpectedConditions.visibilityOf(rp.Editor_Boxtwo())); 
    rp.Editor_Boxtwo().clear();
        
    rp.Editor_Boxtwo().sendKeys("Testing");
    w.until(ExpectedConditions.visibilityOf(rp.promptcrossbot()));
       
       rp.promptcrossbot().click();
       
      
       // Scroll the container to the target menu item 
      /* Scroll the element into view using scrollIntoView. 
       Here, the behavior: 'smooth' parameter enables a smooth scrolling animation, and inline: 
       'nearest' ensures the container scrolls horizontally or vertically as needed. */
       
       js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });", rp.tileA());
       w.until(ExpectedConditions.visibilityOf(rp.tileA()));
       rp.tileA().click();
       Thread.sleep(1200);
       w.until(ExpectedConditions.visibilityOf(rp.tileB()));
       rp.tileB().click();
       Thread.sleep(1200);
       w.until(ExpectedConditions.visibilityOf(rp.tileC()));
       rp.tileC().click();
       Thread.sleep(1200);
       w.until(ExpectedConditions.visibilityOf(rp.tileD()));
       rp.tileD().click();
       Thread.sleep(1200);
       d.navigate().refresh();
               
}
}