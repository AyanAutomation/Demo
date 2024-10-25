
package com.bfagent.pom;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI_model_Paths {

@FindBy(xpath = "//button[@aria-label='BlueFlame AI Agent']")
public WebElement Aimodeltab;
@FindBy(xpath="//p[contains(text(),'GPT-4 (OpenAI)')]")
 public WebElement Gpt4model;
@FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/button[1]")
public WebElement  Aigpt4tab;
@FindBy(xpath="//img[@src='/assets/images/lightButton.svg']")
public WebElement Light_mode;
@FindBy(xpath="//div[@class='profile_drop MuiBox-root css-0']")
public WebElement Profileicon;
@FindBy(xpath="//p[contains(text(),'Profile')]")
public WebElement Profileoption;
@FindBy(xpath="(//p[text()='Edit'])[2]")
public WebElement Default_model_editbutton;
@FindBy(xpath="//p[contains(text(),'BlueFlame AI Agent')]")
public WebElement Defaultoption;
@FindBy(xpath="//p[contains(text(),'Llama3 (Large)')]")
public WebElement Lamaoption;
@FindBy(xpath="//p[text()='Save']")
public WebElement Savebutton;
@FindBy(xpath="//div[contains(text(),'Default Web Chat Model Updated Successfully.')]")
public WebElement savesuccessmessage;
@FindBy(xpath="//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]")
public WebElement toastcrossone;
@FindBy(xpath="//*[@id=\"default-direct\"]/td[3]/button")
public WebElement LLM_editbutton;
@FindBy(xpath="//p[contains(text(),'GPT-4 (OpenAI)')]")
public WebElement LLMoption;
@FindBy(xpath="//p[contains(text(),'BlueFlame AI Agent')]")
public WebElement LLMoptiontochoose;
@FindBy(xpath="//*[@id=\"default-direct\"]/td[3]/div/button[1]")
public WebElement LLMsavebutton;
@FindBy(xpath="//div[contains(text(),'Direct LLM Updated Successfully.')]")
public WebElement LLMsuccess_message;
@FindBy(xpath="//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]")
public WebElement toastcrosstwo;
@FindBy(xpath="//span[contains(text(),'Chat')]")
public WebElement Chatoption_in_menu;
@FindBy(xpath="//*[@id=\"chat_write_area\"]/div/div[1]/button")
public WebElement Modelbutton;
@FindBy(xpath="//body/div[@id='select-menu']/div[3]/div[1]/div[2]/div[6]/button[1]")
public WebElement seconddefault;
@FindBy(xpath="//div[@class='MuiBox-root css-ehlpcq']")
public List<WebElement> defaultListOptions;
@FindBy(xpath="//tbody/tr[@id='default-direct']/td[2]/div[1]/div[1]")
public WebElement rechoose;
@FindBy(xpath="//*[@id=\"chat_write_area\"]/div/div[1]/button")
public WebElement blueFlameoption;

public AI_model_Paths(WebDriver d){

PageFactory.initElements(d,this);
}
public WebElement Aimodeltab(){
return Aimodeltab;
}
public WebElement Gpt4model(){
return Gpt4model;
}  public WebElement Aigpt4tab(){
return Aigpt4tab;}
public WebElement Light_mode(){
return Light_mode;
}
public WebElement Profileicon(){
return Profileicon;
}
public WebElement Profileoption(){
 return Profileoption;
}
    public WebElement Default_model_editbutton(){
 return Default_model_editbutton;
}    public WebElement Defaultoption(){
 return Defaultoption;
}    public WebElement Lamaoption(){
 return Lamaoption;
}    public WebElement Savebutton(){
 return Savebutton;
}    public WebElement savesuccessmessage(){
 return savesuccessmessage;
}    public WebElement toastcrossone(){
 return toastcrossone;
}    public WebElement LLM_editbutton(){
 return LLM_editbutton;
}    public WebElement LLMoption(){
 return LLMoption;
}    public WebElement LLMoptiontochoose(){
 return LLMoptiontochoose;
}    public WebElement LLMsavebutton(){
 return LLMsavebutton;
}    public WebElement LLMsuccess_message(){
 return LLMsuccess_message;
}    public WebElement toastcrosstwo(){
 return toastcrosstwo;
}    public WebElement Chatoption_in_menu(){
 return Chatoption_in_menu;
}    public WebElement Modelbutton(){
 return Modelbutton;
}    public WebElement seconddefault(){
 return seconddefault;
}    public List<WebElement> defaultListOptions(){
      List<WebElement> defaultListOptions = new ArrayList<>();
      return defaultListOptions;
}    
public WebElement rechoose(){
 return rechoose;
}
public WebElement blueFlameoption(){
return blueFlameoption;
}
}

