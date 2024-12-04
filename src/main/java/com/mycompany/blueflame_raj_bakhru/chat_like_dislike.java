
package com.mycompany.blueflame_raj_bakhru;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chat_like_dislike {
 
    WebDriver d;
    
    
    public chat_like_dislike(WebDriver d){
    
    
    this.d =d;
    
    }
    
   public void likedislikestaytest() throws InterruptedException{
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    
    String capiqchat = "//*[@aria-label='CAP IQ Logo Message']";
    String gratachat = "//*[@aria-label='Grata Logo Chat']";
    String likebutton ="(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-177eotx'])[1]";
    
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gratachat)));
     d.findElement(By.xpath(gratachat)).click();
     
     for(int i =0; i<1; i++){ 
         
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(likebutton)));
     d.findElement(By.xpath(likebutton)).click();
     Thread.sleep(3800);
     }
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(capiqchat)));
     d.findElement(By.xpath(capiqchat)).click();
     Thread.sleep(1400);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gratachat)));
     d.findElement(By.xpath(gratachat)).click();
     Thread.sleep(4800);
     
     }}
