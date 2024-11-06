
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Light_Darkmodeswitch {
  
    @FindBy(xpath="(//ul[@class='MuiList-root MuiList-padding switch_div css-1ontqvh']//button[@type='button'])[1]")
    WebElement lightMode;
    @FindBy(xpath="(//ul[@class='MuiList-root MuiList-padding switch_div css-1ontqvh']//button[@type='button'])[2]")
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
