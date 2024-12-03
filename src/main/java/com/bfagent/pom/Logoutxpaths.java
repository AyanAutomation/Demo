
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Logoutxpaths {
    
    @FindBy(xpath="//div[@class='MuiStack-root css-2pxfmk']//i")
    public WebElement Profileicon;
    @FindBy(xpath="//p[contains(text(),'Logout')]")
    public WebElement logoutoption;
    @FindBy(xpath="//div[text()='Yes']")
    public WebElement yesButton;
    @FindBy(xpath="//input[@placeholder='Email Address']")
    public WebElement Email_id_Field;
    
    
    public Logoutxpaths(WebDriver d){
    PageFactory.initElements(d,this);
    }
     public WebElement Profileicon(){
     return Profileicon;
     }
     public WebElement logoutoption(){
     return logoutoption;
     }
     public WebElement yesButton(){
   
        return yesButton;}
     
     public WebElement Email_id_Field(){
     
     return Email_id_Field;
     }
        
}
