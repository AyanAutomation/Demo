
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Blueprints_xpaths;
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
       
public void Run_Blueprint() throws AWTException, InterruptedException{
    
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
        Actions a = new Actions(d);
        Blueprints_xpaths pth = new Blueprints_xpaths(d);

        w.until(ExpectedConditions.visibilityOf(pth.menu_option()));
        a.moveToElement(pth.menu_option());
        
        Robot r = new Robot();
        r.mouseWheel(-200);
        
        w.until(ExpectedConditions.visibilityOf(pth.Blueprint_option())); 
        pth.Blueprint_option().click(); 
        Thread.sleep(1200);
        
        w.until(ExpectedConditions.visibilityOf(pth.run_Button())); 
        pth.run_Button().click(); 
        Thread.sleep(1200);
        w.until(ExpectedConditions.visibilityOf(pth.menu_option()));
        a.moveToElement(pth.menu_option());
        r.mouseWheel(200);
        Thread.sleep(1200);
        w.until(ExpectedConditions.visibilityOf(pth.Chat_option()));
        pth.Chat_option().click(); 
        r.mouseWheel(-200);
        w.until(ExpectedConditions.visibilityOf(pth.Chatlist())); 
        a.moveToElement(pth.Chatlist()).build().perform(); 
        r.mouseWheel(-30);
        w.until(ExpectedConditions.visibilityOf(pth.RunnedBlueprintchat())); 
        pth.RunnedBlueprintchat().click(); 
        w.until(ExpectedConditions.visibilityOf(pth.Firstmessage())); 
        a.moveToElement(pth.Firstmessage()).build().perform();
        r.mouseWheel(-3);
        r.mouseWheel(3);
        Thread.sleep(1200);
  }
 
   public void shareblueprintcheck() throws InterruptedException{


     String selectUserList = "//body/div[@id='menu-']/div[3]";
     String allUserFetchingGenericXpath = "//ul[@role='listbox']//li[@role='option']";
     Blueprints_xpaths p = new Blueprints_xpaths(d);
       
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
     Actions a = new Actions(d);
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/blueprints");
     w.until(ExpectedConditions.visibilityOf(p.advancedViewbutton())); 
     p.advancedViewbutton().click(); 
     w.until(ExpectedConditions.visibilityOf(p.blueprintListsearch())); 
     p.blueprintListsearch().sendKeys("Company Research"); 
     w.until(ExpectedConditions.visibilityOf(p.threedot())); 
     p.threedot().click(); 
     
     
     w.until(ExpectedConditions.visibilityOf(p.sidedropdownmenu()));
     
     List <WebElement> items = p.allmenuitems;
     
     for (WebElement item:items ){
    //System.out.println(item.getText());
     
     if(item.getText().equalsIgnoreCase(p.shareOption())){
     
     item.click();
     break;}}
     
     w.until(ExpectedConditions.visibilityOf(p.popOutModal()));
     w.until(ExpectedConditions.visibilityOf(p.addtoLibraryOption()));
     p.addtoLibraryOption().click();
     
      List <WebElement> LibraryOptions = p.shareLibaryOptions_GenericXpath;
      
      for(WebElement libops : LibraryOptions){
      
      //System.out.println(libops.getText());
      
      if(libops.getText().equalsIgnoreCase(p.AccountLiboption())){
      
      //System.out.println(libops.getText());    
      libops.click();
      break;}} 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='BlueFlame AI']")));
     w.until(ExpectedConditions.visibilityOf(p.selectUser()));
     p.selectUser().click();
     a.moveToElement(d.findElement(By.xpath("//input[@placeholder='Search']"))).build().perform();
     d.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Web");
     w.until(ExpectedConditions.visibilityOfAllElements(p.shareLibaryOptions_GenericXpath));
     List <WebElement> userOptions = p.shareLibaryOptions_GenericXpath;
     
      for(WebElement userOpts : userOptions){
      
      System.out.println(userOpts.getText());
          
     if(userOpts.getText().equalsIgnoreCase(p.userforSharing())){
      
      System.out.println(userOpts.getText());   
      userOpts.click();
      break;
   }
       }
     w.until(ExpectedConditions.visibilityOf(p.popovercloser()));
     p.popovercloser().click();
     w.until(ExpectedConditions.visibilityOf(p.shareButton()));
     p.shareButton().click();
     w.until(ExpectedConditions.visibilityOf(p.shareSuccessMessage()));
     System.out.println(p.shareSuccessMessage().getText());
     
     w.until(ExpectedConditions.visibilityOf(p.shareToastcrossbutton()));
     p.shareToastcrossbutton().click();

     Thread.sleep(2800); 
     }
   
   
   
   /*
   
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
   
   /*
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveButtonone)));
      d.findElement(By.xpath(saveButtonone)).click();
      /*w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(settingsSlidedrawer)));
      d.findElement(By.xpath(settingsSlidedrawer)).click();
      // filling Blueprint name field*//*
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blueprintnametitle)));
      a.moveToElement(d.findElement(By.xpath(blueprintnametitle))).build().perform();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BlueprintnameField)));
      d.findElement(By.xpath(BlueprintnameField)).sendKeys("Blueprint name");
      
       // filling description field
    
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BlueprintDescription_Field)));
      d.findElement(By.xpath(BlueprintDescription_Field)).sendKeys("blueprint description");
      js.executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.xpath(addscheduleButton)));
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
      
      
/*      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sideDrawerclose_button)));
      d.findElement(By.xpath(sideDrawerclose_button)).click();
      *//*
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
        a.moveToElement(d.findElement(By.xpath(bottomsectionofLibraryCard))).build().perform(); 
        js.executeScript("arguments[0].scrollIntoView", d.findElement(By.xpath(bottomsectionofLibraryCard)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(importButton))); 
        d.findElement(By.xpath(importButton)).click(); /*
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(importSuccessToast)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossButton))); 
        d.findElement(By.xpath(toastCrossButton)).click(); 
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
         
         d.navigate().refresh(); *//*
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
   
  */ } 




