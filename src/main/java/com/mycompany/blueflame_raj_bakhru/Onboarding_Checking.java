
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

public class Onboarding_Checking {
    
    WebDriver d;
    
    
    
    public Onboarding_Checking(WebDriver d){
    
    this.d=d;
      }
    
    String searchbox = "input[aria-invalid='false']";
    String searchboxWith_content = "input[aria-invalid='false']";
    String usercount = "//a[@href='/dashboard/system-admin/users/c0639d2d-d3ba-4418-840d-a68c988723db']";
    String loginAsButton = "//div[contains(text(),'Login As')]";
    String profileDropdownCssselector = "div[aria-haspopup='listbox']";
    String profilelist = "//body/div[@id='menu-']/div[3]";
    String profilelistalloptionsGenericXpath = "//ul[@role='listbox']//li[@aria-selected='false']";
    String profileoptiontoSelect = "Investor Relations / Fundraising";
    String continueButtonxpath = "//button[contains(text(),'Continue')]";
    String timeZoneFieldClick = "//p[contains(text(),'Asia/Calcutta')]";
    String timeZoneList = "//ul[@role='listbox']";
    String timezoneLIstOption_genericXpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1p4qlti']";
    String timezonepagetitle = "//p[contains(text(),'Set up your profile')]";
    String timezoneOptiontochoose = "Africa/Cairo";
    String chatmodelChoosePageTitle = "//p[contains(text(),'Choose Chat model')]";
    String gptfourOptionXpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]";
    String applicationListPageTitle = "//p[contains(text(),'Connect your applications')]";
    String recipelistpageTitle = "//p[contains(text(),'Automate your workflows')]";
    String recipeList = "//h1[contains(text(),'Automate tasks and reporting with blueprints.')]";
    String tellusinteresttextBox = "//textarea[@aria-invalid='false']";
    String TimezoneTitle = "//p[contains(text(),'Set up your profile')]";
    
    
    
    
    
    
    
    
    
    
      public void boading()throws AWTException, InterruptedException{
    
  
       
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
       Robot r = new Robot();
       JavascriptExecutor js = (JavascriptExecutor)d;
    
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/system-admin");
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("BlueFlame AI");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usercount)));
      d.findElement(By.xpath(usercount)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(searchbox)));
      d.findElement(By.cssSelector(searchbox)).sendKeys("nextjs");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginAsButton)));
      
      
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
     
      
      d.findElement(By.xpath(loginAsButton)).click();
      d.switchTo().window(originalTab);
      
      
      d.navigate().refresh();
      d.navigate().to("https://app-dev.blueflame.ai/onboarding/");
      
      
      // Profile Option select in Onboarding Page
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(profileDropdownCssselector)));
      d.findElement(By.cssSelector(profileDropdownCssselector)).click();    
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profilelist)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profilelistalloptionsGenericXpath)));
      
     List <WebElement> allprofileoptions = d.findElements(By.xpath(profilelistalloptionsGenericXpath));
     
     
     for(WebElement profileoption : allprofileoptions  ){
         
  
         if(profileoption.getText().equalsIgnoreCase(profileoptiontoSelect)){
         
         System.out.println(profileoption.getText());
         profileoption.click();
         break;
  }
}
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(continueButtonxpath)));
     d.findElement(By.xpath(continueButtonxpath)).click();
     Thread.sleep(1990);
     
     
     // Timezone Select Page
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timezonepagetitle)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timeZoneFieldClick)));
     d.findElement(By.xpath(timeZoneFieldClick)).click();
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timeZoneList)));
      
     List <WebElement> timezoneoptions = d.findElements(By.xpath(timezoneLIstOption_genericXpath));
     
      for(WebElement timezone : timezoneoptions ){
          
        System.out.println(timezone.getText());
    
      if(timezone.getText().equalsIgnoreCase(timezoneOptiontochoose)){
      
      System.out.println(timezone.getText());     
        
       timezone.click();
        break; 
  }  } 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TimezoneTitle)));
      d.findElement(By.xpath(TimezoneTitle)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(continueButtonxpath)));
      d.findElement(By.xpath(continueButtonxpath)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatmodelChoosePageTitle)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gptfourOptionXpath)));
      d.findElement(By.xpath(gptfourOptionXpath)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(continueButtonxpath)));
      d.findElement(By.xpath(continueButtonxpath)).click();
      
      // Application Page in Onboarding
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(applicationListPageTitle)));  
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(continueButtonxpath)));
      d.findElement(By.xpath(continueButtonxpath)).click();
      
      // Blueprint/recipe List page In onboarding
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(recipelistpageTitle)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(recipeList)));
      a.moveToElement(d.findElement(By.xpath(recipeList))).build().perform();
      
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(continueButtonxpath)));
      d.findElement(By.xpath(continueButtonxpath)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tellusinteresttextBox)));
       d.findElement(By.xpath(tellusinteresttextBox)).sendKeys("More AI Models needs to be included");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(continueButtonxpath)));
      d.findElement(By.xpath(continueButtonxpath)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Chat')]")));
      
      
      } 
     
    
 }
    
    
    


