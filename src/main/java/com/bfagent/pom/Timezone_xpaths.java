
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Timezone_xpaths {
    
@FindBy(xpath="//div[@class='MuiBox-root css-teec7v']")
 private WebElement Profileicon;
@FindBy(xpath="//p[text()='Profile']")
 private WebElement Profileoption;
@FindBy(xpath="(//p[text()='Edit'])[1]")
 private WebElement timezone_editButtin;
@FindBy(xpath="//div[@class='MuiBox-root css-1a3b6a']")
 private WebElement timezone_fieldXpath;
@FindBy(xpath="//input[@placeholder='Search']")
 private WebElement timezoneOption_searchbox;
@FindBy(xpath="//span[contains(text(),'Kolkata')]")
 private WebElement kolkataOption;
@FindBy(xpath="//p[contains(text(),'Save')]")
 private WebElement saveButton;
@FindBy(xpath="//div[text()='Timezone updated successfully! Your settings have been saved and the new timezone is now in effect.']")
 private WebElement successToast;
@FindBy(xpath="//button[@aria-label='Close toast']")
 private WebElement toastCrossbot;

public Timezone_xpaths(WebDriver d){
    PageFactory.initElements(d, this);
}
    public WebElement Profileicon(){
    
    return Profileicon;
    }
    public WebElement Profileoption(){
    
    return Profileoption;
    }
    public WebElement timezone_editButtin(){
    
    return timezone_editButtin;
    }
    public WebElement timezone_fieldXpath(){
    
    return timezone_fieldXpath;
    }
    public WebElement timezoneOption_searchbox(){
    
    return timezoneOption_searchbox;
    }
    public WebElement kolkataOption(){
    
    return kolkataOption;
    }
    public WebElement saveButton(){
    
    return saveButton;
    }
    public WebElement successToast(){
    
    return successToast;
    }
    public WebElement toastCrossbot(){
    
    return toastCrossbot;
    }
    
    
    
}
