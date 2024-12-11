
package com.mycompany.blueflame_raj_bakhru;

import Input_data_package.Login_Creds;
import com.bfagent.pom.Loginxpaths;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class Login {
    
    WebDriver d;
    
public Login(WebDriver driver){

    this.d= driver;
       }

public void Loggin() throws IOException{
   
     Loginxpaths path = new Loginxpaths(d);
     Login_Creds creds = new Login_Creds(d);
     FileLib f= new FileLib();
    
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
     TakesScreenshot sc = (TakesScreenshot)d;
     
     w.until(ExpectedConditions.visibilityOf(path.Email_id_Field()));
     creds.setEmail(f.getPropertyData("emailid"));
     w.until(ExpectedConditions.visibilityOf(path.Email_submit_button()));
     path.Email_submit_button().click();
     w.until(ExpectedConditions.visibilityOf(path.Password_field()));
     creds.setPassword(f.getPropertyData("password"));
     path.Login_SubmitButton_xpath().click();  
     w.until(ExpectedConditions.visibilityOf(path.Chat_list_title()));
     FileUtils.copyFile(sc.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\webskitters\\Desktop\\Rj bakru modification\\sc.png"));
}}