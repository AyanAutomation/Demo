
package com.bfagent.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Mathnotations_paths {
    
    @FindBy(xpath = "//i[@class='ico1']")
    public WebElement Send;
    
    
    
    public Mathnotations_paths(WebDriver d){
    
    PageFactory.initElements(d, this);
    
    
    }
}
