
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TilerReplaceCheck {
    
    //@files Search internal files in 
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement tileA;
    //Prepare me for my next meeting
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement tileB;
    //@O365 Summarize my emails from the past 12 hours a
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement tileC;
    //Run Company Research on {company name}
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement tileD;
    @FindBy(xpath="//*[@id=\"chat_write_area\"]/div/div[2]/div/div/div/div[1]/button")
    public WebElement promptcrossbot;
    @FindBy(xpath="//i[@class='ico1']")
    public WebElement Send;
    @FindBy(xpath="//div[@contenteditable=\"true\"]")
    public WebElement Editor_Boxtwo;
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
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
