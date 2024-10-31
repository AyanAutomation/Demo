
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Rssxmlcheckpaths;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RSSfeedtest {
    
    WebDriver d;
    
    
    public RSSfeedtest(WebDriver d){
        
        this.d = d;
   
    
    
    
    }
    
    public void Rssxmlcheck() throws InterruptedException{
    
        String newchatbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/button[1]";
        String Rssoption = "//p[contains(text(),'@BlueFlame Read the RSS feed at {RSS} for articles')]";
        String parameter_boxarea = "//textarea[@aria-invalid= 'false']";
        String Send ="//i[@class='ico1']";
        String Editor_Box = "//p[@data-placeholder = 'Ask me a question' ]";
        String Export_button = "//div[@class='MuiStack-root repl_share css-u4p24i']//button[@type='button']";
        
        
         Rssxmlcheckpaths rss = new Rssxmlcheckpaths(d);
          WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        
        
        d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
                 
        
        w.until(ExpectedConditions.visibilityOf(rss.Editor_Box())); 
        
        rss.Editor_Box().sendKeys("RSS");
        
        w.until(ExpectedConditions.visibilityOf(rss.Rssoption()));
        
        
        Actions a = new Actions(d);
        
       a.sendKeys(Keys.TAB).perform();
       
       
       w.until(ExpectedConditions.visibilityOf(rss.parameter_boxarea())); 
        
        rss.parameter_boxarea().sendKeys("https://feeds.a.dj.com/rss/RSSWorldNews.xml");
      
         w.until(ExpectedConditions.visibilityOf(rss.Send())); 
        
            rss.Send().click();
            w.until(ExpectedConditions.visibilityOf(rss.Export_button()));
        Thread.sleep(3900);
         
 

    }
    
}
