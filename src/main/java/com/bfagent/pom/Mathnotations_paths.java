
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Mathnotations_paths {
    
    @FindBy(xpath = "//i[@class='ico1']")
    public WebElement Send;
    
    @FindBy(xpath="//div[@class='MuiStack-root repl_share css-u4p24i']//button[@type='button']")
    public WebElement Export_button;
   
    public Mathnotations_paths(WebDriver d){
    
    PageFactory.initElements(d, this);
    
   }
    public WebElement Send(){
    
    return Send;
     }
    public WebElement Export_button(){
    
    return Export_button;
    }
    
}
