
package com.mycompany.blueflame_raj_bakhru;

import com.ibiz.excel.picture.support.module.Sheet1;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class Data_Reader {
    
    WebDriver d;
    
  public Data_Reader(WebDriver d){
    
     this.d=d; 
  }
    
  public void datatobe_read() throws EncryptedDocumentException, IOException{
  
      FileLib dt = new FileLib();
     dt.getExcelData("Sheet1", 0, 0);
      
      System.out.println(dt);
  }
    
}
