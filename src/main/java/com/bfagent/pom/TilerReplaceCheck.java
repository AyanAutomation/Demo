
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TilerReplaceCheck {
    
    //@files Search internal files in 
    @FindBy(xpath=" //span[text()='@Files']")
    public WebElement tileA;
    //Prepare me for my next meeting
    @FindBy(xpath="//p[text()='Prepare me for my next meeting']")
    public WebElement tileB;
    //@O365 Summarize my emails from the past 12 hours a
    @FindBy(xpath="//span[text()='@O365']")
    public WebElement tileC;
    //Show me my agenda for today with people profiles
    @FindBy(xpath="//p[text()='Show me my agenda for today with people profiles']")
    public WebElement tileD;
    @FindBy(xpath="//div[@class='MuiBox-root css-b8tfif']")
    public WebElement promptcrossbot;
    @FindBy(xpath="//*[@class='MuiStack-root css-kmv9ap']//*[@type='button']")
    public WebElement Send;
    @FindBy(xpath="//div[@contenteditable=\"true\"]")
    public WebElement Editor_Boxtwo;
    @FindBy(xpath="(//div[@class='MuiStack-root css-esnk64']//button[@type='button'])[1]")
    public WebElement newchatbutton;
    
    public TilerReplaceCheck(WebDriver d){
    
    PageFactory.initElements(d, this);
    
    }
    
    public WebElement tileA(){
    
    return tileA;
    
    }
    
    public WebElement tileB(){
    
    return tileB;
        
    }
    
   public WebElement tileC(){
    
    return tileC;
        
    }
   
    public WebElement tileD(){
    
    return tileD;
        
    }
    
    public WebElement promptcrossbot(){
    
    return promptcrossbot;
        
    }
    
    public WebElement Send(){
    
    return Send;
        
    }
    
    public WebElement Editor_Boxtwo(){
    
    return Editor_Boxtwo;
        
    }
     public WebElement newchatbutton(){
    
    return newchatbutton;
        
    }
    
}
