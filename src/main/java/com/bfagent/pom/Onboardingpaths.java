
package com.bfagent.pom;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Onboardingpaths {
    
    @FindBy(css="input[aria-invalid='false']")
    public WebElement searchbox;
    @FindBy(css="input[aria-invalid='false']")
    public WebElement searchboxWith_content;
    @FindBy(xpath="//a[@href='/dashboard/system-admin/users/c0639d2d-d3ba-4418-840d-a68c988723db']")
    public WebElement usercount ;
    @FindBy(xpath="//div[contains(text(),'Login As')]")
    public WebElement loginAsButton;
    @FindBy(css = "div[aria-haspopup='listbox']")
    public WebElement profileDropdownCssselector;
    @FindBy(xpath="//body/div[@id='menu-']/div[3]")
    public WebElement profilelist;
    @FindBy(xpath="//ul[@role='listbox']//li[@aria-selected='false']")
    public List <WebElement> profilelistalloptionsGenericXpath;
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    public WebElement continueButtonxpath;
    @FindBy(xpath="//p[contains(text(),'Asia/Calcutta')]")
    public WebElement timeZoneFieldClick;
    @FindBy(xpath="//ul[@role='listbox']")
    public WebElement timeZoneList;
    @FindBy(xpath="//li[@role='option']")
    public List <WebElement> timezoneLIstOption_genericXpath;
    @FindBy(xpath="//p[contains(text(),'Set up your profile')]")
    public WebElement timezonepagetitle;
    @FindBy(xpath="//p[contains(text(),'Choose Chat model')]")
    public WebElement chatmodelChoosePageTitle;
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]")
    public WebElement gptfourOptionXpath;
    @FindBy(xpath="//p[contains(text(),'Connect your applications')]")
    public WebElement applicationListPageTitle;
    @FindBy(xpath="//p[contains(text(),'Automate your workflows')]")
    public WebElement recipelistpageTitle;
    @FindBy(xpath="//h1[contains(text(),'Automate tasks and reporting with blueprints.')]")
    public WebElement recipeList;
    @FindBy(xpath="//textarea[@aria-invalid='false']")
    public WebElement tellusinteresttextBox;
    @FindBy(xpath="//p[contains(text(),'Set up your profile')]")
    public WebElement TimezoneTitle;

  
    public Onboardingpaths(WebDriver d){
    
    PageFactory.initElements(d,this);
  }
    public WebElement searchbox(){
     return searchbox;
     }
    public WebElement searchboxWith_content(){
     return searchboxWith_content;
     }
    public WebElement usercount(){
     return usercount;
     }
    public WebElement loginAsButton(){
     return loginAsButton;
     }
     public WebElement profileDropdownCssselector(){
     return profileDropdownCssselector;
     }
     public WebElement continueButtonxpath(){
     return continueButtonxpath;
     }
     public WebElement profilelist(){
     return profilelist;
     }    
     public WebElement timeZoneFieldClick(){
     return timeZoneFieldClick;
     }     
     public WebElement timeZoneList(){
     return timeZoneList;
     }     
     public WebElement timezonepagetitle(){
     return timezonepagetitle;
     }     
     public WebElement chatmodelChoosePageTitle(){
     return chatmodelChoosePageTitle;
     }     
     public WebElement gptfourOptionXpath(){
     return gptfourOptionXpath;
     }
     public WebElement recipelistpageTitle(){
     return recipelistpageTitle;
     }
     public WebElement recipeList(){
     return recipeList;
     }
     public WebElement tellusinteresttextBox(){
     return tellusinteresttextBox;
     }
     public WebElement TimezoneTitle(){
     return TimezoneTitle;
     }
      public WebElement applicationListPageTitle(){
     return applicationListPageTitle;
     }
     
}