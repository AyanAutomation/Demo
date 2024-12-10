
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
        private WebElement Create_BlueprntButton; 
        @FindBy(css="input[placeholder='search']")
        private WebElement blueprintListsearch;
        @FindBy(xpath="//div[@class='MuiBox-root css-ehlpcq']")
        public List <WebElement> shareLibaryOptions_GenericXpath;
        @FindBy(xpath="//*[text()='Add prompt']")
        private WebElement addprmtbt;
        @FindBy(xpath="(//*[@class='is-empty is-editor-empty'])[1]")
        private WebElement prmptbox;
        @FindBy(xpath="(//*[@contenteditable='true'])[1]")
        private WebElement promptboxWithcontent;
        @FindBy(xpath="")
        private WebElement summarytoggle;
        @FindBy(xpath="")
        private WebElement summarizeResultboxCssselector;
        @FindBy(xpath="//*[text()='Save']")
        private WebElement saveButtonone;
        @FindBy(xpath="(//*[@data-testid='blueprint-preview-section']//div[@data-testid='flex-box'])[1]")
        private WebElement settingsSlidedrawer;
        @FindBy(xpath="")
        private WebElement moveInsideform;
        @FindBy(xpath="//input[@name='name']")
        private WebElement BlueprintnameField;
        @FindBy(xpath="//*[text()='Manage and organize your notes efficiently.']")
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
        @FindBy(xpath="//*[text()='Blueprint Name']")
        private WebElement blueprintnametitle;
        @FindBy(xpath="//*[text()='Description']")
        private WebElement descriptionNametitle;
        @FindBy(xpath="(//div[@aria-label='Hide from results Prompt will still be used to summaries the output']//button)[1]")
        private WebElement promptDeletebutton;
        @FindBy(xpath="//textarea[@placeholder='Write what this Blueprint is supposed to do here...']")
        private WebElement generateTextbox;
        @FindBy(xpath="(//*[text()='Generate'])[1]")
        private WebElement generateTextButton;
        @FindBy(xpath="")
        private WebElement Librarysearch;
        @FindBy(xpath="")
        private WebElement searchboxpost_with_searchword;
        @FindBy(xpath="(//*[text()='Delete'])")
        private WebElement deleOk;
        @FindBy(xpath="//li[@aria-live='polite']")
        private WebElement recipedeleteSuccessToast;
        @FindBy(xpath="//button[@aria-label='Close toast']")
        private WebElement deleteToastcrossButton;
        @FindBy(xpath="//*[text()='Delete']")
        private WebElement deleteOptn;
        @FindBy(xpath="")
        private WebElement ChooseUser;
        @FindBy(xpath="//*[text()='Add From Library']")
        private WebElement addtoLibraryButton;
        @FindBy(xpath="//*[text()='Add from library']")
        private WebElement addlibraryPopupTitle;
        @FindBy(xpath="//div[@class='MuiStack-root css-pv9i0t']//div[@data-testid='blueprint-list']")
        private WebElement insideRecipeList;
        @FindBy(xpath="(//div[@class='MuiStack-root css-pv9i0t']//div[@data-testid='blueprint-list']//div[@data-testid='blueprint-card']//div[@class='MuiBox-root css-c8qvef'])[1]")
        private WebElement bottomsectionofLibraryCard;
        @FindBy(xpath="//li[@aria-live='polite']")
        private WebElement importSuccessToast;
        @FindBy(xpath="//div[@class='MuiStack-root css-8bp6bw']//button")
        private WebElement libraryPopupCloseButton;
        @FindBy(xpath="(//*[text()='Blueprints'])[2]")
        private WebElement primartBlueprintListTitle;
        @FindBy(xpath="(//div[@class='MuiStack-root css-pv9i0t']//div[@data-testid='blueprint-list']//div[@data-testid='blueprint-card']//p)[1]")
        private WebElement importedBlueprintName;
        @FindBy(xpath="//button[@aria-label='Close toast']")
        private WebElement toastCrossButton;
        @FindBy(xpath="")
        private WebElement linkedBlueprintCard;
        @FindBy(xpath="")
        private WebElement viewonlyinfotext;
        @FindBy(xpath="")
        private WebElement threedtbutton;
        @FindBy(xpath="(//div[@class='MuiStack-root css-pv9i0t']//div[@data-testid='blueprint-list']//div[@data-testid='blueprint-card']//div[@class='MuiBox-root css-c8qvef']//button)[1]")
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
        @FindBy(xpath="//*[text()='Add Schedule']")
        private WebElement addscheduleButton;
        @FindBy(xpath="//*[@class='MuiBox-root css-9452eu']")
        private WebElement popupScheduleForm;
        @FindBy(xpath="//input[@placeholder='hh:mm aa']")
        private WebElement timeClockIcon;
        @FindBy(xpath="(//*[@class='MuiBox-root css-1m3dv9c']//span)[1]")
        private WebElement scheduleFrequencyButton;
        @FindBy(xpath="//*[text()='Weekly']")
        private WebElement weeklyOption;
        @FindBy(xpath="//*[@class='MuiStack-root css-1rplq84']//button")
        public List <WebElement> weeklyoptionGenericXpath;
        @FindBy(xpath="(//*[text()='Save'])[2]")
        private WebElement scheduleSaveButton;
        @FindBy(xpath="")
        private WebElement scheduletimeval;
        @FindBy(xpath="//*[text()='OK']")
        private WebElement scheduletimeOkButton;
        @FindBy(xpath="")
        private WebElement library_DemoLinked_recipeXpath;
        @FindBy(xpath="")
        private WebElement Library_DemoRecipe_Bottom_section;
        @FindBy(xpath="")
        private WebElement demoLinked_recipeImportButton;
        @FindBy(xpath="(//*[text()='Create Blueprint'])")
        private WebElement noBlueprint_FoundText;
        
    
        
        public Blueprints_xpaths(WebDriver d){
        PageFactory.initElements(d, this);}
        public String shareOption(){
         return shareOption;}
        public String AccountLiboption(){
        return AccountLiboption;}
        public String userforSharing(){
        return userforSharing;}
        public String Deleteoption(){
        return Deleteoption;}
        public String monDay(){
        return monDay;}
        public String webSkitterdevoption(){
        return webSkitterdevoption;}
        public WebElement menu_option(){
        return menu_option;}
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
        return Create_BlueprntButton;}
        public WebElement blueprintListsearch(){
        return blueprintListsearch; } 
        public WebElement addprmtbt(){
        return addprmtbt;}
        public WebElement prmptbox(){
        return prmptbox; }
        public WebElement promptboxWithcontent(){
        return promptboxWithcontent;}
        public WebElement promptDeletebutton(){
        return promptDeletebutton;}
        public WebElement saveButtonone(){
        return saveButtonone;}
        public WebElement settingsSlidedrawer(){
        return settingsSlidedrawer;}
        public WebElement blueprintnametitle(){
        return blueprintnametitle;}
        public WebElement descriptionNametitle(){
        return descriptionNametitle; }
        public WebElement generateTextbox(){
        return generateTextbox;}
        public WebElement generateTextButton(){
        return generateTextButton;}
        public WebElement BlueprintnameField(){
        return BlueprintnameField;}
        public WebElement BlueprintDescription_Field(){
        return BlueprintDescription_Field;}
        public WebElement addscheduleButton(){
        return addscheduleButton;}
        public WebElement popupScheduleForm(){
        return popupScheduleForm;}
        public WebElement scheduleFrequencyButton(){
        return scheduleFrequencyButton;}
        public WebElement weeklyOption(){
        return weeklyOption;}
        public WebElement timeClockIcon(){
        return timeClockIcon;}
        public WebElement scheduletimeOkButton(){
        return scheduletimeOkButton;}
        public WebElement scheduleSaveButton(){
        return scheduleSaveButton;}
        public WebElement deleOk(){
        return deleOk;}
        public WebElement recipedeleteSuccessToast(){
        return recipedeleteSuccessToast;}
        public WebElement deleteToastcrossButton(){
        return deleteToastcrossButton;}
        public WebElement noBlueprint_FoundText(){
        return noBlueprint_FoundText;}
        public WebElement deleteOptn(){
        return deleteOptn;}
        public WebElement addtoLibraryButton(){
        return addtoLibraryButton;}
        public WebElement addlibraryPopupTitle(){
        return addlibraryPopupTitle;}
        public WebElement insideRecipeList(){
        return insideRecipeList;}
        public WebElement bottomsectionofLibraryCard(){
        return bottomsectionofLibraryCard;}
        public WebElement importButton(){
        return importButton;}
        public WebElement importedBlueprintName(){
        return importedBlueprintName;}
        public WebElement importSuccessToast(){
        return importSuccessToast; }
        public WebElement toastCrossButton(){
        return toastCrossButton;}
        public WebElement libraryPopupCloseButton(){
        return libraryPopupCloseButton;}
        public WebElement primartBlueprintListTitle(){
        return primartBlueprintListTitle; }

}
        
        
        

