
package com.mycompany.blueflame_raj_bakhru;

import static com.google.common.net.MediaType.JPEG;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import sun.awt.www.content.image.jpeg;


public class File_section_Checks {
    
    WebDriver d;
    
    
    String menu_option = "//div[@class='MuiBox-root css-15x4ckx']//ul";
    String File_option_menu ="//a[@href='/dashboard/file-management']";
    String Searchbox = "//input[@placeholder='search']";
    String Searchoptionvalue = "//li[text()='AYn Demo Folder/Economics/Shadow Oil Fleet Funding War Laid Bare - Newsweek.pdf']";
    String Subfolder_name_in_breadcrumb = "//a[contains(text(),'AYn Demo Folder')]";
    String filetext = "//p[contains(text(),'Shadow Oil Fleet Funding War Laid Bare -...')]";
    String chaterrorMessageText = "//div[contains(text(),'This file was not yet indexed for chat. Please wai')]";
    String folder_Before_Folder_to_choose = "//div[@class='heading MuiBox-root css-0']";
    String threedotbutton = "(//div[@class='MuiStack-root css-18jqwfu']//button)[2]";
    String menuListfromThreeDotButton = "//ul[@role='menu']";
    String allitemsinmenu = "//ul[@role='menu']//li[@role='menuitem']";
    String allfiles_select_box = "(//div[@class='MuiBox-root css-1hx2chv']//span)[1]";
    String allfilestext = "//p[contains(text(),'All files')]";
    String toast_messagecancel_button = "//button[@aria-label='Close toast']";
    
    
   public  File_section_Checks(WebDriver d){
    
    
    this.d = d;
    
    }
    
    
    public void searchlaggycheck() throws AWTException, InterruptedException{
    
    
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        Robot r = new Robot();
        Actions a = new Actions(d);

        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menu_option)));

        a.moveToElement(d.findElement(By.xpath(menu_option)));

        r.mouseWheel(-200);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(File_option_menu))); 
        d.findElement(By.xpath(File_option_menu)).click(); 
        Thread.sleep(1200);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Searchbox))); 
        d.findElement(By.xpath(Searchbox)).sendKeys("shadow oil fleet");
        
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Searchoptionvalue))); 
        d.findElement(By.xpath(Searchoptionvalue)).click(); 
    
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filetext))); 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Subfolder_name_in_breadcrumb))); 
        d.findElement(By.xpath(Subfolder_name_in_breadcrumb)).click(); 
    
    
    }
    
    public void emlfilecheck() throws AWTException, InterruptedException{
    
        
        String eml_fileindrodownoption = "//li[contains(text(),'verity/21410/2024_06_15_JZ_Weekly.eml')]";
        String eml_filecard = "//div[@class='MuiBox-root css-kr2xbr']";
        String crossbutton_of_opened_file = "//div[@class='MuiStack-root css-5vauxo']//button[@type='button']";
        String Dropdwnlist = "//ul[@role='listbox']";
        String alloptions_in_dropdown = "//ul[@role='listbox']//li[@class='MuiAutocomplete-option MuiBox-root css-16r7kf5']";
        String emlfile_in_option = "verity/21414/RE__CHRW_Refresh.eml";
     
        
        
        
         WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(65));
         Actions a = new Actions(d);
         Robot r = new Robot();
         
        d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
         
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menu_option)));

        a.moveToElement(d.findElement(By.xpath(menu_option)));

        r.mouseWheel(-200);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(File_option_menu))); 
        d.findElement(By.xpath(File_option_menu)).click(); 
        Thread.sleep(1200);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Searchbox))); 
        d.findElement(By.xpath(Searchbox)).sendKeys("verity/21414/");
        
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Dropdwnlist)));
          w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(alloptions_in_dropdown)));
          
          List <WebElement> allemlfilesindropdownoptions = d.findElements(By.xpath(alloptions_in_dropdown));
          
          for(WebElement allemlfilesindropdownoption : allemlfilesindropdownoptions ){
  
             if(allemlfilesindropdownoption.getText().equalsIgnoreCase(emlfile_in_option)){

                 allemlfilesindropdownoption.click();
               break;
             }
 }         
           w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
           w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eml_filecard))); 
           a.moveToElement(d.findElement(By.xpath(eml_filecard))).build().perform();
           d.findElement(By.xpath(eml_filecard)).click();

           w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(crossbutton_of_opened_file))); 
           Thread.sleep(1800);
           d.findElement(By.xpath(crossbutton_of_opened_file)).click(); 

    }
    
    
    
    
   public void subfolder_select_from_searchcheck() throws InterruptedException{
   
   String subfoldermenuoption = "//li[contains(text(),'AYn Demo Folder/Economics')][1]";
   String firtbreadcrumb = "//li[@class='MuiBreadcrumbs-li'][1]";
   
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
   
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Searchbox))); 
        d.findElement(By.xpath(Searchbox)).sendKeys("AYn Demo Folder/Economics");
      
        Thread.sleep(2800);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subfoldermenuoption))); 
        d.findElement(By.xpath(subfoldermenuoption)).click(); 
        
        Thread.sleep(2800);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Subfolder_name_in_breadcrumb))); 
        d.findElement(By.xpath(Subfolder_name_in_breadcrumb)).click(); 
    
       }
   
   
   public void reclassify_check() throws InterruptedException, AWTException, IOException{
   
   
   
   String file_card = "(//div[@class='MuiBox-root css-kr2xbr'])[1]";
   String save_button = "//div[contains(text(),'Save')]"; 
   String Menu_list = "//div[@role='menu']";
   String Menu_items = "//div[@role='menu']//div[@role='menuitem']";
   String Submenu_items = "//div[@class='MuiFormGroup-root css-1h7anqn']//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1877ww2']";
   String myoption = "Reclassify";
   String Submenu = "//div[@class='MuiFormGroup-root css-1h7anqn']";
   String Submenuoptions = "//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-kswqkt']";
   String mysubmenuoption = "Capital Call";
   
   String SaveSuccesstoast ="//div[contains(text(),'File document types have been updated')]";
  
   String Reclassifyoption = "Reclassify";
   
   
   
       FileLib data = new FileLib();
       d.navigate().to(data.getPropertyData("myfolderPageURL"));
       
       
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
       
       Robot r = new Robot();
       
       r.mouseWheel(-16);
       
       System.out.println(d.findElement(By.xpath(allfiles_select_box)).isSelected());
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfiles_select_box))); 
       d.findElement(By.xpath(allfiles_select_box)).click(); 
       
       System.out.println(d.findElement(By.xpath(allfiles_select_box)).isSelected());
       
       Actions a = new Actions(d);
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(file_card)));
        a.moveToElement(d.findElement(By.xpath(file_card))).build().perform();
        
       a.contextClick(d.findElement(By.xpath(file_card))).build().perform();
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Menu_list)));
       
       List <WebElement> Filemenuoptions = d.findElements(By.xpath(Menu_items));
       
       
       for (WebElement Filemenuoption : Filemenuoptions ){

       if(Filemenuoption.getText().equalsIgnoreCase(myoption)){
       
       Filemenuoption.click();
     
       break;
       } }
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Submenu)));
       
       List <WebElement> submenuoptions = d.findElements(By.xpath(Submenu_items));
       
       for (WebElement submenuoption : submenuoptions ){
       
       System.out.println(submenuoption.getText());
       
     if(submenuoption.getText().equalsIgnoreCase(mysubmenuoption)){
       
       submenuoption.click();
       Thread.sleep(500);
       
       try{
           
       WebElement saveButton = d.findElement(By.xpath(save_button));
    
       saveButton.click();
       System.out.println("save button shown clicking save button");
              
       }
       
       catch(NoSuchElementException | TimeoutException e){
       
        
       submenuoption.click();
       WebElement saveButton = d.findElement(By.xpath(save_button));
       saveButton.click();
       
       
       }
       
       break;
       
       } }
   
       
      try{ 

       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SaveSuccesstoast))); 
      }
      
      catch(TimeoutException e){
      
          
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label['MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1877ww2'])[1]")));    
      d.findElement(By.xpath("(//label['MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1877ww2'])[1]")).click();
      WebElement saveButton = d.findElement(By.xpath(save_button));
      saveButton.click();
    
      }
      
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_messagecancel_button)));
       d.findElement(By.xpath(toast_messagecancel_button)).click();
       
       //r.mouseWheel(6);
       d.navigate().refresh();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
       a.moveToElement(d.findElement(By.xpath(allfilestext))).build().perform();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfiles_select_box))); 
       a.moveToElement(d.findElement(By.xpath(allfiles_select_box))).click().build().perform(); 
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedotbutton)));
       d.findElement(By.xpath(threedotbutton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menuListfromThreeDotButton)));
       List<WebElement> items = d.findElements(By.xpath(allitemsinmenu));
               
       for(WebElement item :items){
       
       System.out.println(item.getText());
       
       if(item.getText().equalsIgnoreCase(Reclassifyoption)){
       
       item.click();
       break;
       
       }}
      

        Thread.sleep(3500);
        
          d.navigate().refresh();

    
       
       }



public void add_to_nexus() throws InterruptedException, AWTException{



String file_card = "(//div[@class='MuiBox-root css-kr2xbr'])[1]";
String Menu_list = "//div[@role='menu']";
String Menu_items = "//div[@role='menu']//div[@role='menuitem']";
String nexusoption = "Add to Nexus";

String okbutton = "//button[contains(text(),'Ok')]";
String addSuccesstoast ="//div[contains(text(),'A Nexus data set is not setup for documents classi')]";







 WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       
 d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder");
 
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
       
       Robot r = new Robot();
       
       r.mouseWheel(-16);
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfiles_select_box))); 
       d.findElement(By.xpath(allfiles_select_box)).click(); 
       
       Actions a = new Actions(d);
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(file_card)));
        a.moveToElement(d.findElement(By.xpath(file_card)));
        
       a.contextClick(d.findElement(By.xpath(file_card))).build().perform();
       
       
      
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Menu_list)));
       
       List <WebElement> Filemenuoptions = d.findElements(By.xpath(Menu_items));
       
       
       for (WebElement Filemenuoption : Filemenuoptions ){
       
      // System.out.println(Filemenuoption.getText());
       
       
       if(Filemenuoption.getText().equalsIgnoreCase(nexusoption)){
       System.out.println(Filemenuoption.getText());
       Filemenuoption.click();
     
       break;
       }}
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(okbutton))); 
       d.findElement(By.xpath(okbutton)).click(); 
    //   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addSuccesstoast))); 
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_messagecancel_button)));
       d.findElement(By.xpath(toast_messagecancel_button)).click(); 

     Thread.sleep(3900);

d.navigate().refresh();

}

public void files_to_chat()throws InterruptedException, AWTException{


String file_card = "(//div[@class='MuiBox-root css-kr2xbr'])[1]";
String Menu_list = "//div[@role='menu']";
String Menu_items = "//div[@role='menu']//div[@role='menuitem']";
String chatoption = "Chat";
String newchat_banner = "(//*[contains(text(),'Chat')])[2]";

WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
       
       Robot r = new Robot();
       
       r.mouseWheel(-16);
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfiles_select_box))); 
       d.findElement(By.xpath(allfiles_select_box)).click(); 
       
       Actions a = new Actions(d);
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(file_card)));
        a.moveToElement(d.findElement(By.xpath(file_card)));
        
       a.contextClick(d.findElement(By.xpath(file_card))).build().perform();
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Menu_list)));
       
       List <WebElement> menuoptions = d.findElements(By.xpath(Menu_items));
       
       
       for (WebElement menuoption : menuoptions ){
       
       //System.out.println(menuoption.getText());
       
       
       if(menuoption.getText().equalsIgnoreCase(chatoption)){
       
       menuoption.click();
       
       break;
       }}
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchat_banner)));

}




public void file_to_QnA() throws AWTException, InterruptedException{

    
    
    
    String filecard = "(//div[@class='MuiBox-root css-kr2xbr'])[1]";
    String Menulist = "//div[@role='menu']";
    String Menuitems = "//div[@role='menu']//div[@role='menuitem']";
    String qaoption = "Q&A";
    String Qabannertext = "//*[text()='Advanced Options']";
    String searchbutton = "//div[text()='Search']";
    

        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(40));
        JavascriptExecutor js = (JavascriptExecutor)d;
        Actions a = new Actions(d);
        
        d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder");
        
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filecard)));
        a.moveToElement(d.findElement(By.xpath(filecard))).build().perform();
        
       a.contextClick(d.findElement(By.xpath(filecard))).build().perform();
       
        
         List <WebElement> menu_options = d.findElements(By.xpath(Menuitems));
       
       
       for (WebElement menu_option : menu_options ){
       
       //System.out.println(menu_option.getText());
       
     
       if(menu_option.getText().equalsIgnoreCase(qaoption)){
       
       menu_option.click();
      break;
       
       }  }
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Qabannertext)));

    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchbutton))); 
    a.moveToElement(d.findElement(By.xpath(searchbutton))).build().perform();
    
}



public void non_indexfilechecks() throws InterruptedException{

    String foldertext = "//h3[contains(text(),'Folders')]";

    String filecard = "//p[contains(text(),'APPLE_20230804_0000.pdf')]";
    String menulist = "//div[@role='menu']";
    String allmenuoptions = "//div[@class='ContextMenuItem']";
    String qnaerrormessage = "//div[contains(text(),'This file was not yet indexed for Q&A. Please wait')]";
    String scanoption = "Scan";
    String ScanErrormessage = "//div[contains(text(),'This file was not yet indexed for scan. Please wai')]";
    String qnaoption = "Q&A";
    String chatoption = "Chat";
    String toast = "//body/div[@id='root']/section[1]/ol[1]/li[1]";
    
    String File_option_menu_Localised = "//span[contains(text(),'Files')]";
    
    
    
    
    Actions a = new Actions(d);
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    JavascriptExecutor js = (JavascriptExecutor)d;

     d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AAPL/Sell%20Side%20Research");

     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
     
     
     js.executeScript("arguments[0].scrollIntoView(true);",d.findElement(By.xpath(filecard)));
     
     
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filecard)));
     a.contextClick(d.findElement(By.xpath(filecard))).build().perform();
     
     
     /*
     List <WebElement> optns = d.findElements(By.xpath(allmenuoptions));
     String[] alloptions = {"Chat" , "Q&A" , "Scan" };

     for( WebElement opt : optns){ 

         
         
         for(int i=0 ; i<3 ; i++){
         
         if(opt.getText().contains(alloptions[i])){
             
             
         opt.click();
         
         
         }
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_messagecancel_button)));
     d.findElement(By.xpath(toast_messagecancel_button)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filecard)));
     a.moveToElement(d.findElement(By.xpath(filecard))).build().perform();
     a.contextClick(d.findElement(By.xpath(filecard))).build().perform(); 
         }
         
  } */


       List <WebElement> optns = d.findElements(By.xpath(allmenuoptions));
      
       for(WebElement optn : optns){
         
         //System.out.println(optn.getText());
         
         if(optn.getText().equalsIgnoreCase(scanoption)){
         
         optn.click();
         
         break;
     }
  }
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ScanErrormessage)));
     System.out.println(d.findElement(By.xpath(toast)).getText());
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_messagecancel_button)));
     //d.findElement(By.xpath(File_option_menu_Localised)).click(); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filecard)));
     a.contextClick(d.findElement(By.xpath(filecard))).build().perform();
    
     List <WebElement> optn = d.findElements(By.xpath(allmenuoptions));
     
     
  for(WebElement optna : optn){
         
      //   System.out.println(optna.getText());
         
        if(optna.getText().equalsIgnoreCase(chatoption)){
         
         optna.click();
         
         break;
     } 
  }
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chaterrorMessageText)));
 System.out.println(d.findElement(By.xpath(toast)).getText());
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_messagecancel_button)));
 //d.findElement(By.xpath(File_option_menu_Localised)).click(); 
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filecard)));
 a.contextClick(d.findElement(By.xpath(filecard))).build().perform();
    
List <WebElement> opn = d.findElements(By.xpath(allmenuoptions)); 
  
 
  
  for(WebElement optnb : opn){
         
         System.out.println(optnb.getText());
         
         if(optnb.getText().equalsIgnoreCase(qnaoption)){
         
         optnb.click();
         
         break;
     }
  }
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qnaerrormessage)));
  System.out.println(d.findElement(By.xpath(toast)).getText());
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toast_messagecancel_button)));


 
 //d.switchTo().alert().dismiss();
 }
 


public void file_datetime_infocheck() throws AWTException, InterruptedException{

    
    
    String infobutton = "(//div[@class='MuiBox-root css-1qq0lyx']//button)[1]";
    String createdsection = "(//div[@class='MuiBox-root css-1wdu9wv']//p)[11]";
    String Lastloadtimesection = "(//div[@class='MuiBox-root css-1wdu9wv']//p)[9]";

    
    
   
    
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));

        Actions a = new Actions(d);
        
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder");
        
  
        
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(infobutton)));
         a.moveToElement(d.findElement(By.xpath(infobutton))).build().perform();
         a.moveToElement(d.findElement(By.xpath(infobutton))).click().build().perform();
         
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createdsection)));
         System.out.println(d.findElement(By.xpath(createdsection)).getText()); 
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Lastloadtimesection)));
         System.out.println(d.findElement(By.xpath(Lastloadtimesection)).getText());


}

public void videofile_loader_check() throws InterruptedException{

    
        String videofilepageURL = "https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder/For%20Uploads/for%20uploading";
       
        String videoFileCard = "//div[@class='MuiBox-root css-xi606m']//p[@aria-label='What If We Become a Type 1 Civilization_.mp4']";
        String videopopup = "//div[@data-testid='video-player']";
        String Videoplaybutton = "//button[@title='Play Video']";
        
        JavascriptExecutor js = (JavascriptExecutor)d;
        Actions a = new Actions(d);
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        TakesScreenshot shot = (TakesScreenshot)d;
        
        
        
         d.navigate().to(videofilepageURL);
         
         
         
         
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(videoFileCard)));
         a.moveToElement(d.findElement(By.xpath(videoFileCard))).build().perform();
         a.moveToElement(d.findElement(By.xpath(videoFileCard))).click().build().perform();
         shot.getScreenshotAs(OutputType.FILE);
         
         Thread.sleep(4000);
   /*             
         WebElement videoElement = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(videopopup)));
         
         
         
         Set<String> popupwindow = d.getWindowHandles();
         
         
         for(String handle : popupwindow ){
         
         if (!handle.equals(videopopup)) {
                    d.switchTo().window(handle);
                    break;
                }
            }
         
         
         
         js.executeScript("arguments[0].pause()", videoElement); */
         
         }
  


public void doubelcross_buttoncheck() throws AWTException, InterruptedException{
   
    
       
       String pyFileCard = "p[aria-label='sample1.py']";
       String Folder_to_choose = "//p[contains(text(),'AYn Demo Folder')]";
       String crossbutton = "//div[@class='MuiStack-root css-5vauxo']//button";
       String crossbuttontwo = "(//*[@class='MuiBox-root css-1o4wo1x'])[3]";
       String odtfilecard = "p[aria-label='file-sample_500kB.odt']";
       

        JavascriptExecutor js = (JavascriptExecutor)d;
        Actions a = new Actions(d);
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));

        

        d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder");

         
      
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
      
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pyFileCard))); 
        d.findElement(By.cssSelector(pyFileCard)).click();

        Thread.sleep(2800);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(crossbutton))); 
        d.findElement(By.xpath(crossbutton)).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(crossbuttontwo))); 
        d.findElement(By.xpath(crossbuttontwo)).click();
        
        
        
        js.executeScript("window.scrollTo(0, 0);");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(odtfilecard))); 
        d.findElement(By.cssSelector(odtfilecard)).click();
        
        Thread.sleep(3500);

        
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(crossbutton))); 
        d.findElement(By.xpath(crossbutton)).click();
        /*
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(crossbuttontwo))); 
        d.findElement(By.xpath(crossbuttontwo)).click(); */
        d.navigate().refresh();
        

}
      public void reindexingcheck() throws InterruptedException{
      
     String FoldersText = "//*[text()='Folders']";
     String file_card = "//p[text()='Fully Executed Side Letter - First Energ...']";
     
     String menulist = "//div[@role='menu']//div[@role='menuitem']";
     String allmenuoptions = "(//div[@role='menuitem'])"; 
     String reindex= "Re-Index";


      Actions a = new Actions(d);
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
      JavascriptExecutor js = (JavascriptExecutor)d;
      
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management");
        
       
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FoldersText))); 
      js.executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.xpath(file_card)));
    /* w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfiles_select_box))); 
      d.findElement(By.xpath(allfiles_select_box)).click(); */
    
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(file_card)));
      a.moveToElement(d.findElement(By.xpath(file_card)));
        
       a.contextClick(d.findElement(By.xpath(file_card))).build().perform();
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allmenuoptions)));
       
       List <WebElement> menuoptions = d.findElements(By.xpath(allmenuoptions));
       
       
       for (WebElement menuoption : menuoptions ){
       
       //System.out.println(menuoption.getText());
       
       
       if(menuoption.getText().equalsIgnoreCase(reindex)){
       
       menuoption.click();
       
       break;
       
       }}
      
       Thread.sleep(3600);
      
      
      }

      public void content_viewer_pagecheck() throws InterruptedException{
      
      
      String pageUrl = "https://app-dev.blueflame.ai/dashboard/file-management/details/b6379b53-6890-4826-b9b3-45e0aeda32c0";
      String downloadfilebutton = "button[aria-label='Download file']";
      String filevisibilty = "//iframe[@id='webviewer-1']";
      
      Actions a = new Actions(d);
      
      d.navigate().to(pageUrl);
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(65));
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filevisibilty))); 
      w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(downloadfilebutton))); 
      d.findElement(By.cssSelector(downloadfilebutton)).click();
      
      Thread.sleep(3500);
      }

    
      public void runblueprint_check() throws InterruptedException{
      
     
     String file_card = "(//div[@class='MuiBox-root css-kr2xbr'])[1]";
     String runBlueprintsubMenu = "(//*[contains(text(),'Blueprints')])[2]";
     String menulist = "//div[@role='menu']";
     String allmenuoptions = "//div[@role='menuitem']"; 
     String runBluePrint= "Run Blueprint";
     String runBlueprintsubMenu_optns = "//div[@class='MuiStack-root css-uxlw8']//li";
     String playButton = "button[aria-label='Run Multipline /n/ Blueprint']";
     String inputPopupbox = "//body/div[4]/div[3]/div[1]";
     String cancelButton = "//body/div[4]/div[3]/div[1]/div[2]/button[1]";
     
     
     
      Actions a = new Actions(d);
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100)); 
      
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder");
      
      
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext))); 

      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(file_card)));
      a.moveToElement(d.findElement(By.xpath(file_card)));
        
       a.contextClick(d.findElement(By.xpath(file_card))).build().perform();
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allmenuoptions)));
       
       List <WebElement> menoptions = d.findElements(By.xpath(allmenuoptions));
       
       
       for (WebElement menoption : menoptions ){

       if(menoption.getText().equalsIgnoreCase(runBluePrint)){
       
       System.out.println(menoption.getText());    
           
       menoption.click();
       
       }}
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(runBlueprintsubMenu)));
       
       List <WebElement> submenoptns = d.findElements(By.xpath(runBlueprintsubMenu_optns));
       
       for(WebElement suboptn : submenoptns ){
       
       System.out.println(suboptn.getText());    
  }
     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(playButton)));  
     d.findElement(By.cssSelector(playButton)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputPopupbox)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cancelButton))); 
     d.findElement(By.xpath(cancelButton)).click();
     
     Thread.sleep(2200);
}
      
      
      
      
      public void filemultideleteCheck() throws InterruptedException{
      
          
    

    String filecard = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div[1]/button[1]/div[2]";
    String menulist = "//div[@role='menu']";
    String allmenuoptions = "//div[@class='ContextMenuItem']";
     
    String deleteOption = "Delete";
    String yesConfirmmessage = "//p[contains(text(),'Yes')]";
    
      
      
    Actions a = new Actions(d);
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    JavascriptExecutor js = (JavascriptExecutor)d;

     d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder/Multi%20upload");
      
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfilestext)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allfiles_select_box)));
     d.findElement(By.xpath(allfiles_select_box)).click();
     
     a.contextClick(d.findElement(By.xpath(filecard))).build().perform();      
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menulist))); 
     
     List <WebElement> options = d.findElements(By.xpath(allmenuoptions));
     
     
     for(WebElement optnss : options ){
     
     System.out.println(optnss.getText());
    
     if(optnss.getText().equalsIgnoreCase(deleteOption)){
     
         optnss.click();
         break;
     
     }
     
     }
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(yesConfirmmessage)));
     d.findElement(By.xpath(yesConfirmmessage)).click();
     
     Thread.sleep(2990);
            
   
      }
 
      public void multifileupload(){
      
           Actions a = new Actions(d);
           WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
           JavascriptExecutor js = (JavascriptExecutor)d;
           String uploadOption = "(//span[@class='MuiTypography-root MuiTypography-caption css-dukeyb'])[2]";
           String HiddenFile_uploadElement = "(//input[@type='file'])[2]";
           String filePath = "C:\\Users\\webskitters\\Desktop\\Demo\\Demo Text.txt";
           
       
     try{      
       d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management?path=AYn%20Demo%20Folder/Multi%20upload");
          
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedotbutton)));
       d.findElement(By.xpath(threedotbutton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menuListfromThreeDotButton)));
       

    WebElement uploadElement = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(HiddenFile_uploadElement))); 
    js.executeScript("arguments[0].style.display='block';", uploadElement); 
       
      //uploadElement.sendKeys(filePath);
      d.findElement(By.xpath(HiddenFile_uploadElement)).click();
       
    d.findElement(By.xpath(uploadOption)).sendKeys(filePath);
      
     
//       d.findElement(By.xpath(HiddenFile_uploadElement)).click();
      
     } catch(ElementNotInteractableException e){
         
         System.out.println("ElementNotInteractableException found");
         d.navigate().refresh();
     }
     catch (InvalidArgumentException e){
         System.out.println("InvalidArgumentException found");
         d.navigate().refresh();
         
     }
     }
      
     public void folder_create(){
      
       
         d.navigate().to("https://app-dev.blueflame.ai/dashboard/file-management");
         Actions a = new Actions(d);
         WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
         JavascriptExecutor js = (JavascriptExecutor)d;
         
         
         String New_FolderOption = "//span[text()='New Folder']";
         String FolderCreate_PopInputBox = "//input[@placeholder='Enter Folder Name']";
         String CreateButton = "//button[text()='Create']";
         String Folder_Created_Confirmation = "//h5[text()='Please add files or folder to view.']";
      
      
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(threedotbutton)));
       d.findElement(By.xpath(threedotbutton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menuListfromThreeDotButton)));
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(New_FolderOption)));
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FolderCreate_PopInputBox))); 
       d.findElement(By.xpath(FolderCreate_PopInputBox)).sendKeys("demo");
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CreateButton))); 
       d.findElement(By.xpath(CreateButton)).click();
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Folder_Created_Confirmation)));
        }
  }
      




  
    

