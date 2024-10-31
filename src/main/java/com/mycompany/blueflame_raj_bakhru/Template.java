
package com.mycompany.blueflame_raj_bakhru;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Template {
    
    
    WebDriver d;
    
   
    
    public Template(WebDriver d){
    
    
    this.d = d;
    
    
    }
    
    
    String Export_button = "//button[text()='Export']";
    String optionspaths = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1p4qlti']";
    String exportlist = "//ul[@role='menu']//li[@role='menuitem'][1]";
    String Desiredoption = "Templates";
    String Template_list = "//body/div[@id='demoPopover']/div[3]";
    String Templateoptions = "//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-1wtv3nt']";
    
    
    
    public void pptxfile_check() throws InterruptedException{
    
   
    
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button))); 
     d.findElement(By.xpath(Export_button)).click();  
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(exportlist)));
     List <WebElement> Exportoptions = d.findElements(By.xpath(optionspaths));
     
     
     for(WebElement Exportoption : Exportoptions  ){
         
         System.out.println(Exportoption.getText());
         
         
         if(Exportoption.getText().equalsIgnoreCase(Desiredoption)){
             
             Exportoption.click();
             Thread.sleep(3200);
             
             
                     
                    
         }}
             
            
     
           w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Template_list)));
             List <WebElement> templateoptions = d.findElements(By.xpath(Templateoptions));
             
             for (WebElement templateoption : templateoptions ){
             
             System.out.println(templateoption.getText());
            
             
             }
             
             
         }
    
    public void pptxfile_check_method_2() throws InterruptedException{
    
        
        
        String template_folder = "//li[contains(text(),'Templates')]";
        String templateSubSub_folder = "//p[contains(text(),'Template')]";
        String templatesubfolder = "//p[contains(text(),'AYn Demo Folder')]";
        String template_file = "//p[contains(text(),'Template.IC.Phase.1.Deck.pptx')]";
        String success_message = "//div[contains(text(),'You will receive an em')]";
        String toast_cancel = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
        
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button))); 
     d.findElement(By.xpath(Export_button)).click();  
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(template_folder))); 
     d.findElement(By.xpath(template_folder)).click();
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(templatesubfolder))); 
     d.findElement(By.xpath(templatesubfolder)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(templateSubSub_folder))); 
     d.findElement(By.xpath(templateSubSub_folder)).click();
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(template_file))); 
     d.findElement(By.xpath(template_file)).click();
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(success_message)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_cancel))); 
     d.findElement(By.xpath(toast_cancel)).click();
     
     
    Thread.sleep(3200);
    
    
    
    
    
    }
    
     public void template_folder_subfoldertraverse_back_check() throws InterruptedException{
     
         delete dels = new delete(d);
         
        String template_folder = "//li[contains(text(),'Templates')]";
        String templateSubSubfolder = "//p[contains(text(),'Template')]";
        String templateSuBfolder = "//p[contains(text(),'AYn Demo Folder')]";
        String template_file = "//p[contains(text(),'Template.IC.Phase.1.Deck.pptx')]";
        String gobackbutton= "//button[normalize-space()='Go Back']";
       
        
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button))); 
     d.findElement(By.xpath(Export_button)).click();  
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(template_folder))); 
     d.findElement(By.xpath(template_folder)).click();
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(templateSuBfolder))); 
     d.findElement(By.xpath(templateSuBfolder)).click(); 
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(templateSubSubfolder))); 
     d.findElement(By.xpath(templateSubSubfolder)).click(); 

     
     for(int i=0 ; i<2 ; i++ ){
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gobackbutton))); 
     d.findElement(By.xpath(gobackbutton)).click();
     Thread.sleep(3200);}
     d.navigate().refresh();
     
     dels.Delete_from_top();
    
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
    }
     }
     
     
     
     
     
     
     
     
     
     
     
    
     
     
         
     
    
    
    

