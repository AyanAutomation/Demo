
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.awt.Robot;
import static java.lang.Thread.sleep;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Blueprintrun {
    
    WebDriver d;
    

public Blueprintrun(WebDriver  d){


this.d = d;

}


        
        String menu_option = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]";
        String Blueprint_option = "//a[@href='/dashboard/blueprints']";
        String run_Button = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[2]";
        String Chatlist = "//div[@id='chat_list_ced1482c-d5b7-4eaf-a365-ff648f8fb64d']";
        String Chat_option = "//span[contains(text(),'Chat')]";
        String RunnedBlueprintchat = "//p[contains(text(),'Recipe: Pitchbook Bl...')]";
        String Firstmessage = "//p[contains(text(),'company: 64559-62')]";
        String likebutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/button[2]/*[1]";
        String secondmessage = "//p[contains(text(),'company: 109347-13')]";       
        String advancedViewbutton = "(//li[@class='MuiListItem-root MuiListItem-gutters css-1tpp0wj'])[2]"; 
        String threedot = "(//div[@class='MuiBox-root css-1y4lkn8'])[1]//button[@type='button']";
        
        String sidedropdownmenu = "//div[@tabindex='-1']";
        String allmenuitems = "//div[@tabindex='-1']//li[@role='menuitem']";
        String shareOption = "Share";
        String addtoLibraryOption = "//p[contains(text(),'Choose library')]";
        String accountOption ="//div[contains(text(),'Select Account')]";
        String popOutModal = "//div[@role='dialog']";
        String promptlockButton = "";
        String accountList = "//body/div[@id='menu-']/div[3]";
        String blueflameaiOption = "//li[@data-value='c0639d2d-d3ba-4418-840d-a68c988723db']";
        String selectUser = "//body/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]";
        String webSkitterdevoption = "Webskitters test Dev";
        String popovercloser = "(//div[@role='presentation'])[3]//div[@role='dialog']//h2[@class='MuiTypography-root MuiTypography-h6 MuiDialogTitle-root css-grrkzz']";
        String shareButton = "//button[text()='Share']";
        String shareSuccessMessage = "//li[@aria-live='polite']";
        String shareToastcrossbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
        String Create_BlueprntButton = "//div[text()='Create New']";
        //body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]
        String gearButton = "(//button[@type='button'])[7]";
        String addprmtbt = "//button[text()='Add prompt']";
        String prmptbox = "//div[@contenteditable='true']//p[@class='is-empty is-editor-empty']";
        String promptboxWithcontent = "//div[@class='tiptap ProseMirror _tiptap_editor']";
        String lightMode = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]"; 
        String summarytoggle = "//input[@aria-label ='controlled']";
        String summarizeResultboxCssselector = "customValues.summarizeText";
        String saveButtonone = "//div[text()='Save']";
        String saveButtontwo = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]";
        String settingsSlidedrawer = "//div[@class='MuiBox-root css-41in74']//button[@type='button']";
        String moveInsideform = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]";        
        String BlueprintnameField = "//textarea[@placeholder='Blueprint name *']";
        String BlueprintDescription_Field = "//textarea[@name='description']";
        String savesuccessToast = "//div[contains(text(),'Recipe: Blueprint name created successfully')]";        
        String savesuccessToastcrossbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]";
        String createdBlueprintName = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/nav/ol/li[3]/div/p";
        String blueprintitlename = "//h1[contains(text(),'Blueprints')]";
        String deleteOption = "Delete";
        String blueprintnametitle = "//*[@placeholder='Blueprint name *']";
        String descriptionNametitle = "//textarea[@placeholder='Write what this Blueprint is supposed to do here...']";
        String promptDeletebutton = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1mknrun'])[1]";
        String generateTextbox = "//textarea[@placeholder='Write what this Blueprint is supposed to do here...']";
        String generateTextButton = "//*[contains(text(),'Generate')]";
        String sideDrawerclose_button = "/html/body/div[4]/div[3]/div/div[1]/button";
        String blueprintListsearch = "input[placeholder='search']";
        String Librarysearch = "//input[@placeholder='Search']";
        String searchboxpost_with_searchword = "input[value='World News Summary']";
        String deleOk = "//div[text()='Yes']";
        String recipedeleteSuccessToast = "//div[contains(text(),'Blueprint Deleted Successfully.')]";
        String deleteToastcrossButton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
        String deleteOptn = "//p[contains(text(),'Delete')]";
        String ChooseUser = "//p[contains(text(),'Choose user')]";
        String addtoLibraryButton = "//button[contains(text(),'Add from library')]";
        String addlibraryPopupTitle = "//p[contains(text(),'Add from library')]";
        String insideRecipeList = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]";
        String bottomsectionofLibraryCard = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1594mfo'])[2]";
        String importSuccessToast = "//div[contains(text(),'Recipe: Global Blueprint imported successfully')]";
        String libraryPopupCloseButton = "//body/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]";
        String primartBlueprintListTitle = "//h1[contains(text(),'Blueprints')]";
        String importedBlueprintName = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
        String toastCrossButton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
         
        String linkedBlueprintCard = "(//h3[text()='Demo Recipe linked'])[1]";
        String viewonlyinfotext = "//div[contains(text(),'Linked Blueprint View only')]";
        String threedtbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/button[1]";
        String importButton = "(//button[text()='Import'])[2]"; 
        String alloptsn = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1deb5uc']";
        String okconfirmaction = "//div[text()='Yes']";
        String deltoast = "//body/div[@id='root']/section[1]/ol[1]/li[1]";
        String userinputField = "//div[@role='button']//span[contains(text(),'company name')]";
        String userinputEditButton = "//div[@role='button']//span[contains(text(),'company name')]//button[@type='button'][1]";        
        String userinputeditbox = "//input[@aria-invalid='false']";
        String outsideuserinputform = "//body/div[4]";        
        String editeduserinput = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]";
        String userinputDeleteButton = "//span[contains(text(),'company')]//button[@type='button'][2]";
        String userinputdelconfirm = "//button[contains(text(),'Delete all')]";
        String runprompt = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]";
        String parameterinputBoxforrun = "//input[@placeholder='Type here']";
        String runButton_inside_confirmationPopUp = "/html/body/div[4]/div[3]/div/div/div[2]/button[2]";
        String previewChat_generated = "//p[contains(text(),'Today')]";
        String addscheduleButton = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[7]/button[1]";
        String popupScheduleForm = "//body/div[@id='schedule-list-add']/div[3]/div[1]";
        String timeClockIcon = "//body/div[@id='schedule-list-add']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]";
        String scheduleFrequencyButton = "//div[@id='mui-component-select-frequency']";
        String weeklyOption = "//li[@data-value='WEEKLY']";       
        String weeklyoptionGenericXpath = "//li[@class='MuiListItem-root MuiListItem-gutters css-1tpp0wj']";
        String monDay = "Mo";        
        String scheduleSaveButton = "//div[@class='MuiStack-root css-1b138w3']//button[contains(text(),'Save')]";
        String scheduletimeval = "//body/div[6]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]";
        String scheduletimeOkButton = "//body/div[6]/div[2]/div[1]/div[2]/button[1]";
        String shareLibaryOptions_GenericXpath = "//div[@class='MuiBox-root css-ehlpcq']";
        String shareLib_seconduserOption = "(//div[@class='MuiBox-root css-1qdy2zr']//div[@class='MuiBox-root css-ehlpcq']//button[@type='button']//p[@class='MuiTypography-root MuiTypography-body1 css-newj2o'])[2]";
        String AccountLiboption = "Account Library";
        String userforSharing = "Ed Chu";
        String library_DemoLinked_recipeXpath = "//h3[text()='Demo Recipe linked']";
        String Library_DemoRecipe_Bottom_section = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]";
        String demoLinked_recipeImportButton = "//button[text()='Import']";
        String noBlueprint_FoundText = "//h1[text()='No blueprint found']";

        
        
public void Run_Blueprint() throws AWTException, InterruptedException{
    
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
        Actions a = new Actions(d);

 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menu_option)));
        
        
        
        a.moveToElement(d.findElement(By.xpath(menu_option)));
        
        Robot r = new Robot();
        
        r.mouseWheel(-200);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Blueprint_option))); 
        d.findElement(By.xpath(Blueprint_option)).click(); 
        Thread.sleep(1200);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(run_Button))); 
        d.findElement(By.xpath(run_Button)).click(); 
        Thread.sleep(1200);
       
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menu_option)));
       a.moveToElement(d.findElement(By.xpath(menu_option)));
       
        r.mouseWheel(200);
        Thread.sleep(1200);
        
       
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Chat_option)));
        d.findElement(By.xpath(Chat_option)).click(); 
        
        r.mouseWheel(-200);
        
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Chatlist))); 
        
        a.moveToElement(d.findElement(By.xpath(Chatlist))).build().perform(); 
    

        r.mouseWheel(-30);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RunnedBlueprintchat))); 
        d.findElement(By.xpath(RunnedBlueprintchat)).click(); 
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Firstmessage))); 
        
        a.moveToElement(d.findElement(By.xpath(Firstmessage))).build().perform();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(secondmessage)));
        
        r.mouseWheel(-3);
        r.mouseWheel(3);
        

      Thread.sleep(1200);
  
       


}
 
   public void shareblueprintcheck() throws InterruptedException{


       String selectUserList = "//body/div[@id='menu-']/div[3]";
       String allUserFetchingGenericXpath = "//ul[@role='listbox']//li[@role='option']";
       
       
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        Actions a = new Actions(d);
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(advancedViewbutton))); 
     d.findElement(By.xpath(advancedViewbutton)).click(); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(blueprintListsearch))); 
     d.findElement(By.cssSelector(blueprintListsearch)).sendKeys("Company Research"); 
      
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedot))); 
     d.findElement(By.xpath(threedot)).click(); 
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sidedropdownmenu)));
     
     List <WebElement> items = d.findElements(By.xpath(allmenuitems));
     
     for (WebElement item:items ){
    //System.out.println(item.getText());
     
     if(item.getText().equalsIgnoreCase(shareOption)){
     
     item.click();
      
    break;

     }}
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popOutModal)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addtoLibraryOption)));
     d.findElement(By.xpath(addtoLibraryOption)).click();
     
      List <WebElement> LibraryOptions = d.findElements(By.xpath(shareLibaryOptions_GenericXpath));
      
      
      for(WebElement libops : LibraryOptions){
      
      //System.out.println(libops.getText());
      
      if(libops.getText().equalsIgnoreCase(AccountLiboption)){
      
      //System.out.println(libops.getText());    
      libops.click();
      break;
      
      
      }
      
      }
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ChooseUser)));
     d.findElement(By.xpath(ChooseUser)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(shareLibaryOptions_GenericXpath)));
     a.moveToElement(d.findElement(By.xpath(shareLib_seconduserOption))).build().perform();
     
     List <WebElement> userOptions = d.findElements(By.xpath(shareLibaryOptions_GenericXpath));
     
      for(WebElement userOpts : userOptions){
      
      System.out.println(userOpts.getText());
          
     if(userOpts.getText().equalsIgnoreCase(userforSharing)){
      
      System.out.println(userOpts.getText());   
      userOpts.click();
      break;
   }
       }
     
      
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popovercloser)));
     d.findElement(By.xpath(popovercloser)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(shareButton)));
     d.findElement(By.xpath(shareButton)).click();
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(shareSuccessMessage)));
      System.out.println(d.findElement(By.xpath(shareSuccessMessage)).getText());
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(shareToastcrossbutton)));
     d.findElement(By.xpath(shareToastcrossbutton)).click();

     Thread.sleep(2800); 
     }
   
   
   
   
   
   public void Blueprintaddform() throws InterruptedException, AWTException{
   
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
        Actions a = new Actions(d);
        JavascriptExecutor js = (JavascriptExecutor)d;
        Robot r = new Robot();
   
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
    
       
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Create_BlueprntButton)));
      d.findElement(By.xpath(Create_BlueprntButton)).click();
        
      //confirmation that we have entered the add create Blueprint form  
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gearButton)));
      
      // Clicking add prompt Button 
     
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addprmtbt)));
      d.findElement(By.xpath(addprmtbt)).click();
      
      // Confirming prompt box has opened and clicking inside
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prmptbox)));
      d.findElement(By.xpath(prmptbox)).click();
        
      // Checking whether curly brace parameter box color in white background
      
      d.findElement(By.xpath(prmptbox)).sendKeys("{Parameter A} {Demo B} {Company} { Parameter B }");
      
      a.moveToElement(d.findElement(By.xpath(promptboxWithcontent))).sendKeys(Keys.ENTER).build().perform();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptDeletebutton)));
      d.findElement(By.xpath(promptDeletebutton)).click();
      
 
   
      // Summary section in add form is currently hidden
      
      /*   d.findElement(By.xpath(summarytoggle)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.name("customValues.summarizeText")));
      d.findElement(By.name("customValues.summarizeText")).click();
      d.findElement(By.name("customValues.summarizeText")).sendKeys("This is for checking text color");  */
   
   
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveButtonone)));
      d.findElement(By.xpath(saveButtonone)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(settingsSlidedrawer)));
      d.findElement(By.xpath(settingsSlidedrawer)).click();
      // filling Blueprint name field
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blueprintnametitle)));
      a.moveToElement(d.findElement(By.xpath(blueprintnametitle))).build().perform();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BlueprintnameField)));
      d.findElement(By.xpath(BlueprintnameField)).sendKeys("Blueprint name");
      
       // filling description field
    
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BlueprintDescription_Field)));
      d.findElement(By.xpath(BlueprintDescription_Field)).sendKeys("blueprint description");
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addscheduleButton)));
      d.findElement(By.xpath(addscheduleButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popupScheduleForm)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(scheduleFrequencyButton)));
      d.findElement(By.xpath(scheduleFrequencyButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(weeklyOption)));
      d.findElement(By.xpath(weeklyOption)).click();
      
      List <WebElement> weekopts = d.findElements(By.xpath(weeklyoptionGenericXpath));
      
      for(WebElement day:weekopts){
      
      if(day.getText().equalsIgnoreCase(monDay)){
      
      day.click();
      break;
      }}
      
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timeClockIcon)));
      d.findElement(By.xpath(timeClockIcon)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(scheduletimeOkButton)));
      d.findElement(By.xpath(scheduletimeOkButton)).click(); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(scheduleSaveButton)));
      d.findElement(By.xpath(scheduleSaveButton)).click(); 
      
        
      // hitting side Drawer close button and regenerating prompt 
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sideDrawerclose_button)));
      d.findElement(By.xpath(sideDrawerclose_button)).click();
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(generateTextbox)));
      d.findElement(By.xpath(generateTextbox)).sendKeys("world news");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(generateTextButton)));
      d.findElement(By.xpath(generateTextButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptboxWithcontent)));
      
      // hitting save button after filling mandatory fields 
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveButtontwo)));
      d.findElement(By.xpath(saveButtontwo)).click();
      
      
//      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(savesuccessToast)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(savesuccessToastcrossbutton)));
      d.findElement(By.xpath(savesuccessToastcrossbutton)).click();
      
   
      
      //going to Blueprint list through breadcrumbs path
      
       
       
 }
   
   
   
   public void blueprintDelete() throws InterruptedException{
   
   
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
    Actions a = new Actions(d);
   
    d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
    
     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(blueprintListsearch))); 
     d.findElement(By.cssSelector(blueprintListsearch)).sendKeys("World News Summary"); 
      
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(advancedViewbutton))); 
     d.findElement(By.xpath(advancedViewbutton)).click(); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedot))); 
     d.findElement(By.xpath(threedot)).click(); 
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sidedropdownmenu)));
     
     List <WebElement> items = d.findElements(By.xpath(allmenuitems));
    
  
     
     for (WebElement item:items ){
    
  

     if(item.getText().equalsIgnoreCase(deleteOption)){
     
     item.click();
      Thread.sleep(1850);
}

     }
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleOk))); 
     d.findElement(By.xpath(deleOk)).click();
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(recipedeleteSuccessToast)));
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteToastcrossButton))); 
     d.findElement(By.xpath(deleteToastcrossButton)).click();
     Thread.sleep(2000);
}
   
   public void blueprint_delete_without_webElementList_method(){
   
   
   WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
   Actions a = new Actions(d);

     
  
   for(int k=0; k<3;k++){  
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(blueprintListsearch))); 
     d.findElement(By.cssSelector(blueprintListsearch)).sendKeys("World News Summary");  
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(advancedViewbutton))); 
     d.findElement(By.xpath(advancedViewbutton)).click(); 
     
     // If all blueprint are deleted Noblueprintfound is Displayed the loop will break
     
     WebElement Noblueprintfound = d.findElement(By.xpath(noBlueprint_FoundText));
     
     if(Noblueprintfound.isDisplayed()){
         
     break;
     
    }
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedot))); 
     d.findElement(By.xpath(threedot)).click(); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteOptn))); 
     d.findElement(By.xpath(deleteOptn)).click(); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleOk))); 
     d.findElement(By.xpath(deleOk)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(recipedeleteSuccessToast)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteToastcrossButton))); 
     d.findElement(By.xpath(deleteToastcrossButton)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addtoLibraryButton))); 
     d.findElement(By.xpath(addtoLibraryButton)).click(); 

     
     
     
         }
     
   }
   
   public void importblueprintCheck() throws AWTException, InterruptedException{
   
       
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
        Actions a = new Actions(d);
        JavascriptExecutor js = (JavascriptExecutor)d;
        Robot r = new Robot();
        d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addtoLibraryButton))); 
        d.findElement(By.xpath(addtoLibraryButton)).click(); 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addlibraryPopupTitle)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(insideRecipeList)));
        a.moveToElement(d.findElement(By.xpath(insideRecipeList))).build().perform();
        
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
       // r.mouseWheel(-500);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(importedBlueprintName)));
        String blueprintname = d.findElement(By.xpath(importedBlueprintName)).getText();
        System.out.println(blueprintname);
        
      /*  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bottomsectionofLibraryCard)));
        a.moveToElement(d.findElement(By.xpath(bottomsectionofLibraryCard))).build().perform(); */
        js.executeScript("arguments[0].scrollIntoView", d.findElement(By.xpath(bottomsectionofLibraryCard)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(importButton))); 
        d.findElement(By.xpath(importButton)).click(); /*
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(importSuccessToast)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossButton))); 
        d.findElement(By.xpath(toastCrossButton)).click(); */
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(libraryPopupCloseButton)));
        d.findElement(By.xpath(libraryPopupCloseButton)).click(); 
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(primartBlueprintListTitle)));
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(blueprintListsearch))); 
       d.findElement(By.cssSelector(blueprintListsearch)).sendKeys(blueprintname);
       
       Thread.sleep(2200);
       
   }
   
   public void linkedrecipeEdit_and_Deletecheck() throws InterruptedException{
   
   
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
        Actions a = new Actions(d);
        JavascriptExecutor js = (JavascriptExecutor)d;
   
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
        
        

         w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(blueprintListsearch))); 
         d.findElement(By.cssSelector(blueprintListsearch)).sendKeys("linked"); 
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(linkedBlueprintCard)));
         a.moveToElement(d.findElement(By.xpath(linkedBlueprintCard))).build().perform();
         d.findElement(By.xpath(linkedBlueprintCard)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(viewonlyinfotext)));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gearButton)));
         d.findElement(By.xpath(gearButton)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sideDrawerclose_button)));
         d.findElement(By.xpath(sideDrawerclose_button)).click();
         
         // deleting the linked Blueprint
         
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedtbutton)));
         d.findElement(By.xpath(threedtbutton)).click();

         List <WebElement> lnkds = d.findElements(By.xpath(alloptsn));
         
         for(WebElement op :lnkds ){
         
             System.out.println(op.getText());
             
             if(op.getText().equalsIgnoreCase(deleteOption)){
             
             op.click();
             
             break;
   }
         
 }
         
         
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(okconfirmaction)));
         d.findElement(By.xpath(okconfirmaction)).click();
/*         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deltoast)));
         
         System.out.println(d.findElement(By.xpath(deltoast)).getText());
         
         d.navigate().refresh(); */
         d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addtoLibraryButton))); 
        d.findElement(By.xpath(addtoLibraryButton)).click(); 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addlibraryPopupTitle)));        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Librarysearch))); 
        d.findElement(By.xpath(Librarysearch)).sendKeys("linked"); 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(library_DemoLinked_recipeXpath)));
        String blueprintname = d.findElement(By.xpath(library_DemoLinked_recipeXpath)).getText();
        System.out.println(blueprintname);
        

       
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Library_DemoRecipe_Bottom_section)));
        a.moveToElement(d.findElement(By.xpath(Library_DemoRecipe_Bottom_section))).build().perform();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoLinked_recipeImportButton))); 
        d.findElement(By.xpath(demoLinked_recipeImportButton)).click(); 
        //w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(importSuccessToast)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossButton))); 
        d.findElement(By.xpath(toastCrossButton)).click(); 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(libraryPopupCloseButton)));
        d.findElement(By.xpath(libraryPopupCloseButton)).click(); 
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(primartBlueprintListTitle)));
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(blueprintListsearch))); 
       d.findElement(By.cssSelector(blueprintListsearch)).sendKeys(blueprintname);
        
        
   
   
   }
   
   
   
   public void Blueprint_addGeneration_with_parameterCheck() throws AWTException, InterruptedException{
       
       
       
       LigthmodeSwitch switchmode = new LigthmodeSwitch(d);
   
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
        Actions a = new Actions(d);
        JavascriptExecutor js = (JavascriptExecutor)d;
        Robot r = new Robot();
   
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
    
       
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Create_BlueprntButton)));
      d.findElement(By.xpath(Create_BlueprntButton)).click();
        
      //confirmation that we have entered the add create Blueprint form  
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gearButton)));
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(generateTextbox)));
      d.findElement(By.xpath(generateTextbox)).sendKeys("{company name}");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(generateTextButton)));
      d.findElement(By.xpath(generateTextButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userinputField)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userinputEditButton)));
      d.findElement(By.xpath(userinputEditButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userinputeditbox)));
      
      for(int b=0; b<=4; b++){
      d.findElement(By.xpath(userinputeditbox)).sendKeys(Keys.BACK_SPACE);
      }
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(outsideuserinputform)));
      d.findElement(By.xpath(outsideuserinputform)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editeduserinput)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userinputDeleteButton)));
      d.findElement(By.xpath(userinputDeleteButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userinputdelconfirm)));
      d.findElement(By.xpath(userinputdelconfirm)).click();
      switchmode.switchOFFLightmode();
      
      Thread.sleep(1990);
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(runprompt)));
      d.findElement(By.xpath(runprompt)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterinputBoxforrun)));
      d.findElement(By.xpath(parameterinputBoxforrun)).sendKeys("PWC");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(runButton_inside_confirmationPopUp)));
      d.findElement(By.xpath(runButton_inside_confirmationPopUp)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(previewChat_generated)));
      
 }
   
   }




