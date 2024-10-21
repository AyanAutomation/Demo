
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Light_Darkmodeswitch {
  
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]")
    WebElement lightMode;
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]")
    WebElement darkmodebutton;
    
    public Light_Darkmodeswitch(WebDriver d){
    
    PageFactory.initElements(d,this);
    
    }
     public WebElement lightMode(){
    
     return lightMode;
      }
    public WebElement darkmodebutton(){
    
    return darkmodebutton;
 }
}
