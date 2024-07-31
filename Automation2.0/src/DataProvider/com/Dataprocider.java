package DataProvider.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
public class Dataprocider {
	@DataProvider
	public String[][] dataprovidermethod()  {
		File f = new File("C:\\Users\\shubh\\Desktop.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] result= new String[rowCount-1][cellCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sheet.getRow(i).getCell(j).toString();
				result[i-1][j]=data;
			}
		}
		return result;
		
	}
}