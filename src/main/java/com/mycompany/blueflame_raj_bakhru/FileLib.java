
package com.mycompany.blueflame_raj_bakhru;

import com.ibiz.excel.picture.support.model.Workbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLib {
    
    
      public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\webskitters\\Documents\\NetBeansProjects\\BlueFlame_Raj_Bakhru\\src\\main\\java\\input\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		}
    
    
}
