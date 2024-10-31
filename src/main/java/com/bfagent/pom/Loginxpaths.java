
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginxpaths {
    
    
   @FindBy(xpath = "//button[@type='submit']")
    public WebElement Login_SubmitButton_xpath;
   @FindBy(xpath= "//input[@placeholder='Email Address']")
    public WebElement Email_id_Field;
   @FindBy(xpath= "(//button[@type='button'])[2]")
   public WebElement Email_submit_button;
   @FindBy(xpath= "//*[@id=\"outlined-basic\"]")
   public WebElement Password_field;
   @FindBy(xpath= "//h3[contains(text(),'Chat')]")
   public WebElement Chat_list_title;
   @FindBy(xpath= "//div[text()='Invalid email or password']")
   public WebElement errorMessage;
   
   
   public Loginxpaths(WebDriver d){
    PageFactory.initElements(d,this);
   }
   
    public WebElement Login_SubmitButton_xpath(){
        return Login_SubmitButton_xpath;
   }
    public WebElement Email_id_Field(){
        return Email_id_Field;
    }
    
    public WebElement Email_submit_button(){
    return Email_submit_button;
    }
    
    public WebElement Password_field(){
    
        return Password_field;
    }
      public WebElement Chat_list_title(){
    
        return Chat_list_title;
    }
        public WebElement errorMessage(){
    
        return errorMessage;
    }
 
          
}
