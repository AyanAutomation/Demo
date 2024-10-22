
package com.mycompany.blueflame_raj_bakhru;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class QnA_section {
    
    WebDriver d;
    
    
    
    public QnA_section(WebDriver d){
    
    this.d = d;
  }
   
    
    
    String sourceSelectBox = "//textarea[@spellcheck='false']";
    String suggestionList = "//ul[@id='tags-standard-listbox']";
    String allOptns = "//li[@class='MuiAutocomplete-option MuiBox-root css-16r7kf5']";
    String fstoption = "AEP/Project Vivid/3.0 Products, Customers, Sales & Marketing";        
    String questionEnterBox = "//input[@placeholder='Enter your question *']";
    String searchbutton = "//button[@type='submit']";
    String qatoChatButton = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]";
    String searchBox_withContent = "//input[@value='tom']";
    String answerText = "//h3[contains(text(),'Answer')]";
    String qnaHistoryButton = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]";
    String favouroteHistoryCard = "//h4[contains(text(),'Show me Details')]";
    String sideHistorytabcloseButton = "//body/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]";
    String FavoriteListContent_Genericxpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-x7hmfl']";
    String cardToSelect = "Project Cardinal/Pre-LOI Information/Drexler CIM 2021.pdf";
    String favoriteButton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]";
    String qnaToChatButton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]/*[1]";
    String favUnfavsuccessToast = "//body/div[@id='root']/section[1]/ol[1]/li[1]";
    String toastCrossButton = "//button[@aria-label='Close toast']";
    String chatTitle = "//h3[contains(text(),'File Q&A')]";
    String showSourceicon = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]";
    String showSource_contentOpen = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/button[1]";
    String chatUserIcon = "//i[@class='abs_ico user_ico']";
    String SourceisSelected_confirmation = "//p[contains(text(),'AEP/Project Vivid/3.0 Products, Customers, Sales &')]";
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void qnasearchCheck(){
        
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
       Actions a = new Actions(d);
        
        d.navigate().to("https://app-dev.blueflame.ai/dashboard/qna");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sourceSelectBox)));
        d.findElement(By.xpath(sourceSelectBox)).sendKeys("tom");
  
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(suggestionList)));
        
       List <WebElement> optionsare = d.findElements(By.xpath(allOptns));
       
       
       for(WebElement eachoptn : optionsare ){
       
       System.out.println(eachoptn.getText());
       
       if(eachoptn.getText().equalsIgnoreCase(fstoption)){
       
       eachoptn.click();
       break;
       }
     }
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SourceisSelected_confirmation)));
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(questionEnterBox)));
       d.findElement(By.xpath(questionEnterBox)).sendKeys("tom");
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbutton)));
       d.findElement(By.xpath(searchbutton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qatoChatButton)));
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchBox_withContent)));
       d.findElement(By.xpath(searchBox_withContent)).click();
       d.findElement(By.xpath(searchBox_withContent)).clear();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(questionEnterBox)));
       d.findElement(By.xpath(questionEnterBox)).sendKeys("Item Analysis Report");
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbutton)));
       d.findElement(By.xpath(searchbutton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(answerText))); 
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnaHistoryButton)));
       d.findElement(By.xpath(qnaHistoryButton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(favouroteHistoryCard)));
       d.findElement(By.xpath(favouroteHistoryCard)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sideHistorytabcloseButton)));
       d.findElement(By.xpath(sideHistorytabcloseButton)).click();
       
    
 }
    
    public void qnafavoritecheck() throws InterruptedException{
        
        
        
        
    
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
        
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/qna");
    
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnaHistoryButton)));
       d.findElement(By.xpath(qnaHistoryButton)).click();
       
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FavoriteListContent_Genericxpath)));
    
      List <WebElement> favoritecards = d.findElements(By.xpath(FavoriteListContent_Genericxpath));
      
      
      for(WebElement favcards : favoritecards){
      
     
      
      
     if(favcards.getText().equalsIgnoreCase(cardToSelect)){
     
     System.out.println(favcards.getText());
     favcards.click();
     
     break;
 }
}
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sideHistorytabcloseButton)));
      d.findElement(By.xpath(sideHistorytabcloseButton)).click();
      Thread.sleep(2950);
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(favoriteButton)));
      
      for(int i=0 ; i<2; i++ ){
      
      d.findElement(By.xpath(favoriteButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(favUnfavsuccessToast)));
      System.out.println(d.findElement(By.xpath(favUnfavsuccessToast)).getText());
      try{
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossButton)));
      d.findElement(By.xpath(toastCrossButton)).click();
      }
      
      catch(StaleElementReferenceException e){
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossButton)));
      d.findElement(By.xpath(toastCrossButton)).click();
      }
      }
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnaToChatButton)));
      d.findElement(By.xpath(qnaToChatButton)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatTitle)));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(showSourceicon)));
      d.findElement(By.xpath(showSourceicon)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(showSource_contentOpen)));
      a.moveToElement(d.findElement(By.xpath(chatUserIcon))).build().perform();

   try{   
      d.findElement(By.xpath(showSource_contentOpen)).click();
       System.out.println("showSource_contentOpen Element found executing click operation");
   }
   
   catch(ElementClickInterceptedException e){
   
    System.out.println("showSource_contentOpen element not found thereby skipping this step");
   
   
   }
   
   }
    
}
    