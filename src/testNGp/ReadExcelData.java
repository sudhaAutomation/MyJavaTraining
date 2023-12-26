package testNGp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream xlfile = new FileInputStream(".\\excelsheets\\SwhizzPortlTestcases.xlsx");
		//XSSFWorkbook workbook = new XSSFWorkbook(xlfile);
		Workbook workbook = WorkbookFactory.create(xlfile);
		Sheet sheet = workbook.getSheet("gurusheet");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println("no of rows "+rows);
		System.out.println("no of cols "+cols);
		for (int i = 2; i < rows; i++) {
			Row rowData = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = rowData.getCell(j);
				System.out.print(cell+"      ");
			}
			System.out.println();

		}

	}

}
