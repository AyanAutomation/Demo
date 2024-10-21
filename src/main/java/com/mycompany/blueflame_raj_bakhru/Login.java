
package com.mycompany.blueflame_raj_bakhru;

import com.bfagent.pom.Loginxpaths;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class Login {
    
    WebDriver d;
    
public Login(WebDriver d){

    this.d= d;
       }

public void Loggin(){
    
   
    Loginxpaths path = new Loginxpaths(d);
    
  /* String alternateUrl_for_Login = "https://app-dev.blueflame.ai?token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2MGQ0MzJjZi0wYTQ3LTQ2MzQtYmFjZC03NDk1M2M2OWMwZmUiLCJpYXQiOjE3MjcxODk0NTIsIm5iZiI6MTcyNzE4OTQ1MiwianRpIjoiZDIxYWY0M2YtZTViMy00N2JiLWFjMzYtNGZjYmY0NzdkMTdiIiwiZXhwIjoxNzI3Mjc1ODUyfQ.RoDlYz0sEAfKz7Gk4khsN_PXJhdtCkaCSmgDUWQLzxWo3MJ3z_octJfbRZfiMVssy7AM1VilRcNLsW7XE-vgveT5mXSHsyPi6CjYnWaNJTyZGjCDw5y1POT9qkZl-p1xEHHH6fnpc4BCO4L7hg8iPd4P757DsWafOIE3lXEzHSZUbzZleA5J4410XH4ZUie_JqHaN2doPYVFL_0KgLrjjuCpLTviWVFdimzyu5u6r6muqUzdKoVHcwaQYkYPlHnBPkPLXqcLXK-3AE33QQS5V0Qr6uA5sTEbBZmr9izzZuFeOVVS6tf2u6fwafoc-fAh7maGsApsUlV94pPInqYNfnqamnfcdEXBc--e_Q5MyArBwws3ZBjQfB6eGuVDXrX5keR90seSvFzsoyHafutsIZja8lub865E8RklTzTrd3KLjvSDnsIGnB0i4Gkf-J9_62jDYVBkbyePIhPb6kiySA_c-s0gepoiSFK9y2dxePeskzCoV4yIRLhlLuhh3qM0cpMOIKG2E_-vl6c0SvOvSbDnYIYSeM1Y6DLccttLZGllhvzswbJ8qwuXO84zVPuyAjYVnJ8FAd2b3Zn093UyKiisGFrtbmL7kxKY5aIug4DmePMgVXBQztnehoUUsOLzDC_uvenVuVt1nMxyxn1Nq-XbsCgAGm7YcWHvkR0AkRk";
    d.get(alternateUrl_for_Login); 
*/
     WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(50));
      
     w.until(ExpectedConditions.visibilityOf(path.Email_id_Field()));
     path.Email_id_Field().sendKeys("testuser1991@yopmail.com");
     path.Email_submit_button().click();
 
 // Attempt to locate an element using XPath
try{
    WebElement error_shown = path.errorMessage();
     // Perform this action on the element if found
    if(error_shown.isDisplayed()){
     d.navigate().refresh();
     System.out.println("element found page refreshed");
        }
    else{
        System.out.println("No error Message found");
 }
    
}
catch(NoSuchElementException e){
    
    // Element not found, so skipping the step
   // System.out.println("element still not found, skipping this step");
     
}
     // Continue executing the rest of the script
       d.navigate().refresh();
       w.until(ExpectedConditions.visibilityOf(path.Email_id_Field()));
       path.Email_id_Field().sendKeys("testuser1991@yopmail.com");
       path.Email_submit_button().click();
       w.until(ExpectedConditions.visibilityOf(path.Password_field()));
       path.Password_field().sendKeys("12345678");
       path.Login_SubmitButton_xpath().click();  
       w.until(ExpectedConditions.visibilityOf(path.Chat_list_title()));
}
}