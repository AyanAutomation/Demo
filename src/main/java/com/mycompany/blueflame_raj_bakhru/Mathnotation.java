
package com.mycompany.blueflame_raj_bakhru;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mathnotation {
    
    WebDriver d;
    



public Mathnotation(WebDriver d){

this.d = d;


}


public void checkmathnotation() throws InterruptedException{

  String Editor_Box = "//p[@data-placeholder = 'Ask me a question' ]";
  
  String Send ="//i[@class='ico1']";
  String Export_button = "//div[@class='MuiStack-root repl_share css-u4p24i']//button[@type='button']";
  
  WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box)));
  d.findElement(By.xpath(Editor_Box)).sendKeys("@chatgpt show all arccosine functions");
  Thread.sleep(1000); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send)));      
  d.findElement(By.xpath(Send)).click();
      
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button)));




}

}