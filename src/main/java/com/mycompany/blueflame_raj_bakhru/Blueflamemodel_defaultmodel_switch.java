
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Blueflamemodel_defaultmodel_switch {
    
   public WebDriver d;
    
String Aimodeltab = "//div[@class='MuiBox-root css-q69oui']//button[@type='button']";
String Gpt4model = "//p[contains(text(),'GPT-4 (OpenAI)')]";
String Aigpt4tab = "//*[@aria-label='GPT-4 (OpenAI)']";
String Light_mode = "//img[@src='/assets/images/lightButton.svg']";
String defaultmodel = "//*[@aria-label='You can change your default in the settings']";
String defaultModelSearchBox = "//input[@placeholder='Search']";
String Profileicon = "//span[@class='MuiButton-icon MuiButton-startIcon MuiButton-iconSizeMedium css-1l6c7y9']//i";
String Profileoption = "//p[text()='Profile']";
String Default_model_editbutton = "(//p[text()='Edit'])[2]";
String Defaultoption = "//p[@class='MuiTypography-root MuiTypography-body1 css-vw0zfu']";
String defaultListOptions = "//div[@class='MuiBox-root css-evipjh']//div[@data-testid='flex-box']//div[@class='MuiBox-root css-ehlpcq']//button[@type='button']//div[@class='MuiBox-root css-1o4wo1x']//p[@class='MuiTypography-root MuiTypography-body1 css-newj2o']";
String blueFlameoption = "BlueFlame AI Agent";
String blueFlameoption_xpath = "//p[text()='BlueFlame AI Agent']";
String Savebutton = "//p[text()='Save']";
String savesuccessmessage = "//div[contains(text(),'Default Web Chat Model Updated Successfully.')]";
String toastcrossone = "//button[@aria-label='Close toast']";
String LLM_editbutton = "//*[@id=\"default-direct\"]/td[3]/button";      
String gptLLmoption = "GPT-4 (OpenAI)";
String llmOption = "//tbody/tr[@id='default-direct']/td[2]/div[1]/div[1]";
String LLMsuccess_message = "//div[contains(text(),'Direct LLM Updated Successfully.')]";
String toastcrosstwo = "//button[@aria-label='Close toast']";
String llmsavebutton = "//tbody/tr[@id='default-direct']/td[3]/div[1]/button[1]";
String tablebodyxpath = "//table[@aria-label='account-table']";
String value_of_DefaultWebChatModel = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1uz0oep'])[10]";

    public Blueflamemodel_defaultmodel_switch(WebDriver d){
    
    this.d = d;
    
}
    public void switchingTodefaultAimodel() throws InterruptedException, AWTException{
    
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
     JavascriptExecutor js = (JavascriptExecutor)d;
     
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
     
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Aimodeltab)));
      d.findElement(By.xpath(Aimodeltab)).click();
      Thread.sleep(500);
      String defaultModelPresent = d.findElement(By.xpath(defaultmodel)).getText();
    
    //System.out.println(defaultModelPresent);
    
    String blueflamemodel = "BlueFlame AI Agent\n" +
"Default";
    
    String gpt4model = "GPT-4 (OpenAI)\n" +
"Default";
 
//Inverse Operator makes the statement not equal from equals
    
    if(!defaultModelPresent.equals(gpt4model)){
    
        Actions a = new Actions(d);
        Robot r = new Robot();
        
  
  d.navigate().refresh();
  LigthmodeSwitch mode = new LigthmodeSwitch(d);
  
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Profileicon)));
  a.moveToElement(d.findElement(By.xpath(Profileicon))).build().perform();
  d.findElement(By.xpath(Profileicon)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Profileoption)));
  d.findElement(By.xpath(Profileoption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tablebodyxpath)));
  a.moveToElement(d.findElement(By.xpath(tablebodyxpath))).build().perform();
  r.mouseWheel(-100);
  d.findElement(By.xpath(Default_model_editbutton)).click();
  mode.switchonLightmode();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Defaultoption)));
  d.findElement(By.xpath(Defaultoption)).click(); 
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(defaultModelSearchBox)));
  d.findElement(By.xpath(defaultModelSearchBox)).sendKeys(blueFlameoption);
  
   List <WebElement> alldeflautoptions =  d.findElements(By.xpath(defaultListOptions));
    
    for(WebElement defaultopt : alldeflautoptions ){
   
    if(defaultopt.getText().equalsIgnoreCase(blueFlameoption)){
     System.out.println(defaultopt.getText());
     defaultopt.click();
    break;
    }
   }
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Savebutton)));
    Thread.sleep(1800);  
    d.findElement(By.xpath(Savebutton)).click();
    Thread.sleep(1800);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(savesuccessmessage)));
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastcrossone)));
    d.findElement(By.xpath(toastcrossone)).click(); 
    mode.switchonLightmode();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value_of_DefaultWebChatModel)));
     String selected_DefaultWebChatModel = d.findElement(By.xpath(value_of_DefaultWebChatModel)).getText();
     System.out.println(selected_DefaultWebChatModel);
     if(!selected_DefaultWebChatModel.equals(blueFlameoption)){
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Default_model_editbutton)));
    d.findElement(By.xpath(Default_model_editbutton)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Defaultoption)));
    d.findElement(By.xpath(Defaultoption)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blueFlameoption_xpath)));
    d.findElement(By.xpath(blueFlameoption_xpath)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Savebutton)));
    d.findElement(By.xpath(Savebutton)).click();
    d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
    }
     else{
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LLM_editbutton)));
    d.findElement(By.xpath(LLM_editbutton)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(llmOption)));
    d.findElement(By.xpath(llmOption)).click(); 
    
     List <WebElement> allLMoptions =  d.findElements(By.xpath(defaultListOptions));
    
    for(WebElement llmtopt : allLMoptions ){
    
    if(llmtopt.getText().equalsIgnoreCase(gptLLmoption)){
    System.out.println(llmtopt.getText());
    llmtopt.click();
    break;
    }
    }
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(llmsavebutton)));
    d.findElement(By.xpath(llmsavebutton)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LLMsuccess_message)));
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastcrosstwo)));
    d.findElement(By.xpath(toastcrosstwo)).click();
    d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
    
     } }
 else {
        
        System.out.println("model already default Blueflame model");
        d.navigate().refresh(); 
 }
   
}
            
}
