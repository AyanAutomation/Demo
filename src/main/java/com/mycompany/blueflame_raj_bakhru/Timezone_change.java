
package com.mycompany.blueflame_raj_bakhru;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Timezone_change {

WebDriver d;

public Timezone_change(WebDriver d){


this.d = d;

}

String Profileicon = "//div[@class='profile_drop MuiBox-root css-0']";
String Profileoption = "//body/div[@id='simple-popover']/div[3]/li[1]/p[1]";
String timezone_editButtin = "//tbody/tr[@id='timezone']/td[3]/button[1]/div[1]";
String timezone_fieldXpath = "//div[@class='MuiBox-root css-1a3b6a']";
String timezoneOption_searchbox = "//input[@placeholder='Search']";       
String kolkataOption = "//span[contains(text(),'Kolkata')]"; 
String saveButton = "//p[contains(text(),'Save')]";
String successToast = "//div[contains(text(),'Timezone updated successfully! Your settings have ')]";
String toastCrossbot = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";        
        
        
        
        
        
        



public void timezone_changeto_Local(){

    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
  Actions a = new Actions(d);

  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Profileicon)));
  a.moveToElement(d.findElement(By.xpath(Profileicon))).build().perform();
  d.findElement(By.xpath(Profileicon)).click();

  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Profileoption)));
  d.findElement(By.xpath(Profileoption)).click();

  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timezone_editButtin)));
  d.findElement(By.xpath(timezone_editButtin)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timezone_fieldXpath)));
  d.findElement(By.xpath(timezone_fieldXpath)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timezoneOption_searchbox)));
  d.findElement(By.xpath(timezoneOption_searchbox)).sendKeys("Kolkata");
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(kolkataOption)));
  d.findElement(By.xpath(kolkataOption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveButton)));
  d.findElement(By.xpath(saveButton)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successToast)));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossbot)));
  d.findElement(By.xpath(toastCrossbot)).click(); 
  d.get("https://app-dev.blueflame.ai/dashboard/chat");






}







    
}
