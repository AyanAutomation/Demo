
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Autocompletexpaths;
import java.awt.AWTException;
import java.awt.Robot;
import static java.nio.file.Files.list;
import java.time.Duration;
import static java.util.Collections.list;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Autocomplete_functions {
    
    WebDriver d;
    
    
    
    public Autocomplete_functions(WebDriver d){
    
       this.d =d;
     
    }
    
    
    public void extrafolder_issue_check() throws InterruptedException, AWTException{
    

    String Desired_option = "Upload Sample/AAPL-US Piper Sandler Companies 04 Aug '23.pdf";
    
    
    Autocompletexpaths folder = new Autocompletexpaths(d);
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Screenzoom zm = new Screenzoom(d);   
    Actions a = new Actions(d);
    JavascriptExecutor js = (JavascriptExecutor)d;
     
     w.until(ExpectedConditions.visibilityOf(folder.newchatbutton())); 
     folder.newchatbutton().click();
     w.until(ExpectedConditions.visibilityOf(folder.Editor_Box())); 
     folder.Editor_Box().click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOf(folder.promptcrossbot()));
     folder.promptcrossbot().click();
     a.moveToElement(d.findElement(By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']"))).build().perform();
     js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });", folder.tileA());
     w.until(ExpectedConditions.visibilityOf(folder.tileA())); 
     folder.tileA().click();
     zm.zoomout80();
     Thread.sleep(1500);
     
     w.until(ExpectedConditions.visibilityOf(folder.Autocomplete_box())); 
     folder.Autocomplete_box().click();
   
     Thread.sleep(1500);
     
     folder.Autocomplete_box().sendKeys("pip");
     
     w.until(ExpectedConditions.visibilityOf(folder.Autocomplete_list()));
     a.moveToElement(folder.Autocomplete_list()).build().perform();
     
     
     List <WebElement> allptions = folder.Genericxpaths;
    
     for (WebElement alloption :allptions){
     
       System.out.println(alloption.getText());
 
      if(alloption.getText().equalsIgnoreCase(Desired_option)){
    
      alloption.click();
      d.navigate().refresh();
      break;
     
     }}}
    
    public void autocompleteoption_backspace_delete_check() throws InterruptedException{
   
    Autocompletexpaths folder = new Autocompletexpaths(d);
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    JavascriptExecutor js = (JavascriptExecutor)d;   
    Actions a = new Actions(d); 
    
    
    
     w.until(ExpectedConditions.visibilityOf(folder.newchatbutton())); 
     folder.newchatbutton().click();
     w.until(ExpectedConditions.visibilityOf(folder.Editor_Box())); 
     folder.Editor_Box().click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOf(folder.promptcrossbot()));
     folder.promptcrossbot().click();
     a.moveToElement(d.findElement(By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']"))).build().perform();
     js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });", folder.tileA());
     w.until(ExpectedConditions.visibilityOf(folder.tileA())); 
     folder.tileA().click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOf(folder.Autocomplete_box())); 
     folder.Autocomplete_box().click();
     Thread.sleep(1500);
     
     folder.Autocomplete_box().sendKeys("pip");
     
     for(int i=0; i<=2; i++ ){
     folder.Autocomplete_box().sendKeys(Keys.BACK_SPACE);
     Thread.sleep(2500);
    }}}
