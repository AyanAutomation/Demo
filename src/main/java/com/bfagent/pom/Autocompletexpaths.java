
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
    @FindBy(xpath = "//ul[@role='listbox']//li[@role='option'][1]")
    public WebElement Autocomplete_list;
    @FindBy(xpath = "//li[@class = 'MuiAutocomplete-option MuiBox-root css-16r7kf5']")
    public List <WebElement> List_Generic_xpaths;
    @FindBy(xpath = "//*[@id=\"chat_write_area\"]/div/div[2]/div/div/div/div[1]/button")
    public WebElement promptcrossbot;
    
    
    
    
    
    
    
    
    
    public Autocompletexpaths(WebDriver d){

    PageFactory.initElements(d, this);
}
    
    public List <WebElement> List_Generic_xpaths(){
    List <WebElement> List_Generic_xpaths = new ArrayList<>();
    return List_Generic_xpaths;
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
