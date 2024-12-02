
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Delete_Xpaths;
import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
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




public void Deletefromchatlist() throws InterruptedException, AWTException{
    
   WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(15));
   Delete_Xpaths delpaths = new Delete_Xpaths(d);
   
for (int i=0 ; i<30 ;i++ ){   
     
     Actions a = new Actions(d);
     JavascriptExecutor js = (JavascriptExecutor)d;

    w.until(ExpectedConditions.visibilityOf(delpaths.Chatlist()));
    a.moveToElement(delpaths.Chatlist()).build().perform(); 
    js.executeScript("arguments[0].scrollIntoView(true);",delpaths.Recentchat_text_inlist());
    w.until(ExpectedConditions.visibilityOf(delpaths.Recentchat_text_inlist()));
   try{
        w.until(ExpectedConditions.visibilityOf(delpaths.Messagetext()));
        try{
        a.moveToElement(delpaths.Messagetext()).build().perform();
        w.until(ExpectedConditions.visibilityOf(delpaths.threedotbutton()));
        delpaths.threedotbutton().click();
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOf(delpaths.Delete()));
        Thread.sleep(100);
        delpaths.Delete().click();}
        catch(Exception e){
        a.moveToElement(delpaths.Messagetext()).build().perform();
        w.until(ExpectedConditions.visibilityOf(delpaths.threedotbutton()));
        delpaths.threedotbutton().click();
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOf(delpaths.Delete()));
        Thread.sleep(100);
        delpaths.Delete().click();
        }
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOf(delpaths.Ok()));
        Thread.sleep(100);
        delpaths.Ok().click();
        w.until(ExpectedConditions.visibilityOf(delpaths.delete_success_toast()));
        Thread.sleep(100);
        w.until(ExpectedConditions.visibilityOf(delpaths.delete_success_toastcancelbutton()));
        delpaths.delete_success_toastcancelbutton().click();
        Thread.sleep(100);
    }
    catch(TimeoutException e){
    System.out.println("TimeoutException found");
    break;
    }
    catch(NoSuchElementException e){
    System.out.println("NoSuchElementException found");
    break;
    }
    catch(StaleElementReferenceException e){
    System.out.println("StaleElementReferenceException found");
    break;
    }}} 

public void Delete_from_top() throws InterruptedException{

WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
Delete_Xpaths delpaths = new Delete_Xpaths(d);

 w.until(ExpectedConditions.visibilityOf(delpaths.Top_delete_button()));
 delpaths.Top_delete_button().click();
 Thread.sleep(1000);
 w.until(ExpectedConditions.visibilityOf(delpaths.Ok()));
 delpaths.Ok().click();
 Thread.sleep(1000);
 w.until(ExpectedConditions.visibilityOf(delpaths.delete_success_toast()));
 w.until(ExpectedConditions.visibilityOf(delpaths.delete_success_toastcancelbutton()));
 delpaths.delete_success_toastcancelbutton().click();
 Thread.sleep(800);
 
}}