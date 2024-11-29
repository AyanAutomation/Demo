
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import static org.openqa.selenium.Keys.ENTER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.FileAssert;
import org.testng.annotations.BeforeMethod;

public class Type {
    
    WebDriver d;
    
    public Type(WebDriver d){
 
        this.d = d;
        
        }
    
        String Editor_Box = "//p[@data-placeholder = 'Ask me a question' ]";
        String Send ="//*[@class='MuiStack-root css-kmv9ap']//*[@type='button']";
        String prompt_option ="//p[contains(text(),'@Pitchbook Show me a profile on {company}')]";
        String parameterbox = "//textarea[@aria-invalid='false']";
        String newchatbutton = "(//div[@class='MuiStack-root css-esnk64']//button[@type='button'])[1]";
        String promptcrossbot = "//div[@class='MuiBox-root css-b8tfif']";
        String Aimodeltab = "//button[@aria-label='BlueFlame AI Agent']";
        String defaultModel = "//*[@aria-label='You can change your default in the settings']";
        String Export_button = "//div[@class='MuiStack-root css-7iwxlc']//button[@type='button']";
        
        
        
        
        
        
        
        
        
        
    
   void SendMessage() throws InterruptedException{
    
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
       
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        
        d.findElement(By.xpath(Editor_Box)).sendKeys("PitchBook");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox))); 
        d.findElement(By.xpath(parameterbox)).sendKeys("LMT");
        d.findElement(By.xpath(Send)).click();
        
        Thread.sleep(1000); 
    d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
        
    }
   
   
   
   void typeafter_apptag() throws InterruptedException{
   

        String appbutton ="//*[@aria-label='Apps']";
        String prompt_option ="//p[contains(text(),'SalesForce')]";
        
        String Textbox = "//div[@contenteditable='true']";
        
        
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
     
     
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
        d.findElement(By.xpath(newchatbutton)).click();
     
             
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        d.findElement(By.xpath(Editor_Box)).click();
        
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(appbutton))); 
        d.findElement(By.xpath(appbutton)).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
        Thread.sleep(3600);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Textbox))); 
        d.findElement(By.xpath(Textbox)).sendKeys("Show me my open tasks ");
        
   
        Thread.sleep(3600);
        d.navigate().refresh();
   
   
   }
   
   void Parameterbox_enter_send_check() throws InterruptedException{
   
        
      
        String prompt_option ="//p[contains(text(),'@Pitchbook Show me a profile on {company}')]";
        String parameterbox = "//textarea[@aria-invalid='false']";
        

        
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        Actions a = new Actions(d);
     
        
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
        d.findElement(By.xpath(newchatbutton)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        a.moveToElement(d.findElement(By.xpath(Editor_Box))).build().perform(); 
        d.findElement(By.xpath(Editor_Box)).click();
        d.findElement(By.xpath(Editor_Box)).sendKeys("PitchBook");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox))); 
        d.findElement(By.xpath(parameterbox)).sendKeys("LMT");
        //Thread.sleep(1000); 
        d.findElement(By.xpath(parameterbox)).sendKeys(Keys.ENTER);
       // w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button))); 
       Thread.sleep(4000);
      
   
   }
   
   
   public void empty_parameterbox_double_enter_send_check() throws InterruptedException{
   
   
        

        String prompt_option ="//p[contains(text(),'@Pitchbook Show me a profile on {company}')]";
        String parameterbox = "//textarea[@aria-invalid='false']";
        
        
        String outsideparameterbox = "//*[@id=\"chat_write_area\"]/div/div[2]/div[3]/div/div/div[3]/div/p/span[2]/span/span[2]";
        
        
        
        
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        Actions a = new Actions(d);
        delete del = new delete(d);
     
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
        d.findElement(By.xpath(newchatbutton)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        
        d.findElement(By.xpath(Editor_Box)).sendKeys("PitchBook Show me a profile");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button)));         
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox)));
        
      
           d.findElement(By.xpath(parameterbox)).sendKeys(Keys.ENTER);
           d.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys(Keys.ENTER);
           
      
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button)));
   
        del.Delete_from_top();
        
        
        
        
   }
    
   
   
   public void control_A_delete_check() throws InterruptedException, IOException{
   
       

        
        String prompt_option ="//p[contains(text(),'@SFDC Show contacts at {account}')]";
        String parameterbox = "//textarea[@aria-invalid='false']";
        
   
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
      Actions a = new Actions(d);
      Screenshot_Class shts = new Screenshot_Class(d);
        
        
        
        
        
     
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
        d.findElement(By.xpath(newchatbutton)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        
        d.findElement(By.xpath(Editor_Box)).sendKeys("sfdc Show contacts at");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
        
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox))); 
        d.findElement(By.xpath(parameterbox)).click();
        
        a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
        
       try{ 
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box)));
       }
       
       catch(Exception e ){
         
       d.findElement(By.xpath(parameterbox)).click();
        
      a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
       
     }
     shts.ControlAScreenshot();
      
   d.navigate().refresh();
   
   }
   
   
   public void parameterbox_delete_reenter_curlybrace_issuecheck() throws InterruptedException{
      

        String prompt_option ="//p[contains(text(),'@SFDC Find contacts located in {location}')]";
        String parameterbox = "//textarea[@aria-invalid='false']";
        
        String locationparameterinprompt = "//p[text()='location']";
        
        
        
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        Actions a = new Actions(d);
      
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newchatbutton))); 
        d.findElement(By.xpath(newchatbutton)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        
        d.findElement(By.xpath(Editor_Box)).sendKeys("salesforce");
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
        d.findElement(By.xpath(prompt_option)).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox)));
        
      
          d.findElement(By.xpath(parameterbox)).sendKeys(Keys.BACK_SPACE);
          Thread.sleep(3600);
          w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locationparameterinprompt))); 
        d.findElement(By.xpath(locationparameterinprompt)).click();
   
      
   
    Thread.sleep(3600);
   
   d.navigate().refresh();
   
   
   
   
   }
   
   
  
   
   public void titletextpastecheck() throws AWTException, InterruptedException{
   
   String title = "//p[contains(text(),'SALESFORCE')]";
   String configurationoptioninmenu = "//p[contains(text(),'Configuration')]";
   String menu_option = "//ul[@class='MuiList-root MuiList-padding css-1lgx6ry']";

   String Chat_option = "//span[contains(text(),'Chat')]";
   
   
 
   
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    Robot r = new Robot();
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menu_option)));
    a.moveToElement(d.findElement(By.xpath(menu_option))).build().perform();
    
    r.mouseWheel(-200);
   
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(configurationoptioninmenu))); 
       d.findElement(By.xpath(configurationoptioninmenu)).click(); 
       Thread.sleep(1200);
       
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title))); 
      System.out.println(d.findElement(By.xpath(title)).getText());
      String text = d.findElement(By.xpath(title)).getText();
      
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
      d.findElement(By.xpath(Editor_Box)).sendKeys(text);
      
      Thread.sleep(1900);
      
    d.navigate().refresh();
       
       
       
        }
   
   
   public void  Markdowncheck() throws AWTException, InterruptedException{
   
   
  
   String chatboxwithcontent = "//div[@contenteditable='true']";
   
   
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    Robot r = new Robot();
   
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
   d.findElement(By.xpath(Editor_Box)).sendKeys("#");
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatboxwithcontent))); 
   d.findElement(By.xpath(chatboxwithcontent)).click();
   a.keyDown(Keys.SHIFT).sendKeys(ENTER).build().perform();
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatboxwithcontent))); 
   d.findElement(By.xpath(chatboxwithcontent)).click();
   d.findElement(By.xpath(chatboxwithcontent)).sendKeys("#");
   Thread.sleep(1900);
   d.navigate().refresh(); }
   
   
    public void bullet_point_pastecheck() throws InterruptedException, AWTException{
   
       
       
       String chatboxwithcontent = "//div[@contenteditable='true']";
       String copybutton = "//*[@id=\"f541d944-8953-461e-ad1a-3368f65e16a7_panel\"]/div/div/div/div/div[4]/div[1]/div/div/button[1]";
       
       
       String Copysuccessmessage = "//div[contains(text(),'Message Copied Successfully! The content has been ')]";
       String successmessagecrossbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
       
       String capiqchat = "//div[@class = 'MuiBox-root css-1myck0y']//p[@aria-label='CAP IQ Logo Message']";
       String Messagetext = "//button[@title='Rostec Corporation']";
       
   
       
    
       
        WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
        Actions a = new Actions(d);
        Robot r = new Robot();
        
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(capiqchat)));
        d.findElement(By.xpath(capiqchat)).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(copybutton))); 
        d.findElement(By.xpath(copybutton)).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        d.findElement(By.xpath(Editor_Box)).click();
        //a.contextClick(d.findElement(By.xpath(Editor_Box))).build().perform();
        a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatboxwithcontent)));
        a.moveToElement(d.findElement(By.xpath(chatboxwithcontent))).build().perform();
        
         
        Thread.sleep(1400);
       
        
        
        

   }
   
    public void app_afterpromptfavouritesuggestion() throws InterruptedException{
    
    

    String PlusButton = "//div[@class='MuiBox-root css-rm2j0s']//button[@type='button']";
    String App_option = "//button[text()='Use Apps']";
    String FMPappoption_in_list = "//p[contains(text(),'FMP')]";
    String promptoption = "//p[contains(text(),'@O365 Summarize my emails from the past 12 hours a')]";
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    
    
    
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
    d.findElement(By.xpath(Editor_Box)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptoption))); 
    d.findElement(By.xpath(promptoption)).click();
    Thread.sleep(1200);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PlusButton))); 
    d.findElement(By.xpath(PlusButton)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(App_option))); 
    d.findElement(By.xpath(App_option)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FMPappoption_in_list))); 
    d.findElement(By.xpath(FMPappoption_in_list)).click();
    
    Thread.sleep(2200);
    d.navigate().refresh();
    
    }
    
    
    
    public void part_text_option_deletecheck() throws InterruptedException{
    
    

    String promptoption = "//p[contains(text(),'@O365 Summarize my emails from the past 12 hours a')]";
    String chatboxwithcontent = "//div[@contenteditable='true']";
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
    d.findElement(By.xpath(Editor_Box)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptoption))); 
    d.findElement(By.xpath(promptoption)).click();
    Thread.sleep(1200);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatboxwithcontent))); 
    
    
    for(int i=0 ; i<=60 ; i++){
    
        d.findElement(By.xpath(chatboxwithcontent)).sendKeys(Keys.BACK_SPACE);
         Thread.sleep(10);
    }

    Thread.sleep(3200);
    d.findElement(By.xpath(chatboxwithcontent)).sendKeys(Keys.TAB);
   
    d.navigate().refresh();
 
    }
    
    public void tabselectcheck() throws InterruptedException{
    
    String Editor_Box = "//p[@data-placeholder = 'Ask me a question' ]";
    String chatboxwithcontent = "//div[@contenteditable='true']";
    String appoptioninprompt = "//p[contains(text(),'SalesForce')]";
    String salesforcesubmenupromptoption = "//p[contains(text(),'@SFDC Show me aggregated pipeline by stage for thi')]";
    String apptaginbox = "//span[@class='app-highlight']";
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(100));
    Actions a = new Actions(d);
    
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
    d.findElement(By.xpath(Editor_Box)).sendKeys("sfdc");
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(appoptioninprompt)));
    for (int i=0 ; i<=10 ; i++){
    d.findElement(By.xpath(chatboxwithcontent)).sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(800);
    }
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(salesforcesubmenupromptoption)));
    
    d.findElement(By.xpath(chatboxwithcontent)).sendKeys(Keys.TAB);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(apptaginbox)));
    
    
    Thread.sleep(3500);
    
    d.navigate().refresh();
    }
    
    
    public void copied_textfrom_chat_pasted_inside_parameterbox() throws InterruptedException, AWTException{
    
    
    String prompt_option ="//p[contains(text(),'@Pitchbook Show me a profile on {company}')]";
    String parameterbox = "//textarea[@aria-invalid='false']"; 
    String bottomMessage_copyButton = "//ul[@node='[object Object]']//strong[contains(text(),'Ownership Status:')]";
    String copybutton= "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[2]";
    String Copysuccessmessage = "//div[contains(text(),'Message Copied Successfully! The content has been ')]";
    String successmessagecrossbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
    String parameterchat = "//div[@class = 'text_box MuiBox-root css-0']//p[@aria-label='Parameter paste chat check']";
    
    String messageList = "//div[@class = 'pinned_list MuiBox-root css-0']";
    
    
    
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(35));
    Actions a = new Actions(d);
    JavascriptExecutor js = (JavascriptExecutor)d;
    Robot r = new Robot();
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageList))); 
    a.moveToElement(d.findElement(By.xpath(messageList))).build().perform();
    js.executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.xpath(parameterchat)));
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterchat))); 
    d.findElement(By.xpath(parameterchat)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
    d.findElement(By.xpath(Editor_Box)).sendKeys("PitchBook Show me a profile on");
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
    d.findElement(By.xpath(prompt_option)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox)));
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptcrossbot)));
    d.findElement(By.xpath(promptcrossbot)).click(); 
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bottomMessage_copyButton)));
    
    Thread.sleep(1000);
  /*  
  Explanation:
  scrollIntoView(true): The JavaScript command scrollIntoView(true) will scroll the page such that the element 
                        appears at the top of the viewport (i.e., the element is aligned with the top of the page).
     Focus on Element: The arguments[0] in the JavaScript refers to the element that is passed as a parameter.
    */
    
    js.executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.xpath(copybutton)));
 
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(copybutton))); 
    d.findElement(By.xpath(copybutton)).click();
    /*w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Copysuccessmessage))); 
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successmessagecrossbutton))); 
    d.findElement(By.xpath(successmessagecrossbutton)).click();*/
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox)));
    d.findElement(By.xpath(parameterbox)).click();
    a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
     
    Thread.sleep(3200);
    d.navigate().refresh();
    
    
    
    
    }
    
   public void multienter_inparameter_notitlechat_creationcheck(){
   

    String prompt_option ="//p[contains(text(),'@Pitchbook Show me a profile on {company}')]";
    String parameterbox = "//textarea[@aria-invalid='false']"; 
  
    
    WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
    Actions a = new Actions(d);
    
    d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
    d.findElement(By.xpath(Editor_Box)).sendKeys("PitchBook");
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
    d.findElement(By.xpath(prompt_option)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox)));
    d.findElement(By.xpath(parameterbox)).sendKeys("demo");
    
    for(int i=0 ; i<=8 ;i++){
    

    d.findElement(By.xpath(parameterbox)).sendKeys(Keys.ENTER);
    
    }

    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Export_button)));
    
    d.navigate().refresh();
   }
   
   
   public void prompt_multi_click() throws InterruptedException{
   
       String chatboxwithcontent = "//div[@contenteditable='true']";
       
       String prompt_option_to_select= "//p[contains(text(),'@O365 Summarize my emails from the past 12 hours a')]";
       
       
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
       Actions a = new Actions(d);
       
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chatboxwithcontent))); 
        d.findElement(By.xpath(chatboxwithcontent)).clear();
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box)));
        d.findElement(By.xpath(Editor_Box)).sendKeys("@O365 Summarize my emails from the past 12 hours and identify action items ");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option_to_select)));
        
        for(int i =0 ; i <= 8 ; i++){
        
       // a.moveToElement(d.findElement(By.xpath(prompt_option_to_select))).build().perform();
       // d.findElement(By.xpath(prompt_option_to_select)).click();
        d.findElement(By.xpath(chatboxwithcontent)).sendKeys(Keys.TAB);
        Thread.sleep(1500);
        
        
        }
      d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
       
   }

   
   public void multi_images_pastecheck() throws AWTException, InterruptedException{
   
   
   String image_chat = "//div[@class = 'MuiBox-root css-1myck0y']//p[@aria-label='Images Copy Paste check']";
   
   String messageBottom_ButtonSection = "//p[contains(text(),'Model changed to BlueFlame AI Agent')]";
   String copybutton= "(//div[@class='MuiButtonGroup-root MuiButtonGroup-outlined css-13iz54z']//button[@type='button'])[1]";
   String Copysuccessmessage = "//div[contains(text(),'Message Copied Successfully! The content has been ')]";
   String successmessagecrossbutton = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
   
   String Imagesabovechatbox = "(//*[@class='MuiBox-root css-1j4fru5'])[1]";
   String chatboxwithcontent = "//div[@contenteditable='true']";
   String Prompt_firstoption = "//p[contains(text(),'Prepare me for my next meeting')]";
  
   String imageremovebutton = "(//*[@class='MuiBox-root css-1j4fru5']//button[@type='button'])[1]";
   
   
   String DefaultModelStatus = "BlueFlame AI Agent\n" +
"Default";
   String SeeMore_button = "//button[text()='See More']";
   String BlueFlameOption = "//p[text()='BlueFlame AI Agent']";
   String insidechat =  "(//div[@class='MuiButtonGroup-root MuiButtonGroup-outlined css-13iz54z'])[2]";
   
   
   
   
   
       WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(30));
       Actions a = new Actions(d);
       JavascriptExecutor js = (JavascriptExecutor)d;
       Blueflamemodel_defaultmodel_switch Switch = new Blueflamemodel_defaultmodel_switch(d);
       
       
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(image_chat))); 
    d.findElement(By.xpath(image_chat)).click();
    
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Aimodeltab))); 
    d.findElement(By.xpath(Aimodeltab)).click();
    
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(defaultModel))); 
  
    String defaultmodel = d.findElement(By.xpath(defaultModel)).getText();
    
    System.out.println(defaultmodel);
    
    if(DefaultModelStatus.equals(defaultmodel)){
    
    d.navigate().refresh();
    
      }
    
    else{
    
    d.findElement(By.xpath(defaultModel)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SeeMore_button)));
    d.findElement(By.xpath(SeeMore_button)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BlueFlameOption)));
    d.findElement(By.xpath(BlueFlameOption)).click();
   
    }

     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(insidechat)));
     a.moveToElement(d.findElement(By.xpath(insidechat))).build().perform(); 
     js.executeScript("arguments[0].scrollIntoView(true)", d.findElement(By.xpath(copybutton))); 
     Thread.sleep(1500);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(copybutton))); 
    d.findElement(By.xpath(copybutton)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Copysuccessmessage))); 
   
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successmessagecrossbutton))); 
    d.findElement(By.xpath(successmessagecrossbutton)).click();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(copybutton)));
    

        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
        d.findElement(By.xpath(Editor_Box)).click();
        a.moveToElement(d.findElement(By.xpath(Editor_Box))).click().build().perform();

   //  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prompt_firstoption)));
   
   a.moveToElement(d.findElement(By.xpath(Editor_Box))).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
   Thread.sleep(3400);
   
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promptcrossbot)));
    d.findElement(By.xpath(promptcrossbot)).click(); 
    
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Imagesabovechatbox)));
     
     a.moveToElement(d.findElement(By.xpath(Imagesabovechatbox))).build().perform();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imageremovebutton)));
     
     for(int i=0 ; i<=4 ; i++){
         
    a.moveToElement(d.findElement(By.xpath(Imagesabovechatbox))).build().perform();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imageremovebutton)));
      d.findElement(By.xpath(imageremovebutton)).click();
    
      Thread.sleep(500);
     } 
     
     
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
     
     Switch.switchingTodefaultAimodel();
     
   }
   
public void multiple_qa_answerinchat_showsource_check() throws AWTException, InterruptedException{



   String Autocomplete_box = "//input[@aria-autocomplete = 'list']";
   String Autocomplete_list = "//ul[@role='listbox']";
   String qna_option_in_prompt = "//p[contains(text(),'/qna {location}')]";
   String Message_send_confirmation = "//div[@class='MuiStack-root right_btm right_btm_left css-1ialerq']";
   String Message_send_surity = "//p[contains(text(),'location: AYn Demo Folder/Viability_of_a_Dys')]";
   String option_to_be_choosen_one = " //li[contains(text(),'PRF/BlueFlame Test Cases/Front-End Pipeline Management/Mandrake Capital Real Estate Fund II_February 2024.pdf')]";
   String option_to_be_choosen_two = "//li[contains(text(),'AYn Demo Folder/Economics/Shadow Oil Fleet Funding War Laid Bare - Newsweek.pdf')]";
   String option_to_be_choosen_three = "//li[contains(text(),'AYn Demo Folder/Viability_of_a_Dyson_Swarm_as_a_Form_of_Dyson_Sphe.pdf')]";  

   
   
   String optionisselected = "//*[@id=\"chat_write_area\"]/div/div[2]/div[3]/div/div/div[3]/div/p/span/span/div/div/div[2]/div/div/div/span/div/p";
   String Lastbutton_showsource = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]";    
   String Second_last_button_showsource = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]";
   String third_last_button_showsource = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]";
   String inside_firstchatmessage = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]";
   
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(80));
      Actions a = new Actions(d);
      Robot r = new Robot();
    
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("/qna");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qna_option_in_prompt))); 
     d.findElement(By.xpath(qna_option_in_prompt)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_box))); 
     d.findElement(By.xpath(Autocomplete_box)).sendKeys("mandrake");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_list))); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(option_to_be_choosen_one))); 
     d.findElement(By.xpath(option_to_be_choosen_one)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send))); 
     d.findElement(By.xpath(Send)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Message_send_confirmation)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("show me contents");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send))); 
     d.findElement(By.xpath(Send)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(third_last_button_showsource))); 
    d.findElement(By.xpath(third_last_button_showsource)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("/qna");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qna_option_in_prompt))); 
     d.findElement(By.xpath(qna_option_in_prompt)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_box))); 
     d.findElement(By.xpath(Autocomplete_box)).sendKeys("shadow");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_list))); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(option_to_be_choosen_two))); 
     d.findElement(By.xpath(option_to_be_choosen_two)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send))); 
     d.findElement(By.xpath(Send)).click();
     Thread.sleep(1500);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Message_send_confirmation)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("show me contents");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send))); 
     d.findElement(By.xpath(Send)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Second_last_button_showsource))); 
     d.findElement(By.xpath(Second_last_button_showsource)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("Search internal files and folders via QNA mode");
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(qna_option_in_prompt))); 
     d.findElement(By.xpath(qna_option_in_prompt)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_box))); 
     d.findElement(By.xpath(Autocomplete_box)).sendKeys("Dyson swarm");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Autocomplete_list))); 
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(option_to_be_choosen_three))); 
     d.findElement(By.xpath(option_to_be_choosen_three)).click();
     Thread.sleep(2800);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send))); 
     d.findElement(By.xpath(Send)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Message_send_surity)));
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("show me contents");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Send))); 
     d.findElement(By.xpath(Send)).click();
    Thread.sleep(2800);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Lastbutton_showsource))); 
    d.findElement(By.xpath(Lastbutton_showsource)).click();
    Thread.sleep(2800);

   Thread.sleep(3800);
     
     }
   
     
public void parameterPlacereplaceCheck() throws AWTException, InterruptedException{


     
    
    String Send = "//i[@class='ico1']";
    String prompt_option ="//p[contains(text(),'@SFDC Add note to the contact {name} that: {notes}')]";
    String parameterbox = "//textarea[@aria-invalid='false']";
    
    String nameparameterinprompt = "//p[text()='name']";
    String notes_parameter_inPrompt = "//p[contains(text(),'notes')]";
    
      WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(80));
      Actions a = new Actions(d);
      Robot r = new Robot();
    
     d.navigate().to("https://app-dev.blueflame.ai/dashboard/chat");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Editor_Box))); 
     d.findElement(By.xpath(Editor_Box)).sendKeys("@SFDC Add note to the contact ");
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prompt_option))); 
     d.findElement(By.xpath(prompt_option)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parameterbox)));
     d.findElement(By.xpath(parameterbox)).sendKeys(Keys.BACK_SPACE);
     Thread.sleep(2000);
     d.findElement(By.xpath(parameterbox)).sendKeys(Keys.TAB);
     Thread.sleep(2000);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameparameterinprompt))); 
     d.findElement(By.xpath(nameparameterinprompt)).click();
     Thread.sleep(2000);
     d.findElement(By.xpath(parameterbox)).sendKeys(Keys.BACK_SPACE);
     Thread.sleep(2000);
     d.findElement(By.xpath(parameterbox)).sendKeys(Keys.TAB);
     Thread.sleep(2000);
     d.findElement(By.xpath(parameterbox)).sendKeys(Keys.BACK_SPACE);
     Thread.sleep(2000);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameparameterinprompt))); 
     d.findElement(By.xpath(nameparameterinprompt)).click();
     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(notes_parameter_inPrompt))); 
     d.findElement(By.xpath(notes_parameter_inPrompt)).click();
     Thread.sleep(2000);
     d.navigate().refresh();
}

 }
     




   
   
   
   
