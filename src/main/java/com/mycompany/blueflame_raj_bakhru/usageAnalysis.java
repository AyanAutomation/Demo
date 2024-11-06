
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.UsageAnalysisPaths;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class usageAnalysis {
 
    WebDriver d;
    public usageAnalysis(WebDriver d){
         this.d =d;
    }
    public void usageAna() throws IOException{
        
        UsageAnalysisPaths up = new UsageAnalysisPaths(d);
        FileLib lib = new FileLib();
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
        TakesScreenshot shot = (TakesScreenshot)d;
        
     
        String url = lib.getPropertyData("UsageanalyisURL");
        
        d.get(url);
       
        w.until(ExpectedConditions.visibilityOf(up.userBox()));
        up.userBox().click();
        w.until(ExpectedConditions.visibilityOf(up.thirdoption()));
        
        List <WebElement>  users = up.userListGenericXpath;
        
        for(WebElement user :users){
        
        //System.out.println(user.getText());
        
        if(user.getText().equals("Matt Winters")){
        
        user.click();
        break;
   }}
      w.until(ExpectedConditions.visibilityOf(up.viewChat_Buttonin_List()));
    FileUtils.copyFile(shot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\Screenshot\\usageAnalyis.jpeg"));
    w.until(ExpectedConditions.visibilityOf(up.user_Column_in_list()));
    System.out.println(up.user_Column_in_list().getText());
    w.until(ExpectedConditions.visibilityOf(up.exportButton()));
    up.exportButton().click();
    w.until(ExpectedConditions.visibilityOf(up.dateRange_box()));
    up.dateRange_box().click();
    w.until(ExpectedConditions.visibilityOf(up.thirdoption()));
   
    List <WebElement>  dateranges = up.userListGenericXpath;
        
        for(WebElement daterange :dateranges){
      
        
       if(daterange.getText().equals("6 Month")){
        
        daterange.click();
        break;
   }}
        w.until(ExpectedConditions.visibilityOf(up.viewChat_Buttonin_List()));
        FileUtils.copyFile(shot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\Screenshot\\usageAnalyisafter_dateRange.jpeg"));
}}






