
package com.mycompany.blueflame_raj_bakhru;


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

String Export_button = "//div[@class='MuiStack-root repl_share css-u4p24i']//button[@type='button']";
                         
String optionspaths = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1p4qlti']";
String exportlist = "//ul[@role='menu']//li[@role='menuitem'][1]";  
String myoption = "/html/body/div[2]/div[3]/ul/li[2]";
String downloadstartmessage = "//div[contains(text(),'Download Started')]";
String downloadsuccessmessage = "//div[contains(text(),'Download Completed')]";

String Success_message_crossbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";


    delete del = new delete(d);

     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button))); 
     d.findElement(By.xpath(Export_button)).click();  
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(exportlist)));
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myoption))); 
     d.findElement(By.xpath(myoption)).click();

    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(downloadstartmessage)));
    
    try{
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(downloadsuccessmessage)));
    }
     catch(TimeoutException e){
     
     System.out.println("Desired Toast Message not found Chat Export download, Thereby moving on to following steps");
     
     
     }
    
    
    
    del.Delete_from_top();
   
 d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");

}    
    
    
    
    
}
