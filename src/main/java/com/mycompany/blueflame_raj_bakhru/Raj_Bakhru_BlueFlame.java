package com.mycompany.blueflame_raj_bakhru;


import com.mycompany.blueflame_raj_bakhru.AI_model;
import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.mycompany.blueflame_raj_bakhru.Autocomplete_functions;
import com.mycompany.blueflame_raj_bakhru.Chat_file_export;
import com.mycompany.blueflame_raj_bakhru.File_section_Checks;
import com.mycompany.blueflame_raj_bakhru.Login;
import com.mycompany.blueflame_raj_bakhru.Mathnotation;
import com.mycompany.blueflame_raj_bakhru.Multiparameter;
import com.mycompany.blueflame_raj_bakhru.RSSfeedtest;
import com.mycompany.blueflame_raj_bakhru.Selectfiles;
import com.mycompany.blueflame_raj_bakhru.Template;
import com.mycompany.blueflame_raj_bakhru.Tilereplace;
import com.mycompany.blueflame_raj_bakhru.Type;
import com.mycompany.blueflame_raj_bakhru.apptag;
import com.mycompany.blueflame_raj_bakhru.chat_like_dislike;
import com.mycompany.blueflame_raj_bakhru.chatlogo;
import com.mycompany.blueflame_raj_bakhru.delete;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.APIRequest;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;


public class Raj_Bakhru_BlueFlame {
   
public static void main(String[] args)throws InterruptedException, AWTException, EncryptedDocumentException, IOException {

WebDriver d = new ChromeDriver(); 

d.manage().window().maximize();     

Login l = new Login(d);
delete D = new delete(d);
Blueflamemodel_defaultmodel_switch swtch = new Blueflamemodel_defaultmodel_switch(d);
LigthmodeSwitch switchmode = new LigthmodeSwitch(d);
Logout lgout = new Logout(d);
System_AdminModule sys =new System_AdminModule(d);
QnA_section qna = new QnA_section(d);
apptag aptg = new apptag(d);
AI_model ai = new AI_model(d);
Type type = new Type(d); 
Multiparameter mp = new Multiparameter(d);
Tilereplace rp = new Tilereplace(d);
Mathnotation m = new Mathnotation(d);
RSSfeedtest rss = new RSSfeedtest(d);
Chat_file_export chtexpt = new Chat_file_export(d);
Selectfiles sl = new Selectfiles(d);
Template tmplte = new Template(d);
chatlogo chl = new chatlogo(d); 
chat_like_dislike like = new chat_like_dislike(d); 
Autocomplete_functions at = new Autocomplete_functions(d);
File_section_Checks file = new File_section_Checks(d);
Blueprintrun br = new Blueprintrun(d);
Onboarding_Checking board = new Onboarding_Checking(d);
Timezone_change timezone = new Timezone_change(d);
Screenzoom zoom = new Screenzoom(d);
FileLib f = new FileLib();
usageAnalysis analysis = new usageAnalysis(d);
TakesScreenshot shot = (TakesScreenshot)d;
SystemUsage usage = new SystemUsage(d);





String URL = f.getPropertyData("url");

d.get(URL);

//Data_Reader.datatobe_read();

l.Loggin(); 
switchmode.switchonLightmode(); 
//read.methodA(); 

D.Deletefromchatlist();  

/*
swtch.switchingTodefaultAimodel(); 
switchmode.switchOFFLightmode(); 
aptg.alphabetically_app_name();
ai.Ai_model_selectioncheck(); 
ai.modelchangecheck();  
swtch.switchingTodefaultAimodel();

//chat section checking    
type.multi_images_pastecheck(); 
// Checking @tag staying after message is sent   

type.SendMessage(); 
type.prompt_multi_click();
type.typeafter_apptag();
type.titletextpastecheck(); 
type.Markdowncheck(); 
type.bullet_point_pastecheck();
type.Parameterbox_enter_send_check();
//D.Delete_from_top();  
type.empty_parameterbox_double_enter_send_check(); 
type.control_A_delete_check();   //--
type.parameterbox_delete_reenter_curlybrace_issuecheck();  
type.parameterPlacereplaceCheck();
type.part_text_option_deletecheck();
type.app_afterpromptfavouritesuggestion(); 
type.tabselectcheck(); 
type.copied_textfrom_chat_pasted_inside_parameterbox(); //--
type.multienter_inparameter_notitlechat_creationcheck(); 
type.prompt_multi_click(); 
//type.multiple_qa_answerinchat_showsource_check();
 
//D.Deletefromchatlist(); 

mp.Cursorpositioncheck(); 

rp.Replacecheck(); 
m.checkmathnotation(); 
D.Delete_from_top();  

sl.File_with_pipesearch_in_filespoup();
sl.selectchatfiles();  
sl.autofill_qna_check();  
 // sl.multifilesselect();  

chl.thirdpartylogocheck();  
like.likedislikestaytest();  

at.extrafolder_issue_check(); 

at.autocompleteoption_backspace_delete_check(); 
rss.Rssxmlcheck(); 
chtexpt.chat_export_filename();

rss.Rssxmlcheck(); 
tmplte.pptxfile_check_method_2(); 
tmplte.template_folder_subfoldertraverse_back_check(); 

//File management section checking
*/
file.searchlaggycheck();
file.subfolder_select_from_searchcheck(); 
file.reclassify_check();  
file.add_to_nexus(); 
file.files_to_chat(); 
//D.Deletefromchatlist(); 
file.file_to_QnA();  
file.emlfilecheck();   
//file.non_indexfilechecks();  
file.file_datetime_infocheck(); 
file.videofile_loader_check(); 
file.doubelcross_buttoncheck(); 
file.reindexingcheck(); 
file.content_viewer_pagecheck(); 
file.runblueprint_check();  
file.multifileupload();

//file.filemultideleteCheck();
//Blueprint Section Functionalities checking
/*
br.shareblueprintcheck(); 

br.Blueprintaddform(); 
br.blueprintDelete(); 
br.blueprint_delete_without_webElementList_method(); 
br.importblueprintCheck(); 
br.linkedrecipeEdit_and_Deletecheck();  
br.Blueprint_addGeneration_with_parameterCheck();  

// System Admin Section Checking  
*/

sys.AccountEditChange();
sys.userEdit(); 
sys.systemaccount_searchandFilter_check(); 
sys.AccountStatuscheck(); 
sys.useredit_User_licence_Change();
//Qna Section Checking  

qna.qnasearchCheck();   
qna.qnafavoritecheck();

//D.Delete_from_top();   

switchmode.switchOFFLightmode(); 
board.boading(); 
timezone.timezone_changeto_Local(); 
switchmode.switchonLightmode(); 
analysis.usageAna(); 
usage.systemUsaGe();
lgout.exit(); 
d.quit();        
/*
catch(Exception e){

FileUtils.copyFile(shot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\Screenshot\\exception.jpeg"));
System.out.println("exception found");
d.quit();
}*/
}}
