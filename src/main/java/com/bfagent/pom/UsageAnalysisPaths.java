
package com.bfagent.pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsageAnalysisPaths {
    
    @FindBy(xpath = "(//div[@role='combobox'])[2]")
    
    private WebElement userBox;
    
    @FindBy(css = "ul[role='listbox']")
    
    private WebElement userList;
    
    @FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-62n9qd'])")
    
    public List<WebElement> userListGenericXpath ;
    
    
    @FindBy(xpath = "(//div[text()='View Chat'])[1]")
    
    private WebElement viewChat_Buttonin_List;
    
    
    @FindBy(xpath = "(//p[@class='MuiBox-root css-1w1cbyh'])[2]")
    
    private WebElement user_Column_in_list;
    
    
    @FindBy(xpath = "//div[text()='Export to Excel']")
    
    private WebElement exportButton;
    
   @FindBy(xpath = "(//li[@tabindex='-1'])[3]")
    
    private WebElement thirdoption;
   
  @FindBy(xpath = "(//div[@role='combobox'])[1]")
    
    private WebElement dateRange_box;
    
    
    public UsageAnalysisPaths(WebDriver d){
    
    PageFactory.initElements(d, this);
    
    
    }
    
    public WebElement userBox(){
    
    return userBox;
    
    }
    
   public WebElement userList(){
    
    return userList;
    
    }
   public WebElement viewChat_Buttonin_List(){
    
    return viewChat_Buttonin_List;
    
    }
   public WebElement user_Column_in_list(){
    
    return user_Column_in_list;
    
    }
   public WebElement exportButton(){
    
    return exportButton;
    
    }

     public WebElement thirdoption(){
    
    return thirdoption;
    
    }
     public WebElement dateRange_box(){
    
    return dateRange_box;
    
    }
     
     
     

}
