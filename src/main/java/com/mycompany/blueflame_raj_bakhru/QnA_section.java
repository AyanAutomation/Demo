
package com.mycompany.blueflame_raj_bakhru;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
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
   
    
    String Source_fileselectCheckBox = "(//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-15na89n'])[1]";
    String sourceSelectButton = "//div[text()='Locations to search']";
    String sourceListpopup = "//p[text()='Files to search against']";
    String searchbox = "//input[@placeholder='Search']";
    String SourceList = "//p[text()='Name']";
    String confirmSelectionButton = "//*[text()='Confirm Selection']";        
    String questionEnterBox = "//*[@placeholder='Ask a question about the selected files']";
    String searchbutton = "//*[text()='Search']";
    String qatoChatButton = "//*[text()='Open in Chat']";
    String searchBox_withContent = "//input[@value='tom']";
  
    String answerText = "//*[text()='Answer']";
    String qnafavouritesButton = "//*[text()='Favorites']";
    String qnaHistoryList = "(//p[@class='MuiBox-root css-1w1cbyh'])[1]";
    String historyButton = "//div[text()='History']";
    String historycontentTable = "//div[@data-testid='history-drawer-content']";
    String favhistorycontentTable = "//div[@data-testid='favorites-drawer-content']";
    String allfavouroteHistoryCards = "//*[@class='MuiTypography-root MuiTypography-body1 css-1q5f10e']";
    String historyanswerfetched = "//strong[text()='Concept Origin']";
    String FavoriteListContent_Genericxpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-x7hmfl']";
    String historyListGenericXpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1q5f10e']";
    String FavcardToSelect = "show me details";
    String HistorycardToSelect = "sphere";
    String threedotButton = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-b8uu0t'])[1]";
    String favoriteButton = "(//div[@tabindex='-1']//div[@data-testid='flex-box']//div[@class='MuiBox-root css-1o4wo1x'])[1]";
    
    String favUnfavsuccessToast = "//li[@aria-live='polite']";
    String toastCrossButton = "//button[@aria-label='Close toast']";
    String chatTitle = "//div[@class='MuiStack-root css-q1mfq2']//p[contains(text(),'File Q&A')]";
    String showSourceicon = "//button[text()='Show Sources']";
    String showSource_contentOpen = "//*[@class='MuiBox-root css-1h2lvk']";
    String chatUserIcon = "(//*[@class='MuiBox-root css-vr5l65']//i)[6]";
    String SourceisSelected_confirmation = "//div[@aria-label='Project Aston/23.15_Legal/23.15.3_Contracts with Top 20 Customers']";
    
    
    
    
    
 
    
    public void qnasearchCheck() throws IOException{
        
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
       Actions a = new Actions(d);
       Screenshot_Class ss = new Screenshot_Class(d);
        
        d.navigate().to("https://app-dev.blueflame.ai/dashboard/qna");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sourceSelectButton)));
        d.findElement(By.xpath(sourceSelectButton)).click();
  
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sourceListpopup)));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbox)));
        d.findElement(By.xpath(searchbox)).sendKeys("tom");
        d.findElement(By.xpath(searchbox)).sendKeys(Keys.ENTER);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SourceList)));
        a.moveToElement(d.findElement(By.xpath(SourceList))).build().perform(); 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Source_fileselectCheckBox)));
        d.findElement(By.xpath(Source_fileselectCheckBox)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirmSelectionButton)));
        d.findElement(By.xpath(confirmSelectionButton)).click();
        
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SourceisSelected_confirmation)));
       
       d.findElement(By.xpath(searchBox_withContent)).clear();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(questionEnterBox)));
       d.findElement(By.xpath(questionEnterBox)).sendKeys("Item Analysis Report");
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbutton)));
       d.findElement(By.xpath(searchbutton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(answerText))); 
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnafavouritesButton)));
       d.findElement(By.xpath(qnafavouritesButton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(favhistorycontentTable)));
       
       List<WebElement> favcards = d.findElements(By.xpath(allfavouroteHistoryCards));
      
      
     for(WebElement favitem : favcards){
      
      System.out.println(favitem.getText());
      
      if(favitem.getText().equals(FavcardToSelect)){
      
      favitem.click();
      break;
     }
     }
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Key Points:']")));
      ss.qnaresultScreenshot();
      d.navigate().refresh();
    
 }
    
    
    
    
    public void qnafavoritecheck() throws InterruptedException{
        
   
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
        
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/qna");
       
       
    
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnaHistoryList)));
       d.findElement(By.xpath(qnaHistoryList)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(historyButton)));
       d.findElement(By.xpath(historyButton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(historycontentTable)));
       
       
       
    
      List <WebElement> hisotrycards = d.findElements(By.xpath(historyListGenericXpath));
      
      
      for(WebElement hitoryitem : hisotrycards){
   
     if(hitoryitem.getText().equalsIgnoreCase(HistorycardToSelect)){
     
     System.out.println(hitoryitem.getText());
     hitoryitem.click();
     
     break;
 }
}
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(historyanswerfetched)));

      
      for(int i=0 ; i<2; i++ ){
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedotButton)));
      d.findElement(By.xpath(threedotButton)).click();
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
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qatoChatButton)));
      d.findElement(By.xpath(qatoChatButton)).click();
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
   
   }}}
    