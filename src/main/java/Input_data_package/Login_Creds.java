
package Input_data_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Creds {
    
    WebDriver d;
    
    @FindBy(xpath ="//input[@placeholder='Email Address']")
    
   //private: Restricts access to the defining class itself.
    
    private WebElement Email_id_Field;  
    
    //private: Restricts access to the defining class itself.
    
    @FindBy(xpath ="//*[@id=\"outlined-basic\"]")
    
    private WebElement Password_Field;
    
    
     // Constructor to initialize elements and the WebDriver instance
    
    public Login_Creds(WebDriver d){
    this.d = d;
    PageFactory.initElements(d, this);
    
    }
    
    // Method to enter email id value
    
    
    public void setEmail(String email){
    
    Email_id_Field.sendKeys(email);
    }
    
    // Method to enter password value
    
    public void setPassword(String password){
    Password_Field.sendKeys(password);
    }
    
    
    
}
