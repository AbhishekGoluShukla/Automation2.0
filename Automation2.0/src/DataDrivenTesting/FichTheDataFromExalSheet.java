package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class FichTheDataFromExalSheet {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\shubh\\Automation2.0\\Automation2.0\\Jars\\Test\\DWS.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		 Row row = sheet.getRow(1);
		 Cell cell = row.getCell(2);
		 System.out.println(cell);
	}

}
