
package com.mycompany.blueflame_raj_bakhru;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenzoom {   
WebDriver d;
public Screenzoom(WebDriver d){        
  this.d=d;     
}    
public void zoomin80() throws AWTException{
String newChattitle = "//h2[contains(text(),'Good Afternoon AYN Demo')]";    
JavascriptExecutor js = (JavascriptExecutor)d;
// Page Zoom in to 80%
js.executeScript("document.body.style.zoom='80%'");
}   
public void zoomout80() throws AWTException{
String newChattitle = "//h2[contains(text(),'Good Afternoon AYN Demo')]";    
JavascriptExecutor js = (JavascriptExecutor)d;
// Page Zoom in to 80%
js.executeScript("document.body.style.zoom='110%'");

}}