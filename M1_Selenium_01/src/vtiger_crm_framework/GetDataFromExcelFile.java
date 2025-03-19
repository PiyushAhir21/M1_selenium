package vtiger_crm_framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile {
	public static void main(String[] args) throws IOException {
//		create java representation object of the physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\git\\M1_selenium\\M1_Selenium_01\\resource\\testData1.xlsx");

//		open the workbook in read mode by using create() of workbookfactory
		Workbook wb = WorkbookFactory.create(fis);
		
//		get the access of sheet by using getSheet()
		Sheet sh = wb.getSheet("opp");
		
//		get the access of row by using getRow()
		Row row = sh.getRow(1);
		
//		get the access of the cell by using getCell()
		Cell cell = row.getCell(0);
		
//		get data of the cell by using getStringCellValue() or getNumericCellValue()
		String data = cell.getStringCellValue();
		
		System.out.println(data);
	}
}
