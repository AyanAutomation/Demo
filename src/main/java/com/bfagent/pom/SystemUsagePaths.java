
package com.bfagent.pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUsagePaths {
    

    //Confirming landed on the proper page
    @FindBy(xpath="//h3[text()='System Usage']")
    private WebElement SystemUsage_PageTitle;
    //Information icon in list
    @FindBy(xpath="(//button[@type='button']//div[@class='MuiBox-root css-1o4wo1x'])[3]")
    private WebElement userListInfoIcon;
    //date range selection box at top
    @FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")
    private WebElement datebox;
    //Calender Button for travesring to previous month
    @FindBy(xpath="//*[@aria-label='Previous month']")
    private WebElement prvmonth;
    @FindBy(xpath="(//div[@role='grid']//div[@role='rowgroup']//div[@role='row']//button[@role='gridcell'])[1]")
    private WebElement dateinCalender;
    @FindBy(xpath="(//p[@class='MuiBox-root css-1w1cbyh'])[1]")
    private WebElement usernameinlist;
    @FindBy(xpath="//div[text()='Export to Excel']")
    private WebElement ExportButton;
    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm MuiDialog-paperFullWidth css-1yev2dz']")
    private WebElement userDataPopup; 
    @FindBy(xpath="(//*[text()='Account Usage Stats'])[1]")
    private WebElement AccountusageTab;
    @FindBy(xpath="(//*[text()='User Usage Stats'])[1]")
    private WebElement userUsageTab;
    @FindBy(xpath="(//div[@role='combobox'])[1]")
    private WebElement DateRangeBox;
    @FindBy(xpath="//li[@aria-selected='false']")
    public List <WebElement> DateRangeListGenericXpath;
    @FindBy(xpath="(//div[@role='combobox'])[2]")
    private WebElement UserAccountBox;
    @FindBy(xpath="(//div[@aria-haspopup='listbox'])")
    private WebElement UserUasageStatsAccountBox;
    @FindBy(xpath="//input[@placeholder='MM/DD/YYYY']")
    private WebElement UserUasageStatsDateBox;

                   
    
    
    
    
    
    public SystemUsagePaths(WebDriver d){
    
    PageFactory.initElements(d, this);
    
    }
    
    public WebElement SystemUsage_PageTitle(){
    
    return SystemUsage_PageTitle;
    
    }
    
    public WebElement userListInfoIcon(){
    
    return userListInfoIcon;
        
    }
    
   public WebElement datebox(){
    
    return datebox;
        
    }
    public WebElement dateinCalender(){
    
    return dateinCalender;
        
    }
    public WebElement prvmonth(){
    
    return prvmonth;
    }
     public WebElement usernameinlist(){
    
    return usernameinlist;
     }
    public WebElement ExportButton(){
    
    return ExportButton;
        
    }
    public WebElement userDataPopup(){
   
    return userDataPopup;
}
    
    public WebElement AccountusageTab(){
    return AccountusageTab;
    }
    public WebElement userUsageTab(){
    return userUsageTab;
    }
    public WebElement DateRangeBox(){
    return DateRangeBox;
    }
    public WebElement UserAccountBox(){
    return UserAccountBox;
    }
    public WebElement UserUasageStatsAccountBox(){
    return AccountusageTab;
    }
    public WebElement UserUasageStatsDateBox(){
    return UserUasageStatsDateBox;
    }
}
