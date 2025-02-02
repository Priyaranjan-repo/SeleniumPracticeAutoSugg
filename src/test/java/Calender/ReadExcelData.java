package Calender;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\priya\\OneDrive\\Desktop\\TestData\\test12_data.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(1);

		// String cellValue =sheet.getRow(0).getCell(0).getStringCellValue();
		// System.out.println(CellValue);

		int rowCount = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			int cellCount = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);

				String cellVaue = getCellValue(cell);
				System.out.print("||" + cellVaue);
			}
			System.out.println();

		}
		wb.close();
		fis.close();

	}

	public static String getCellValue(XSSFCell cell) {

		switch (cell.getCellType()) {
		case NUMERIC:

			return String.valueOf(cell.getNumericCellValue());
		case STRING:

			return String.valueOf(cell.getStringCellValue());

		case BOOLEAN:

			return String.valueOf(cell.getBooleanCellValue());

		default:
			return cell.getStringCellValue();
		}

	}

}
