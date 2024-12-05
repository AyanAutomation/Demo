
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Timezone_xpaths;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Timezone_change {

WebDriver d;

public Timezone_change(WebDriver d){


this.d = d;

}

public void timezone_changeto_Local(){

  Timezone_xpaths locators = new Timezone_xpaths(d);  
  WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(20));
  Actions a = new Actions(d);

  w.until(ExpectedConditions.visibilityOf(locators.Profileicon()));
  a.moveToElement(locators.Profileicon()).build().perform();
  locators.Profileicon().click();
  w.until(ExpectedConditions.visibilityOf(locators.Profileoption()));
  locators.Profileoption().click();
  w.until(ExpectedConditions.visibilityOf(locators.timezone_editButtin()));
  locators.timezone_editButtin().click();
  w.until(ExpectedConditions.visibilityOf{locators.timezone_fieldXpath()));
  d.findElement(By.xpath(timezone_fieldXpath)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timezoneOption_searchbox)));
  d.findElement(By.xpath(timezoneOption_searchbox)).sendKeys("Kolkata");
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(kolkataOption)));
  d.findElement(By.xpath(kolkataOption)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveButton)));
  d.findElement(By.xpath(saveButton)).click();
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successToast)));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toastCrossbot)));
  d.findElement(By.xpath(toastCrossbot)).click(); 
  d.get("https://app-dev.blueflame.ai/dashboard/chat");

}}
