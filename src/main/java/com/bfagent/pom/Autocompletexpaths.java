
package com.bfagent.pom;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Autocompletexpaths {
      
    @FindBy(xpath = "(//div[@class='MuiStack-root chat_head css-1hb1q70']//button[@type='button'])[1]")
    public WebElement newchatbutton;
    @FindBy(xpath = "//p[@class='is-empty is-editor-empty']")
    public WebElement Editor_Box;
    @FindBy(xpath = "//span[contains(text(),'@Files')]")
    public WebElement tileA;
    @FindBy(xpath = "//input[@aria-autocomplete = 'list']")
    public WebElement Autocomplete_box;    
    @FindBy(xpath = "(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAutocomplete-paper css-108iv6z']//ul[@class='MuiAutocomplete-listbox css-ue1yok']//li[@class = 'MuiAutocomplete-option MuiBox-root css-16r7kf5'])[1]")
    public WebElement Autocomplete_list;
    @FindBy(xpath = "//div[@role='presentation']//ul[@role='listbox']//li[@role='option']")
    public List<WebElement> Genericxpaths;
    @FindBy(xpath = "//div[@class='MuiBox-root css-b8tfif']")
    public WebElement promptcrossbot;
    
    public Autocompletexpaths(WebDriver d){
    PageFactory.initElements(d,this);
}
    public WebElement newchatbutton(){
    return newchatbutton;
    }
     public WebElement Editor_Box(){
     return Editor_Box;
     }
    public WebElement tileA(){
      return tileA;
     }
    public WebElement Autocomplete_box(){
    return Autocomplete_box;
    }
    public WebElement Autocomplete_list(){
    return Autocomplete_list;
    }
    public WebElement promptcrossbot(){
    return promptcrossbot; 
    }

}
