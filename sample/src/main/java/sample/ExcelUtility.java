package sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtility {

	private static final String FILE_PATH = "./src/test/resources/orangehrm.TestScriptData/vacancies.xlsx";

	public Object[][] getExcelDataAsArray(String sheetName) throws Exception {

		try (FileInputStream fis = new FileInputStream(FILE_PATH); Workbook wb = WorkbookFactory.create(fis)) {

			Sheet sheet = wb.getSheet(sheetName);

			if (sheet == null) {
				throw new Exception("Sheet not found: " + sheetName);
			}
			int row = sheet.getLastRowNum();
			int col = sheet.getRow(0).getLastCellNum();
			Object[][] data = new Object[row][col];
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= row; i++) {
				Row currentRow = sheet.getRow(i);
				if (currentRow == null)
					continue;
				for (int j = 0; j < col; j++) {
					Cell cell = currentRow.getCell(j);
					if (cell == null) {
						data[i - 1][j] = "";
						continue;
					}
					switch (cell.getCellType()) {
					case NUMERIC:
						data[i - 1][j] = formatter.formatCellValue(cell);
						break;
					case BOOLEAN:
						data[i - 1][j] = cell.getBooleanCellValue();
						break;
					case STRING:
						data[i - 1][j] = cell.getStringCellValue();
						break;
					default:
						data[i - 1][j] = formatter.formatCellValue(cell);
						break;
					}
				}
			}

			return data;
		}
	}
}