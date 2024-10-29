
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Onboardingpaths;
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

public class Onboarding_Checking {
    
    WebDriver d;
  
    public Onboarding_Checking(WebDriver d){
    
    this.d=d;
    
      }
    
   
    String profileoptiontoSelect = "Investor Relations / Fundraising";
    String timezoneOptiontochoose = "Africa/Cairo";

    public void boading()throws AWTException, InterruptedException{
    
  
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;
       Onboardingpaths onbd = new Onboardingpaths(d);
       
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
       
      w.until(ExpectedConditions.visibilityOf(onbd.searchbox()));
      onbd.searchbox().sendKeys("BlueFlame AI");
      w.until(ExpectedConditions.visibilityOf(onbd.usercount()));
      onbd.usercount().click();
      w.until(ExpectedConditions.visibilityOf(onbd.searchbox()));
      onbd.searchbox().sendKeys("nextjs");
      w.until(ExpectedConditions.visibilityOf(onbd.loginAsButton()));
      
      
     /*The getWindowHandle() method in Selenium WebDriver is used to retrieve the unique identifier (window handle)
      for the current browser window or tab that WebDriver is interacting with. 
      Every time you open a new browser window or tab during a WebDriver session, 
      it is assigned a unique ID (called a window handle), 
      which allows Selenium to differentiate between multiple browser windows or tabs. */
      
      /* the getWindowHandle() method returns a String that represents the current window's handle 
     (or unique identifier).This handle allows Selenium to keep track of which window or tab is currently 
     in focus for WebDriver operations,such as interacting with elements. */
      
     String originalTab =  d.getWindowHandle();
      
     System.out.println(originalTab);
     
      
      onbd.loginAsButton().click();
      d.switchTo().window(originalTab);
      
      
      d.navigate().refresh();
      d.navigate().to("https://app-dev.blueflame.ai/onboarding/");
      
      
      // Profile Option select in Onboarding Page
      
      
      w.until(ExpectedConditions.visibilityOf(onbd.profileDropdownCssselector()));
      onbd.profileDropdownCssselector().click();    
      
      w.until(ExpectedConditions.visibilityOf(onbd.profilelist()));
      w.until(ExpectedConditions.visibilityOfAllElements(onbd.profilelistalloptionsGenericXpath));
      
     List <WebElement> allprofileoptions = onbd.profilelistalloptionsGenericXpath;
     
     
     for(WebElement profileoption : allprofileoptions  ){
         
  
         if(profileoption.getText().equalsIgnoreCase(profileoptiontoSelect)){
         
         System.out.println(profileoption.getText());
         profileoption.click();
         break;
  }
}
     
     
     w.until(ExpectedConditions.visibilityOf(onbd.continueButtonxpath()));
     onbd.continueButtonxpath().click();
     Thread.sleep(1990);
     
     
     // Timezone Select Page
     
     
     w.until(ExpectedConditions.visibilityOf(onbd.timezonepagetitle()));
     w.until(ExpectedConditions.visibilityOf(onbd.timeZoneFieldClick()));
     onbd.timeZoneFieldClick().click();
     
     w.until(ExpectedConditions.visibilityOf(onbd.timeZoneList()));
      
     List <WebElement> timezoneoptions = onbd.timezoneLIstOption_genericXpath;
     
      for(WebElement timezone : timezoneoptions ){
          
        System.out.println(timezone.getText());
    
      if(timezone.getText().equalsIgnoreCase(timezoneOptiontochoose)){
      
      System.out.println(timezone.getText());     
        
       timezone.click();
        break; 
  }  } 
      w.until(ExpectedConditions.visibilityOf(onbd.TimezoneTitle()));
      
      w.until(ExpectedConditions.visibilityOf(onbd.continueButtonxpath()));
      onbd.continueButtonxpath().click();
      w.until(ExpectedConditions.visibilityOf(onbd.chatmodelChoosePageTitle()));
      w.until(ExpectedConditions.visibilityOf(onbd.gptfourOptionXpath()));
      onbd.gptfourOptionXpath().click();
      w.until(ExpectedConditions.visibilityOf(onbd.continueButtonxpath()));
      onbd.continueButtonxpath().click();
      
      // Application Page in Onboarding
      w.until(ExpectedConditions.visibilityOf(onbd.applicationListPageTitle()));  
      
      w.until(ExpectedConditions.visibilityOf(onbd.continueButtonxpath()));
      onbd.continueButtonxpath().click();
      
      // Blueprint/recipe List page In onboarding
      w.until(ExpectedConditions.visibilityOf(onbd.recipelistpageTitle()));
      w.until(ExpectedConditions.visibilityOf(onbd.recipeList()));
      a.moveToElement(onbd.recipeList()).build().perform();
      
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      w.until(ExpectedConditions.visibilityOf(onbd.continueButtonxpath()));
      onbd.continueButtonxpath().click();
      w.until(ExpectedConditions.visibilityOf(onbd.tellusinteresttextBox()));
      onbd.tellusinteresttextBox().sendKeys("More AI Models needs to be included");
       w.until(ExpectedConditions.visibilityOf(onbd.continueButtonxpath()));
      onbd.continueButtonxpath().click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Chat')]")));
     
      } 
 }
    
    
    


