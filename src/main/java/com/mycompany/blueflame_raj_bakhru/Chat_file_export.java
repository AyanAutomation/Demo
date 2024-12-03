
package com.mycompany.blueflame_raj_bakhru;


import com.bfagent.pom.Chat_Export_xpaths;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Chat_file_export {
    
    
    WebDriver d;
    
    
public Chat_file_export(WebDriver d){

this.d = d;

}
    
    
public void chat_export_filename() throws InterruptedException{

Chat_Export_xpaths paths = new Chat_Export_xpaths(d);


    delete del = new delete(d);

     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
     
     w.until(ExpectedConditions.visibilityOf(paths.Export_button())); 
     paths.Export_button().click();  
     
     w.until(ExpectedConditions.visibilityOf(paths.exportlist()));
     
     w.until(ExpectedConditions.visibilityOf(paths.myoption())); 
     paths.myoption().click();

    w.until(ExpectedConditions.visibilityOf(paths.downloadstartmessage()));
    
    try{
    
    w.until(ExpectedConditions.visibilityOf(paths.downloadsuccessmessage()));
    }
     catch(TimeoutException e){
     
     System.out.println("Desired Toast Message not found Chat Export download, Thereby moving on to following steps");
     
     
     }
    
    
    
    del.Delete_from_top();
   
 d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");

}}
