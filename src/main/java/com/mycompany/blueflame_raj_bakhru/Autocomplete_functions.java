
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
    
    
    String Desired_option = "PRF/BlueFlame Test Cases/Front-End Pipeline Management/Mandrake Capital Real Estate Fund II_February 2024.pdf";
    
    
    Autocompletexpaths folder = new Autocompletexpaths(d);
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Screenzoom zm = new Screenzoom(d);   
     
     w.until(ExpectedConditions.visibilityOf(folder.newchatbutton())); 
     folder.newchatbutton().click();
     w.until(ExpectedConditions.visibilityOf(folder.Editor_Box())); 
     folder.Editor_Box().click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOf(folder.newchatbutton()));
     folder.newchatbutton().click();
     w.until(ExpectedConditions.visibilityOf(folder.tileA())); 
     folder.tileA().click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOf(folder.Autocomplete_box())); 
     folder.Autocomplete_box().click();
     Thread.sleep(1500);
     
     zm.zoomout80();
     folder.Autocomplete_box().sendKeys("pip");
     
     w.until(ExpectedConditions.visibilityOf(folder.Autocomplete_list()));
     
     List <WebElement> alloptions = folder.List_Generic_xpaths();
     
     
     for (WebElement alloption :alloptions){
     
       System.out.println(alloption.getText());
 
      if(alloption.getText().equalsIgnoreCase(Desired_option)){
    
      
      alloption.click();
      d.navigate().refresh();
      break;
     }
     }
   }
    
    
    public void autocompleteoption_backspace_delete_check() throws InterruptedException{
    
    
    String newchatbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/button[1]";
    String Editor_Box = "//p[@class='is-empty is-editor-empty']";
    String tileA = "//span[contains(text(),'@Files')]";
    String Autocomplete_box = "//input[@aria-autocomplete = 'list']";
    String Autocomplete_list = "//ul[@role='listbox']//li[@role='option'][1]";
    
    String List_Generic_xpaths = "//li[@class = 'MuiAutocomplete-option MuiBox-root css-16r7kf5']"; 
    String promptcrossbot = "//*[@id=\"chat_write_area\"]/div/div[2]/div/div/div/div[1]/button";
    String Desired_option = "AEP/Project Vivid/3.0 Products, Customers, Sales & Marketing/3.4 Sales Pipeline/3.4.1 GCI_Consolidated Sales Pipeline_03.03.23_Redacted.xlsx";
    
    
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    JavascriptExecutor js = (JavascriptExecutor)d;   
     
    
    
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
     d.findElement(By.xpath(newchatbutton)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptcrossbot)));
     d.findElement(By.xpath(promptcrossbot)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tileA))); 
     js.executeScript("arguments[0].scrollIntoView(true)", d.findElement(By.xpath(tileA)));
     d.findElement(By.xpath(tileA)).click();
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_box))); 
     d.findElement(By.xpath(Autocomplete_box)).click();
     Thread.sleep(1500);
     d.findElement(By.xpath(Autocomplete_box)).sendKeys("Ayn Demo");
     
     for(int i=0; i<=2; i++ ){
     d.findElement(By.xpath(Autocomplete_box)).sendKeys(Keys.BACK_SPACE);
     Thread.sleep(2500);
    }
    
    
    
    
    }
    
    
}
