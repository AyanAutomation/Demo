
package com.mycompany.blueflame_raj_bakhru;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot_Class {
    
    WebDriver d;
    
    
   public Screenshot_Class(WebDriver d){
    
    this.d=d; }
    
   
   
   
  public void ControlAScreenshot() throws IOException{
   
   TakesScreenshot shot = (TakesScreenshot)d;
   
   FileUtils.copyFile(shot.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\Screenshot\\Control_A.jpeg"));
   
   }
    
  
 public void qnaresultScreenshot() throws IOException{
 
 TakesScreenshot shot = (TakesScreenshot)d;
   
   FileUtils.copyFile(shot.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\Screenshot\\Qnaresult.jpeg"));
   } 
 
 public void systemusageScreenshot() throws IOException{
 
 TakesScreenshot shot = (TakesScreenshot)d;
   
   FileUtils.copyFile(shot.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\Screenshot\\systemusage.jpeg"));
   } 
 
  
}
