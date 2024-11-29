
package com.mycompany.blueflame_raj_bakhru;

import static dev.failsafe.spi.ExecutionResult.exception;
import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;


public class Selectfiles {
    
    WebDriver d;
    
    
    
    public  Selectfiles(WebDriver d){
    
    this.d = d;
    
    
    
    }
    
    String popuptitletext = "//p[text()='My uploads']";
    String PlusButton = "//div[@class='MuiBox-root css-rm2j0s']//button[@type='button']";
    String SelectFilesoption = "//button[text()='Select From Files']";
    String ConfirmselectButton = "//div[text()='Confirm Selection']"; 
    String searchbox = "(//input[@placeholder='Search'])[2]" ;
    String Searchresult= "//p[text()='Search results']";
    String filecheckboxselect = "(//div[@class='MuiBox-root css-1in6zbs']//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-15na89n'])[2]";
    
    
    
    
    
    public void selectchatfiles() throws InterruptedException{
    
        
     String SelectInputButton = "(//div[@class='MuiBox-root css-1in6zbs']//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-15na89n'])[1]";
        
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
  
  
    
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PlusButton)));
  d.findElement(By.xpath(PlusButton)).click();
  Thread.sleep(800); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectFilesoption)));      
  d.findElement(By.xpath(SelectFilesoption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popuptitletext)));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectInputButton)));      
  d.findElement(By.xpath(SelectInputButton)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmselectButton)));  
  Thread.sleep(1500);
  d.findElement(By.xpath(ConfirmselectButton)).click();
  Thread.sleep(1500);
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PlusButton)));
  d.findElement(By.xpath(PlusButton)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectFilesoption)));      
  d.findElement(By.xpath(SelectFilesoption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popuptitletext)));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectInputButton)));      
  d.findElement(By.xpath(SelectInputButton)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmselectButton)));  
  Thread.sleep(2500);
  d.findElement(By.xpath(ConfirmselectButton)).click();
  Thread.sleep(2500);
    
    //d.navigate().refresh();
    
    }
    
  
    public void autofill_qna_check() throws InterruptedException{
    
      
       String editorbox = "//p[@data-placeholder = 'Ask me a question']";
        String qnaoption = "//p[contains(text(),'/qna {location}')]";
        String checkbox ="(//div[@class='MuiBox-root css-1in6zbs']//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-15na89n'])[1]";
        
     Actions a = new Actions(d);     
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
        
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PlusButton)));
  d.findElement(By.xpath(PlusButton)).click();
  Thread.sleep(1000); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectFilesoption)));      
  d.findElement(By.xpath(SelectFilesoption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popuptitletext)));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbox)));      
  a.moveToElement(d.findElement(By.xpath(searchbox))).click().sendKeys("pip").build().perform(); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Searchresult)));      
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(checkbox))); 
  d.findElement(By.xpath(checkbox)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmselectButton)));  
  Thread.sleep(2500);
  d.findElement(By.xpath(ConfirmselectButton)).click();
  Thread.sleep(2500);
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editorbox)));      
  d.findElement(By.xpath(editorbox)).sendKeys("/qna");   
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnaoption)));      
  d.findElement(By.xpath(qnaoption)).click();   
  Thread.sleep(3850); }
  
    
  
    
    public void multifilesselect() throws InterruptedException, AWTException{
    
    String PlusButton = "//div[@class='MuiBox-root css-rm2j0s']//button[@type='button']";
    String SelectFilesoption = "//button[text()='Select From Files']";
    String foldertext = "//h3[contains(text(),'Folders')]";
    String Aynfolder = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[1]/span/div/div/div[10]/span/div/div[2]";
    String Foldertitletext = "//a[contains(text(),'AYn Demo Folder')]";
    String insidepage = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[1]";
    String fileoneselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/span/div/span";
    String filetwoselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/span/div/span";
    String filethreeselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[3]/span/div/span";
    String filefourselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[4]/span/div/span";
    String filefiveselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[5]/span/div/span";
    String filesixselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[6]/span/div/span";
    String filesevenselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[7]/span/div/span";
    String fileightselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[8]/span/div/span";
    String filenineselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[9]/span/div/span";
    String filetenselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[10]/span/div/span";
    String fileelevenselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[11]/span/div/span";
    String filetwelveselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[12]/span/div/span";
    String filethirteenselect = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[13]/span/div/span";
    String hoveroverfile = "//*[@id=\"chat_write_area\"]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div";
    String editorbox = "//p[@data-placeholder = 'Ask me a question']";
    String filedeselectbutton = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]";
    String ConfirmselectButton = "/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/button[2]";
    String SelectInputButton = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[1]/span/div/div/div[4]/span/div/div[1]/span";
    String insidelist = "/html/body/div[2]/div[3]/div/div[1]/div[3]/div[1]";
    
    
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    Robot r = new Robot();
    
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PlusButton)));
  d.findElement(By.xpath(PlusButton)).click();
  Thread.sleep(1000); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectFilesoption)));      
  d.findElement(By.xpath(SelectFilesoption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(insidelist)));
 a.moveToElement(d.findElement(By.xpath(insidelist))).build().perform();
  r.mouseWheel(-25);
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Aynfolder)));
  d.findElement(By.xpath(Aynfolder)).click(); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Foldertitletext)));  
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(insidepage)));
  a.moveToElement(d.findElement(By.xpath(insidepage))).build().perform();
  r.mouseWheel(-3);
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fileoneselect)));      
  d.findElement(By.xpath(fileoneselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filetwoselect)));      
  d.findElement(By.xpath(filetwoselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filethreeselect)));      
  d.findElement(By.xpath(filethreeselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filefourselect)));      
  d.findElement(By.xpath(filefourselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filefiveselect)));      
  d.findElement(By.xpath(filefiveselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filesixselect)));      
  d.findElement(By.xpath(filesixselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filesevenselect)));      
  d.findElement(By.xpath(filesevenselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fileightselect)));      
  d.findElement(By.xpath(fileightselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filenineselect)));      
  d.findElement(By.xpath(filenineselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filetenselect)));      
  d.findElement(By.xpath(filetenselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fileelevenselect)));      
  d.findElement(By.xpath(fileelevenselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filetwelveselect)));      
  d.findElement(By.xpath(filetwelveselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filethirteenselect)));      
  d.findElement(By.xpath(filethirteenselect)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmselectButton)));      
  d.findElement(By.xpath(ConfirmselectButton)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editorbox)));      
  d.findElement(By.xpath(Aynfolder)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hoveroverfile))); 
  a.moveToElement(d.findElement(By.xpath(hoveroverfile))).build().perform();
 
  
        
 
  for(int i=0 ; i <=3 ; i++){
  
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filedeselectbutton)));   
  d.findElement(By.xpath(filedeselectbutton)).click();

    
    
  }      
    }



public void File_with_pipesearch_in_filespoup() throws InterruptedException{


    String PlusButton = "//div[@class='MuiBox-root css-rm2j0s']//button[@type='button']";
    String SelectFilesoption = "//button[text()='Select From Files']";
    
    
    
    
    

    
  Actions a = new Actions(d);  
  WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
  LigthmodeSwitch switchmode = new LigthmodeSwitch(d);
  
  
  
  switchmode.switchonLightmode();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PlusButton)));
  d.findElement(By.xpath(PlusButton)).click();
  Thread.sleep(1000); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectFilesoption)));      
  d.findElement(By.xpath(SelectFilesoption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popuptitletext)));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbox)));
  a.moveToElement(d.findElement(By.xpath(searchbox))).click().sendKeys("dummy").build().perform();

   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Searchresult)));   
   
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filecheckboxselect))); 
 
    d.findElement(By.xpath(filecheckboxselect)).click();
    System.out.println(d.findElement(By.xpath(filecheckboxselect)).isSelected());
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmselectButton)));  
    Thread.sleep(800);
    d.findElement(By.xpath(ConfirmselectButton)).click();
    Thread.sleep(800);
    
}
}



    
    


