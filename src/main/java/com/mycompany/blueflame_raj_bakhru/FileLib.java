
package com.mycompany.blueflame_raj_bakhru;

import com.ibiz.excel.picture.support.model.Workbook;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLib {
    
    
      public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		
          
          
                FileInputStream fis=new FileInputStream("./Demo/ip.xlsx");
		 org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
	String data =wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
                return data;
		}
    
    
}
