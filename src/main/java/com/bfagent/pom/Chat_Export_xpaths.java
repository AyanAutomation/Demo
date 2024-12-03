/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chat_Export_xpaths {
    

@FindBy(xpath ="//div[@class='MuiStack-root css-7iwxlc']//button[@type='button']")
private WebElement Export_button;
@FindBy (xpath="//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1p4qlti']")
private WebElement optionspaths;
@FindBy(xpath="//ul[@role='menu']//li[@role='menuitem'][1]")
private WebElement exportlist;
@FindBy(xpath="/html/body/div[2]/div[3]/ul/li[2]")
private WebElement myoption;
@FindBy(xpath="//div[contains(text(),'Download Started')]")
private WebElement downloadstartmessage;
@FindBy(xpath="//div[contains(text(),'Download Completed')]")
private WebElement downloadsuccessmessage;
@FindBy(xpath="//body/div[@id='root']/section[1]/ol[1]/li[1]/button[1]/*[1]")
private WebElement Success_message_crossbutton;


public Chat_Export_xpaths(WebDriver d){

  PageFactory.initElements(d,this);
}
public WebElement Export_button(){
return Export_button;}
public WebElement optionspaths(){
return optionspaths;}
public WebElement exportlist(){
return exportlist;}
public WebElement myoption(){
return myoption;} 
public WebElement downloadstartmessage(){
return downloadstartmessage;}
public WebElement downloadsuccessmessage(){
return downloadsuccessmessage;}
public WebElement Success_message_crossbutton(){
return Success_message_crossbutton;}
}