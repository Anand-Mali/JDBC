package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String path = "C:\\\\Users\\\\rushi\\\\Desktop\\\\StudentData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("StudentData");
		int Row = sheet.getLastRowNum();
		System.out.println(Row);
		int cell = sheet.getRow(1).getLastCellNum();
		System.out.println(cell);
		for (int R = 0; R <= Row; R++) {
			XSSFRow row = sheet.getRow(R);
			for (int C = 0; C < cell; C++) {
				XSSFCell cell1 = row.getCell(C);
				switch (cell1.getCellType()) {
				case STRING:System.out.print(cell1.getStringCellValue());break;
				case NUMERIC:System.out.print(cell1.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell1.getBooleanCellValue());break;
				default:
					System.out.print("not matched");

				}
				System.out.print("|");
			}
			System.out.println();
		}
book.close();
	}

}
