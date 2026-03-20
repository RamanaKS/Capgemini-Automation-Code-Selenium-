package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/orangehrm.TestScriptData/VacanciesData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String vacancyName = cell.getStringCellValue();
		System.out.println(vacancyName);

		Row row1 = sheet.getRow(1);

		int cellCount = row1.getLastCellNum(); // total columns

		for (int i = 0; i < cellCount; i++) {
			Cell cell1 = row.getCell(i);

			if (cell1 != null) {
				switch (cell1.getCellType()) {
				case STRING:
					System.out.print(cell1.getStringCellValue() + " | ");
					break;
				case NUMERIC:
					System.out.print(cell1.getNumericCellValue() + " | ");
					break;
				case BOOLEAN:
					System.out.print(cell1.getBooleanCellValue() + " | ");
					break;
				default:
					System.out.print(" | ");
				}
			}
		}
		System.out.println("=============================================================");
		int columnIndex=1;
		int RowCount=sheet.getLastRowNum();
		System.out.println(RowCount);
		for(int i=1;i<=RowCount;i++)
		{
			Row row2=sheet.getRow(i);
			if(row2==null)
				continue;
			 Cell cell2 = row2.getCell(columnIndex);
			 switch (cell2.getCellType()) {
				case STRING:
					System.out.print(cell2.getStringCellValue() + " | ");
					break;
				case NUMERIC:
					System.out.print(cell2.getNumericCellValue() + " | ");
					break;
				case BOOLEAN:
					System.out.print(cell2.getBooleanCellValue() + " | ");
					break;
				default:
					System.out.print(" | ");
			 }
	          
		}
	}
}
