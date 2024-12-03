
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class System_AdminModule { 
    WebDriver d;
    public System_AdminModule(WebDriver d){
    this.d = d;
    }
    
    String searchbox = "input[aria-invalid='false']";
    String searchboxWith_content = "input[aria-invalid='false']";
    String usercount = "//a[@href='/dashboard/system-admin/users/c0639d2d-d3ba-4418-840d-a68c988723db']";
    String usereditButton = "//div[text()='Edit']";
    String editformtitle = "//form[@data-testid='flex-box']";
    String closeListPopUpOne = "//div[@data-testid='blueflame-hero']"; 
    String enableModuleFieldBox = "//p[contains(text(),'Activities, Analysis, Archive, Blueprints, Calenda')]";
    String enableModuleList = "//div[@class='MuiBox-root css-ehlpcq']";
    String nexusOption ="Nexus";
    String outsideform = "//p[contains(text(),'Auth Provider (Optional)')]";
    String submitButton = "//div[contains(text(),'Submit')]";
    String toastMessage = "//div[contains(text(),'User modified successfully')]";
    String toastcancelButton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
    String sortFilter = "//p[contains(text(),'Active, Trial')]";
    String reselectsortFilterButton  = "//p[contains(text(),'Active, Canceled, Trial')]";
    String filterListOption = "//div[@class='MuiBox-root css-ehlpcq']";
    String canceledOption = "Canceled";
    String activeOption = "Active";
    String sliderXpath = "//div[@class='ag-body-horizontal-scroll']";
    String accountBreadcrumbs = "//p[contains(text(),'Accounts')]";
    String accountname = "//p[contains(text(),'AYN Test Demo Account User')]";
    String accountEditButton = "//div[contains(text(),'Edit')]";       
    String editAccountformTitle = "//body/div[2]/div[3]/div[1]/form[1]/div[1]/p[1]";
    String orgname_field = "//p[contains(text(),'Organization Name')]";
    String enabledIntergrationField = "//body/div[2]/div[3]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]"; 
    String optionSearchbox = "//input[@placeholder='Search']";
    String optionBlueprint = "//body/div[@id='select-menu']/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/p[1]/span[2]";
    String statusfieldTitle = "//p[contains(text(),'Status')]";
    String submit_Button = "//div[contains(text(),'Submit')]";
    String statusShowButtonIn_list = "(//button[@type='button'])[9]";
    String accountstatOptions = "//div[text()='User Access Stats']";
    String selectAccountforStatToast = "//div[text()='Select at least one account to view usage stats.']";
    String AccountOption_SelectCheckbox = "(//div[@data-testid='select-row-cell-renderer'])[1]//button[@type='button']";
    String popupCalender_daterangeSelectfield = "//p[text()='Select a Date Range']";
    String previous_mnth_button = "//button[@class='rdp-button_previous']";
    String dateselect = "(//div[@class='rdp-month']//table[@role='grid']//tbody[@role='rowgroup']//tr[@class='rdp-week']//td[@class='rdp-day']//button)[1]";
    String calenderPopup_title = "//p[contains(text(),'Select a range of dates to download')]";
    String ConfirmButton = "//*[text()='Confirm']";
    String AImodelButton_in_chat = "//button[@aria-label='GPT-4 (OpenAI)']";
    String llmModelPresent = "(//li[@class='MuiListItem-root MuiListItem-gutters css-1tpp0wj'])";
    
    
    
    
    
    
    public void userEdit() throws AWTException, InterruptedException{
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;
    
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("BlueFlame AI");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usercount)));
      d.findElement(By.xpath(usercount)).click();
      
      for(int i=0; i<2; i++){
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("AYN Demo");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usereditButton)));
      d.findElement(By.xpath(usereditButton)).click(); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editformtitle)));
      a.moveToElement(d.findElement(By.xpath(editformtitle))).build().perform();
       a.moveToElement(d.findElement(By.xpath(editformtitle))).click().build().perform();
          // r.mouseWheel(-100);
     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enableModuleFieldBox)));
      d.findElement(By.xpath(enableModuleFieldBox)).click();
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enableModuleList)));
      
      List<WebElement> enblop = d.findElements(By.xpath(enableModuleList));
      
      for(WebElement enbl :enblop) {
      
      
      if(enbl.getText().equalsIgnoreCase(nexusOption)){
      
      enbl.click();
      
      break;
    
      }
      
    }
      
      d.findElement(By.xpath(outsideform)).click();
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submitButton)));
      d.findElement(By.xpath(submitButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastMessage)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastcancelButton)));
      d.findElement(By.xpath(toastcancelButton)).click();
      
      Thread.sleep(1800);
     }
    }
    
  
    public void systemaccount_searchandFilter_check() throws AWTException, InterruptedException{
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;
               
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
       
        
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sortFilter)));
      d.findElement(By.xpath(sortFilter)).click();
      
       List <WebElement> filteropt = d.findElements(By.xpath(filterListOption));
       
       for(WebElement optns : filteropt ){
           
           System.out.println(optns.getText());
        
           if(optns.getText().equalsIgnoreCase(canceledOption)){
               
           System.out.println(optns.getText());
           optns.click();
           break;
           
  }
}
       
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeListPopUpOne)));
      d.findElement(By.xpath(closeListPopUpOne)).click();         
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).click();
      d.findElement(By.cssSelector(searchbox)).sendKeys("New Form test"); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchboxWith_content)));
      d.findElement(By.cssSelector(searchboxWith_content)).clear();
      
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reselectsortFilterButton)));
      d.findElement(By.xpath(reselectsortFilterButton)).click();

       List <WebElement> filteropton = d.findElements(By.xpath(filterListOption));
       
       for(WebElement optons : filteropton ){
       
         if(optons.getText().equalsIgnoreCase(canceledOption)){
           
           optons.click();
           break;
           
  }
}
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeListPopUpOne)));
      d.findElement(By.xpath(closeListPopUpOne)).click();  
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sortFilter)));
      d.findElement(By.xpath(sortFilter)).click();
    
      List <WebElement> agfilteropt = d.findElements(By.xpath(filterListOption));
    
    
      for(WebElement op : agfilteropt){
      
      
      if(op.getText().equalsIgnoreCase(activeOption)){
      
      
      op.click();
      break;
      }
       }
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeListPopUpOne)));
      d.findElement(By.xpath(closeListPopUpOne)).click(); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sliderXpath)));
      int sliderWidth =  d.findElement(By.xpath(sliderXpath)).getSize().getWidth();
      System.out.println(sliderWidth);
      a.clickAndHold(d.findElement(By.xpath(sliderXpath))).moveByOffset(sliderWidth/2, 0).release().perform();
      Thread.sleep(2000);
      
  
    }
 
    public void AccountEditChange() throws AWTException, InterruptedException{
    
    
        
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;
    
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("BlueFlame AI");
      
      // Entering user list
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usercount)));
      d.findElement(By.xpath(usercount)).click();
    
     // Going back to account list through breadcroumbs navigation 
     
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountBreadcrumbs)));
      d.findElement(By.xpath(accountBreadcrumbs)).click();
      
      // Confirming proper landing on account list page
    
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountname)));
     
     // searching desired account
     
    
      
     // Perform list left slide function 
     
    for(int i=0 ; i<2 ; i++){ 
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("bfai.com");
        
        
      int sliderWidth =  d.findElement(By.xpath(sliderXpath)).getSize().getWidth();
      System.out.println(sliderWidth);
     
      for(int k=0; k<3; k++){
      
      a.clickAndHold(d.findElement(By.xpath(sliderXpath))).moveByOffset(sliderWidth/2, 0).release().perform();
      }
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountEditButton)));
      d.findElement(By.xpath(accountEditButton)).click();
      
     
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editAccountformTitle)));
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(orgname_field)));
      a.moveToElement(d.findElement(By.xpath(orgname_field))).build().perform();
      
      r.mouseWheel(-100);
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enabledIntergrationField)));
      d.findElement(By.xpath(enabledIntergrationField)).click();
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionSearchbox)));
      d.findElement(By.xpath(optionSearchbox)).sendKeys("Blueprints");
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionBlueprint)));
      d.findElement(By.xpath(optionBlueprint)).click();
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(statusfieldTitle)));
      d.findElement(By.xpath(statusfieldTitle)).click();        
      
      
      
              
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submit_Button)));
      d.findElement(By.xpath(submit_Button)).click();        
      d.navigate().refresh();
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).clear();
      
      
    }
    }
      
    
    public void AccountStatuscheck() throws AWTException{
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;  
        
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
    
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("BlueFlame AI");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(statusShowButtonIn_list)));
      d.findElement(By.xpath(statusShowButtonIn_list)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountstatOptions)));
      d.findElement(By.xpath(accountstatOptions)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectAccountforStatToast)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AccountOption_SelectCheckbox)));
      d.findElement(By.xpath(AccountOption_SelectCheckbox)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(statusShowButtonIn_list)));
      d.findElement(By.xpath(statusShowButtonIn_list)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountstatOptions)));
      d.findElement(By.xpath(accountstatOptions)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popupCalender_daterangeSelectfield)));
      d.findElement(By.xpath(popupCalender_daterangeSelectfield)).click();  
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(previous_mnth_button)));
      d.findElement(By.xpath(previous_mnth_button)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dateselect)));
      d.findElement(By.xpath(dateselect)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(calenderPopup_title)));
      d.findElement(By.xpath(calenderPopup_title)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmButton)));
      d.findElement(By.xpath(ConfirmButton)).click();
      d.navigate().refresh();
    }
    
    
    public void useredit_User_licence_Change() throws AWTException{
    
        String userlicense_field = "(//div[@class='MuiBox-root css-4bhl5l'])[5]";
        String licenseOptionsList = "//div[@class='MuiBox-root css-x9bosi']";
        String userlistgenericxpath = "//div[@class='MuiBox-root css-ehlpcq']";
        
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;
       
       
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
    
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("BlueFlame AI");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usercount)));
      d.findElement(By.xpath(usercount)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("AYN Demo");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usereditButton)));
      d.findElement(By.xpath(usereditButton)).click(); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editformtitle)));
      a.moveToElement(d.findElement(By.xpath(editformtitle))).build().perform();
       a.moveToElement(d.findElement(By.xpath(editformtitle))).click().build().perform();
          // r.mouseWheel(-100);
      js.executeScript("arguments[0].scrollIntoView(true);",d.findElement(By.xpath(userlicense_field)));

      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userlicense_field)));
      d.findElement(By.xpath(userlicense_field)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(licenseOptionsList)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userlistgenericxpath)));
       
      List <WebElement> licenseOptions = d.findElements(By.xpath(userlistgenericxpath));
      
      for(WebElement licensetype : licenseOptions ){
      
        if(licensetype.getText().equalsIgnoreCase("Llm Only")){
            System.out.println(licensetype.getText());
              licensetype.click();
              break;
         }}
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submit_Button)));
      d.findElement(By.xpath(submit_Button)).click();
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AImodelButton_in_chat)));
      d.findElement(By.xpath(AImodelButton_in_chat)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(llmModelPresent)));
     System.out.println(d.findElement(By.xpath(llmModelPresent)).getText());
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
            w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("BlueFlame AI");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usercount)));
      d.findElement(By.xpath(usercount)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("AYN Demo");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usereditButton)));
      d.findElement(By.xpath(usereditButton)).click(); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editformtitle)));
      a.moveToElement(d.findElement(By.xpath(editformtitle))).build().perform();
       a.moveToElement(d.findElement(By.xpath(editformtitle))).click().build().perform();
          // r.mouseWheel(-100);
      js.executeScript("arguments[0].scrollIntoView(true);",d.findElement(By.xpath(userlicense_field)));

      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userlicense_field)));
      d.findElement(By.xpath(userlicense_field)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(licenseOptionsList)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userlistgenericxpath)));
       
      List <WebElement> licenceOptions = d.findElements(By.xpath(userlistgenericxpath));
      
      for(WebElement license : licenceOptions ){
      
        if(license.getText().equalsIgnoreCase("Full")){
            System.out.println(license.getText());
              license.click();
              break;
         }}
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submit_Button)));
      d.findElement(By.xpath(submit_Button)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close toast']")));
      d.findElement(By.xpath("//button[@aria-label='Close toast']")).click();
  }
  }
    
    
    
    
    
    

