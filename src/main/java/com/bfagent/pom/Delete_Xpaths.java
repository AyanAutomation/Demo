
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Delete_Xpaths {
   
@FindBy(xpath="//*[text()='Delete']")
private WebElement Delete;
@FindBy(xpath="//*[text()='Ok']")
private WebElement Ok;
@FindBy(xpath="(//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-6dfyo3'])[1]")
private WebElement Chatlist;
@FindBy(xpath="(//div[@class='MuiBox-root css-1jnh1ax']//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-6dfyo3']//p[text()=' message'])[1]")
private WebElement Messagetext;
@FindBy(xpath="//div[@class='MuiBox-root css-1jnh1ax']//p[contains(text(),'Recent')]")
private WebElement Recentchat_text_inlist;
@FindBy(xpath="(//div[@class='MuiBox-root css-1jnh1ax']//button)[1]")
private WebElement threedotbutton;
@FindBy(xpath="//button[@aria-label='Delete Chat']")
private WebElement Top_delete_button;
@FindBy(xpath="//div[contains(text(),'Chat Deleted Successfully.')]")
private WebElement delete_success_toast;
@FindBy(xpath="//button[@aria-label='Close toast']")
private WebElement delete_success_toastcancelbutton;  
    
public Delete_Xpaths(WebDriver d){

    PageFactory.initElements(d,this);
}  
    public WebElement Delete(){
    
    return Delete;
    }
    public WebElement Ok(){
    
    return Ok;
    }
    public WebElement Chatlist(){
    
    return Chatlist;
    }
    public WebElement Messagetext(){
    
    return Messagetext;
    }
    public WebElement Recentchat_text_inlist(){
    
    return Recentchat_text_inlist;
    }
    public WebElement threedotbutton(){
    
    return threedotbutton;
    }
    public WebElement Top_delete_button(){
    
    return Top_delete_button;
    }
    public WebElement delete_success_toast(){
    
    return delete_success_toast;
    }
    public WebElement delete_success_toastcancelbutton(){
    
    return delete_success_toastcancelbutton;
    }
    
}
