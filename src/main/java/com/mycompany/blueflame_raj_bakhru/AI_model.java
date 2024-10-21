
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.AI_model_Paths;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AI_model {
    
    
    WebDriver d;
    
public AI_model(WebDriver d){


this.d =d;

}

public void Ai_model_selectioncheck() throws InterruptedException{
 
    
    AI_model_Paths ai = new AI_model_Paths(d);
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    
 w.until(ExpectedConditions.visibilityOf(ai.Aimodeltab()));
 ai.Aimodeltab().click();
 Thread.sleep(500);
 w.until(ExpectedConditions.visibilityOf(ai.Gpt4model()));
 ai.Gpt4model().click();
 Thread.sleep(500);
 w.until(ExpectedConditions.visibilityOf(ai.Light_mode()));
 ai.Light_mode().click();
 Thread.sleep(500);
 w.until(ExpectedConditions.visibilityOf(ai.Aigpt4tab()));
 ai.Aigpt4tab().click();
 Thread.sleep(500);
 d.navigate().refresh();

}


public void modelchangecheck(){
    
  String blueFlameoption = "BlueFlame AI Agent";
  AI_model_Paths ai = new AI_model_Paths(d);
  WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
  Actions a = new Actions(d);

  w.until(ExpectedConditions.visibilityOf(ai.Profileicon()));
  a.moveToElement(ai.Profileicon()).build().perform();
  ai.Profileicon().click();

  w.until(ExpectedConditions.visibilityOf(ai.Profileoption()));
  ai.Profileoption().click();
  w.until(ExpectedConditions.visibilityOf(ai.Default_model_editbutton()));
  ai.Default_model_editbutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.Defaultoption()));
  ai.Defaultoption().click();
  w.until(ExpectedConditions.visibilityOf(ai.Lamaoption()));
  ai.Lamaoption().click();
  w.until(ExpectedConditions.visibilityOf(ai.Savebutton()));
  ai.Savebutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.savesuccessmessage()));

  w.until(ExpectedConditions.visibilityOf(ai.toastcrossone()));
  ai.toastcrossone().click();
  w.until(ExpectedConditions.visibilityOf(ai.LLM_editbutton()));
  ai.LLM_editbutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.LLMoption()));
  ai.LLMoption().click();  
  w.until(ExpectedConditions.visibilityOf(ai.LLMoptiontochoose()));
  ai.LLMoptiontochoose().click();
  w.until(ExpectedConditions.visibilityOf(ai.LLMsavebutton()));
  ai.LLMsavebutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.LLMsuccess_message()));
  
  w.until(ExpectedConditions.visibilityOf(ai.toastcrosstwo()));
  ai.toastcrosstwo().click();
  w.until(ExpectedConditions.visibilityOf(ai.Chatoption_in_menu()));
  ai.Chatoption_in_menu().click();
  w.until(ExpectedConditions.visibilityOf(ai.Modelbutton()));
  ai.Modelbutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.Lamaoption()));
  w.until(ExpectedConditions.visibilityOf(ai.Defaultoption()));
  d.navigate().refresh();
  
  w.until(ExpectedConditions.visibilityOf(ai.Profileicon()));
  a.moveToElement(ai.Profileicon()).build().perform();
  ai.Profileicon().click();

  w.until(ExpectedConditions.visibilityOf(ai.Profileoption()));
  ai.Profileoption().click();
  w.until(ExpectedConditions.visibilityOf(ai.Default_model_editbutton()));
  ai.Default_model_editbutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.Lamaoption()));
  ai.Lamaoption().click();
  List<WebElement> alldeflautoptions =  ai.defaultListOptions();
    
    for(WebElement defaultopt : alldeflautoptions ){
    
    System.out.println(defaultopt.getText());
   
    if(defaultopt.getText().equalsIgnoreCase(blueFlameoption)){
    
    defaultopt.click();
    break;
    }
    
    
    }
   w.until(ExpectedConditions.visibilityOf(ai.Savebutton()));
   ai.Savebutton().click();
   w.until(ExpectedConditions.visibilityOf(ai.savesuccessmessage()));

    w.until(ExpectedConditions.visibilityOf(ai.toastcrossone()));
    ai.toastcrossone().click();
    w.until(ExpectedConditions.visibilityOf(ai.LLM_editbutton()));
    ai.LLM_editbutton().click();
    w.until(ExpectedConditions.visibilityOf(ai.rechoose()));
    ai.rechoose().click();  
   w.until(ExpectedConditions.visibilityOf(ai.LLMoption()));
   ai.LLMoption().click();
  w.until(ExpectedConditions.visibilityOf(ai.LLMsavebutton()));
  ai.LLMsavebutton().click();
  w.until(ExpectedConditions.visibilityOf(ai.LLMsuccess_message()));
  
  w.until(ExpectedConditions.visibilityOf(ai.toastcrosstwo()));
  
  w.until(ExpectedConditions.visibilityOf(ai.Chatoption_in_menu()));
  ai.Chatoption_in_menu().click();
  w.until(ExpectedConditions.visibilityOf(ai.Modelbutton()));
  ai.Modelbutton().click();
  d.navigate().refresh();

}


}