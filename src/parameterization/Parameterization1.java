package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\rushi\\Desktop\\StudentData.xlsx";

		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook work = new XSSFWorkbook(file);

		XSSFSheet Sheet = work.getSheet("StudentData");

		int Row = Sheet.getLastRowNum();
		System.out.println(Row);

		int Cell = Sheet.getRow(1).getLastCellNum();
		System.out.println(Cell);

		for (int R = 0; R <= Row; R++) {
			XSSFRow row = Sheet.getRow(R);
			for (int C = 0; C < Cell; C++) {
				XSSFCell cell = row.getCell(C);
				switch (cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				default:
					break;
			}
				System.out.print("|");
			}
			System.out.println();
		}
work.close();
	}
}
