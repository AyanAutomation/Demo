
package Input_data_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;


public class InputData {
    
    WebDriver d;
    
    
    public InputData(WebDriver d){
    
    this.d=d;
    
    
    }
    
    
    
    public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".input\\data.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		}
    
}
