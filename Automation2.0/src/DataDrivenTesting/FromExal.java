package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class FromExal {
  public static WebDriver driver; {
	
}
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f = new File("C:\\\\Users\\\\shubh\\\\Automation2.0\\\\Automation2.0\\\\Jars\\\\Test\\\\DWS.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook workbook= WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Sheet1");
	int rowNum=sheet.getPhysicalNumberOfRows();
	for(int i=0;i< rowNum ;i++) {
		Row row= sheet.getRow(i);
		int cellNum=row.getPhysicalNumberOfCells();
		for(int j=0;j<cellNum;j++) {
			Cell cell = row.getCell(j);
			String data=cell.toString();
			System.out.print(data+"\t\t\t");
			
		}
		System.out.println();
	}
}

}
