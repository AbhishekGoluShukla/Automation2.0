package FramWorkPackeg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExalUtlite {
	/**
	 * This Method is used to 
	 * 
	 * @param sheet ->pass sheet name	
	 * @param row ->pass row index
	 * @param cell ->pass cell index
	 * @return ->Data in the form of string
	 */
	public static String readDataFromExal(String sheet,int row,int cell) {
		File f = new File("C:\\\\Users\\\\shubh\\\\Automation2.0\\\\Automation2.0\\\\Jars\\\\Test\\\\DWS.xlsx");
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
		String data=workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
		
	}
	

}
