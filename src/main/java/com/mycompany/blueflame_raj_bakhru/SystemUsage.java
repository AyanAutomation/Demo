
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.SystemUsagePaths;
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


public class SystemUsage {
    
    WebDriver d;
    
    public SystemUsage(WebDriver d){
    
    this.d=d;
    }
    
    public void systemUsaGe() throws IOException{
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(15));
       SystemUsagePaths syspaths = new SystemUsagePaths(d);
       Screenshot_Class ss = new Screenshot_Class(d);
       FileLib Flb = new FileLib();
      
       String pageurl = Flb.getPropertyData("SystemUsageURL");
       String usr = Flb.getPropertyData("userofusageSystem");
       d.navigate().to(pageurl);
       
      
      w.until(ExpectedConditions.visibilityOf(syspaths.SystemUsage_PageTitle()));
      syspaths.SystemUsage_PageTitle().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.userListInfoIcon()));
      syspaths.userListInfoIcon().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.userDataPopup()));
      System.out.println(syspaths.userDataPopup().getText());
      ss.systemusageScreenshot();
      d.navigate().refresh();

      w.until(ExpectedConditions.visibilityOf(syspaths.ExportButton()));
      syspaths.ExportButton().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.datebox()));
      syspaths.datebox().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.prvmonth()));
      syspaths.prvmonth().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.dateinCalender()));
      syspaths.dateinCalender().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.AccountusageTab()));
      syspaths.AccountusageTab().click();
      w.until(ExpectedConditions.visibilityOf(syspaths.UserAccountBox()));
      syspaths.UserAccountBox().click();
      
      List <WebElement> users = syspaths.DateRangeListGenericXpath;
        
      for(WebElement user : users){
          
         System.out.println(user.getText()); 
       if(user.getText().equalsIgnoreCase(usr)){
        
             user.click();
             break;
         }}
      
      w.until(ExpectedConditions.visibilityOf(syspaths.userUsageTab()));
      syspaths.userUsageTab().click();
      
      String chatpageurl = Flb.getPropertyData("url");
      d.navigate().to(chatpageurl);
   }
}
