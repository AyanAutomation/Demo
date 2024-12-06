
package com.bfagent.pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Blueprints_xpaths {
    
    
        String shareOption = "Share";
        String AccountLiboption = "Account Library";
        String userforSharing = "Webskitters test Dev";
        String  Deleteoption= "Delete";
        String  monDay = "Mo"; 
        String  webSkitterdevoption = "Webskitters test Dev";
        
       // String  = "//body/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]";
        /*
        String  = "";
        String  = "";
        String  = "//li[@aria-live='polite']";
        String  = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
        String  = "//div[text()='Create New']";
        //body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]
        String  = "(//button[@type='button'])[7]";
        String  = "//button[text()='Add prompt']";
        String  = "//div[@contenteditable='true']//p[@class='is-empty is-editor-empty']";
        String  = "//div[@class='tiptap ProseMirror _tiptap_editor']";
        String  = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]"; 
        String  = "//input[@aria-label ='controlled']";
        String  = "customValues.summarizeText";
        String  = "//div[text()='Save']";
        String  = "//div[text()='Save']";
        String  = "//div[@class='MuiBox-root css-41in74']//button[@type='button']";
        String  = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]";        
        String  = "//textarea[@placeholder='Blueprint name *']";
        String  = "//textarea[@name='description']";
        String  = "//div[contains(text(),'Recipe: Blueprint name created successfully')]";        
        String  = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]";
        String  = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/nav/ol/li[3]/div/p";
        String  = "//h1[contains(text(),'Blueprints')]";
        
        String  = "//*[@placeholder='Blueprint name *']";
        String  = "//textarea[@placeholder='Write what this Blueprint is supposed to do here...']";
        String  = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1mknrun'])[1]";
        String  = "//textarea[@placeholder='Write what this Blueprint is supposed to do here...']";
        String  = "//*[contains(text(),'Generate')]";
        String  = "/html/body/div[4]/div[3]/div/div[1]/button";
        String  = "input[placeholder='search']";
        String  = "//input[@placeholder='Search']";
        String  = "input[value='World News Summary']";
        String  = "//div[text()='Yes']";
        String  = "//div[contains(text(),'Blueprint Deleted Successfully.')]";
        String  = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
        String  = "//p[contains(text(),'Delete')]";
        String  = "//p[contains(text(),'Search by name')]";
        String  = "//button[contains(text(),'Add from library')]";
        String  = "//p[contains(text(),'Add from library')]";
        String  = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]";
        String  = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1594mfo'])[2]";
        String  = "//div[contains(text(),'Recipe: Global Blueprint imported successfully')]";
        String  = "//body/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]";
        String  = "//h1[contains(text(),'Blueprints')]";
        String  = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
        String  = "//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]";
        String  = "(//h3[text()='Demo Recipe linked'])[1]";
        String  = "//div[contains(text(),'Linked Blueprint View only')]";
        String  = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/button[1]";
        String  = "(//button[text()='Import'])[2]"; 
        String  = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1deb5uc']";
        String  = "//div[text()='Yes']";
        String  = "//body/div[@id='root']/section[1]/ol[1]/li[1]";
        String  = "//div[@role='button']//span[contains(text(),'company name')]";
        String  = "//div[@role='button']//span[contains(text(),'company name')]//button[@type='button'][1]";        
        String  = "//input[@aria-invalid='false']";
        String  = "//body/div[4]";        
        String  = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]";
        String  = "//span[contains(text(),'company')]//button[@type='button'][2]";
        String  = "//button[contains(text(),'Delete all')]";
        String  = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]";
        String  = "//input[@placeholder='Type here']";
        String  = "/html/body/div[4]/div[3]/div/div/div[2]/button[2]";
        String  = "//p[contains(text(),'Today')]";
        String  = "//button[text()='Add Schedule']";
        String  = "//body/div[@id='schedule-list-add']/div[3]/div[1]";
        String  = "//body/div[@id='schedule-list-add']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]";
        String  = "//div[@id='mui-component-select-frequency']";
        String  = "//li[@data-value='WEEKLY']";       
        String  = "//li[@class='MuiListItem-root MuiListItem-gutters css-1tpp0wj']";
               
        String  = "//div[@class='MuiStack-root css-1b138w3']//button[contains(text(),'Save')]";
        String  = "//body/div[6]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]";
        String  = "//button[text()='OK']";
        String  = "//div[@class='MuiBox-root css-ehlpcq']";
        String  = "(//div[@class='MuiBox-root css-1qdy2zr']//div[@class='MuiBox-root css-ehlpcq']//button[@type='button']//p[@class='MuiTypography-root MuiTypography-body1 css-newj2o'])[2]";
        
        String  = "//h3[text()='Demo Recipe linked']";
        String  = "//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]";
        String  = "//button[text()='Import']";
        String  = "//h1[text()='No blueprint found']"; */
        
        @FindBy(xpath="//div[@class='MuiBox-root css-15x4ckx']//ul")
        private WebElement menu_option;
        @FindBy(xpath="//a[@href='/dashboard/blueprints']")
        private WebElement Blueprint_option;
        @FindBy(xpath="(//button[@data-testid='run-button'])[1]")
        private WebElement run_Button;
        @FindBy(xpath="//div[@class='MuiBox-root css-15x4ckx']//ul")
        private WebElement Chatlist;
        @FindBy(xpath="//div[@class='MuiBox-root css-15x4ckx']//ul//p[contains(text(),'Chat')]")
        private WebElement Chat_option;
        @FindBy(xpath="(//div[@class='MuiBox-root css-1jnh1ax']//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-6dfyo3'])[1]")
        private WebElement RunnedBlueprintchat;
        @FindBy(xpath="(//div[@class='MuiBox-root css-1ftual3']//div[@class='MuiBox-root css-0']//div[@class='MuiBox-root css-ff06u1'])[2]")
        private WebElement Firstmessage;
        @FindBy(xpath="(//div[@class='css-us5t5t']//button)[2]")
        private WebElement likebutton;
        @FindBy(xpath="(//div[@class='MuiStack-root css-u6v8er'])[2]")
        private WebElement advancedViewbutton;
        @FindBy(xpath="(//div[@class='MuiStack-root css-u4p24i']//button)[1]")
        private WebElement threedot;
        @FindBy(xpath="//*[@class='MuiBox-root css-1eh5481' and @data-testid='flex-box']")
        private WebElement sidedropdownmenu;
        @FindBy(xpath="//div[@class='MuiBox-root css-m0p3oi']//button")
        public List <WebElement> allmenuitems;
        @FindBy(xpath="//p[contains(text(),'Select Library')]")
        private WebElement addtoLibraryOption;
        @FindBy(xpath="(//div[@data-testid='field-state-wrapper']//div[@data-testid='select']//p)[1]")
        private WebElement accountOption;
        @FindBy(xpath="//div[@role='presentation']//p")
        private WebElement popOutModal;
        @FindBy(xpath="(//div[@class='MuiStack-root css-u4p24i']//button)[2]")
        private WebElement promptlockButton;
        @FindBy(xpath="//div[@class='MuiBox-root css-1qdy2zr']")
        private WebElement accountList;
        @FindBy(xpath="//div[@class='MuiBox-root css-1qdy2zr']//p[text()='BlueFlame AI']")
        private WebElement blueflameaiOption;
        @FindBy(xpath="//p[text()='Search by name']")
        private WebElement selectUser;
        @FindBy(xpath="//*[text()='Share Company Research on {Company name}']")
        private WebElement popovercloser;
        @FindBy(xpath="//div[text()='Share']")
        private WebElement shareButton;
        @FindBy(xpath="//li[@aria-live='polite']")
        private WebElement shareSuccessMessage;
        @FindBy(xpath="//button[@aria-label='Close toast']")
        private WebElement shareToastcrossbutton;
        @FindBy(xpath="//a[@href='/dashboard/blueprints/editor']")
        private WebElement Create_BlueprntButton; /*
        @FindBy(xpath="")
        private WebElement gearButton;
        @FindBy(xpath="")
        private WebElement addprmtbt;
        @FindBy(xpath="")
        private WebElement prmptbox;
        @FindBy(xpath="")
        private WebElement promptboxWithcontent;
        @FindBy(xpath="")
        private WebElement lightMode;
        @FindBy(xpath="")
        private WebElement summarytoggle;
        @FindBy(xpath="")
        private WebElement summarizeResultboxCssselector;
        @FindBy(xpath="")
        private WebElement saveButtonone;
        @FindBy(xpath="")
        private WebElement saveButtontwo;
        @FindBy(xpath="")
        private WebElement settingsSlidedrawer;
        @FindBy(xpath="")
        private WebElement moveInsideform;
        @FindBy(xpath="")
        private WebElement BlueprintnameField;
        @FindBy(xpath="")
        private WebElement BlueprintDescription_Field;
        @FindBy(xpath="")
        private WebElement savesuccessToast;
        @FindBy(xpath="")
        private WebElement savesuccessToastcrossbutton;
        @FindBy(xpath="")
        private WebElement createdBlueprintName;
        @FindBy(xpath="")
        private WebElement blueprintitlename;
        @FindBy(xpath="")
        private WebElement deleteOption;
        @FindBy(xpath="")
        private WebElement blueprintnametitle;
        @FindBy(xpath="")
        private WebElement descriptionNametitle;
        @FindBy(xpath="")
        private WebElement promptDeletebutton;
        @FindBy(xpath="")
        private WebElement generateTextbox;
        @FindBy(xpath="")
        private WebElement generateTextButton;
        @FindBy(xpath="")
        private WebElement sideDrawerclose_button;
        @FindBy(css="")
        private WebElement blueprintListsearch;
        @FindBy(xpath="")
        private WebElement Librarysearch;
        @FindBy(xpath="")
        private WebElement searchboxpost_with_searchword;
        @FindBy(xpath="")
        private WebElement deleOk;
        @FindBy(xpath="")
        private WebElement recipedeleteSuccessToast;
        @FindBy(xpath="")
        private WebElement deleteToastcrossButton;
        @FindBy(xpath="")
        private WebElement deleteOptn;
        @FindBy(xpath="")
        private WebElement ChooseUser;
        @FindBy(xpath="")
        private WebElement addtoLibraryButton;
        @FindBy(xpath="")
        private WebElement addlibraryPopupTitle;
        @FindBy(xpath="")
        private WebElement insideRecipeList;
        @FindBy(xpath="")
        private WebElement bottomsectionofLibraryCard;
        @FindBy(xpath="")
        private WebElement importSuccessToast;
        @FindBy(xpath="")
        private WebElement libraryPopupCloseButton;
        @FindBy(xpath="")
        private WebElement primartBlueprintListTitle;
        @FindBy(xpath="/")
        private WebElement importedBlueprintName;
        @FindBy(xpath="")
        private WebElement toastCrossButton;
        @FindBy(xpath="")
        private WebElement linkedBlueprintCard;
        @FindBy(xpath="")
        private WebElement viewonlyinfotext;
        @FindBy(xpath="")
        private WebElement threedtbutton;
        @FindBy(xpath="")
        private WebElement importButton;
        @FindBy(xpath="")
        private WebElement alloptsn;
        @FindBy(xpath="")
        private WebElement okconfirmaction;
        @FindBy(xpath="")
        private WebElement deltoast;
        @FindBy(xpath="")
        private WebElement userinputField;
        @FindBy(xpath="")
        private WebElement userinputEditButton;
        @FindBy(xpath="")
        private WebElement userinputeditbox;
        @FindBy(xpath="")
        private WebElement outsideuserinputform;
        @FindBy(xpath="")
        private WebElement editeduserinput;
        @FindBy(xpath="")
        private WebElement userinputDeleteButton;
        @FindBy(xpath="")
        private WebElement userinputdelconfirm;
        @FindBy(xpath="")
        private WebElement runprompt;
        @FindBy(xpath="")
        private WebElement parameterinputBoxforrun;
        @FindBy(xpath="")
        private WebElement runButton_inside_confirmationPopUp;
        @FindBy(xpath="")
        private WebElement previewChat_generated;
        @FindBy(xpath="")
        private WebElement addscheduleButton;
        @FindBy(xpath="")
        private WebElement popupScheduleForm;
        @FindBy(xpath="")
        private WebElement timeClockIcon;
        @FindBy(xpath="")
        private WebElement scheduleFrequencyButton;
        @FindBy(xpath="")
        private WebElement weeklyOption;
        @FindBy(xpath="")
        private WebElement weeklyoptionGenericXpath;
        @FindBy(xpath="")
        private WebElement scheduleSaveButton;
        @FindBy(xpath="")
        private WebElement scheduletimeval;
        @FindBy(xpath="")
        private WebElement scheduletimeOkButton;
        @FindBy(xpath="")
        private WebElement shareLibaryOptions_GenericXpath;
        @FindBy(xpath="")
        private WebElement library_DemoLinked_recipeXpath;
        @FindBy(xpath="")
        private WebElement Library_DemoRecipe_Bottom_section;
        @FindBy(xpath="")
        private WebElement demoLinked_recipeImportButton;
        @FindBy(xpath="")
        private WebElement noBlueprint_FoundText;
        
    */
        
        public Blueprints_xpaths(WebDriver d){
        
        PageFactory.initElements(d, this);
        }
        public String shareOption(){
         return shareOption;
        }
        public String AccountLiboption(){
        return AccountLiboption;
        }
        public String userforSharing(){
        return userforSharing;
        }
        public String Deleteoption(){
        return Deleteoption;
        }
        public String monDay(){
        return monDay;
        }
        public String webSkitterdevoption(){
        return webSkitterdevoption;}
        public WebElement menu_option(){
        return menu_option;
        }
        public WebElement Blueprint_option(){
        return Blueprint_option;}
        public WebElement run_Button(){
        return run_Button;}
        public WebElement Chatlist(){
        return Chatlist;}
        public WebElement Chat_option(){
        return Chat_option;}
        public WebElement RunnedBlueprintchat(){
        return RunnedBlueprintchat;}
        public WebElement Firstmessage(){
        return Firstmessage;}
        public WebElement likebutton(){
         return likebutton; }
        public WebElement advancedViewbutton(){
         return advancedViewbutton; }
        public WebElement threedot(){
         return threedot; }
        public WebElement sidedropdownmenu(){
         return sidedropdownmenu; }
        public WebElement addtoLibraryOption() {
         return  addtoLibraryOption;}
        public WebElement accountOption(){
         return accountOption; }
        public WebElement popOutModal(){
         return popOutModal; }
        public WebElement promptlockButton(){
         return promptlockButton; }
        public WebElement accountList(){
         return accountList; }
        public WebElement blueflameaiOption() {
         return blueflameaiOption; }
        public WebElement selectUser(){
         return selectUser; }
        public WebElement popovercloser(){
         return popovercloser; }
        public WebElement shareButton(){
         return shareButton;}
        public WebElement shareSuccessMessage() {
         return shareSuccessMessage; }
        public WebElement shareToastcrossbutton(){
         return shareToastcrossbutton; }
        public WebElement Create_BlueprntButton(){
         return  Create_BlueprntButton;}
      /*  public {
         return  } */
        
}
