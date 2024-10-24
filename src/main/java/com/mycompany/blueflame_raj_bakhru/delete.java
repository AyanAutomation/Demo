
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class delete {
    
    
    WebDriver d;
    
   

public delete(WebDriver d){

this.d = d;

}

String Option_button = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[1]/div[1]/span[1]";
String Delete = "//p[contains(text(),'Delete')]";
String Ok = "/html/body/div[2]/div[3]/div/div[2]/button[2]";
String Chatlist = "//div[@id='chat_list_ced1482c-d5b7-4eaf-a365-ff648f8fb64d']";
String Messagetext = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[1]/div[1]/span[1]";
String Recentchat_text_inlist = "//p[contains(text(),'Recent')]";

String threedotbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[2]/button[1]";
String Top_delete_button = "//button[@aria-label='Delete Chat']";
String delete_success_toast = "//div[contains(text(),'Chat Deleted Successfully.')]";
String delete_success_toastcancelbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
String Editor_Box = "//p[@class='is-empty is-editor-empty']";
String Send ="//i[@class='ico1']";
String newchatbutton = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/nav/div/div[1]/button";



public void Deletefromchatlist() throws InterruptedException, AWTException{
    
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(15));



 for (int i=0 ; i<30 ;i++ ){   
     
     
      Actions a = new Actions(d);
      JavascriptExecutor js = (JavascriptExecutor)d;

   
    
      
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Chatlist)));

    a.moveToElement(d.findElement(By.xpath(Chatlist))).build().perform(); 
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Recentchat_text_inlist)));
       
    
    
    try{
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Messagetext)));
        a.moveToElement(d.findElement(By.xpath(Messagetext))).build().perform();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedotbutton)));
        d.findElement(By.xpath(threedotbutton)).click();
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Delete)));
        Thread.sleep(100);
        d.findElement(By.xpath(Delete)).click();
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Ok)));
        Thread.sleep(100);
        d.findElement(By.xpath(Ok)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delete_success_toast)));
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delete_success_toastcancelbutton)));
        d.findElement(By.xpath(delete_success_toastcancelbutton)).click();
        Thread.sleep(100);
        
    }
    
    catch(TimeoutException | NoSuchElementException e){
    
    
    System.out.println("WebElement not found for Delete Operation Skipping the process");
    
    break;
    
    
    }
     

 } 

} 

public void Delete_from_top() throws InterruptedException{


 WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));

 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Top_delete_button)));
 d.findElement(By.xpath(Top_delete_button)).click();
 Thread.sleep(1000);
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Ok)));
 d.findElement(By.xpath(Ok)).click();
 Thread.sleep(1000);
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delete_success_toast)));
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delete_success_toastcancelbutton)));
 d.findElement(By.xpath(delete_success_toastcancelbutton)).click();
 Thread.sleep(1200);
 
}
}