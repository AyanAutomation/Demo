
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Rssxmlcheckpaths {
    
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/button[1]")
     public WebElement newchatbutton;   
    @FindBy(xpath="//p[contains(text(),'@BlueFlame Read the RSS feed at {RSS} for articles')]")
    public WebElement Rssoption;
    @FindBy(xpath="//textarea[@aria-invalid= 'false']")
     public WebElement parameter_boxarea;
    @FindBy(xpath="//*[@class='MuiStack-root css-kmv9ap']//*[@type='button']")
     public WebElement Send;
     @FindBy(xpath="//p[@data-placeholder = 'Ask me a question' ]")
     public WebElement Editor_Box;
     @FindBy(xpath="//div[@class='MuiStack-root css-7iwxlc']//button[@type='button']")
     public WebElement Export_button;
     
     
     public Rssxmlcheckpaths(WebDriver d){
     
     PageFactory.initElements(d, this);
    }
     public WebElement newchatbutton(){
     return newchatbutton;
    }
     public WebElement Rssoption(){
    return Rssoption;
    }
    public WebElement parameter_boxarea(){
    return parameter_boxarea;
    }
    public WebElement Send(){
    return Send;
    }
    public WebElement Editor_Box(){
    return Editor_Box;
    } 
    public WebElement Export_button(){
    return Export_button;
    } 
}
