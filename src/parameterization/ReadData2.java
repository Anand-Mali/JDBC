package parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\\\Users\\\\rushi\\\\Desktop\\\\StudentData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("StudentData");
		int Row = sheet.getLastRowNum();
		System.out.println(Row);
		int Cell = sheet.getRow(1).getLastCellNum();
		System.out.println(Cell);
		for (int R = 0; R <= Row; R++) {
			XSSFRow row = sheet.getRow(R);
			for (int C = 0; C < Cell; C++) {
				String value = row.getCell(C).toString();
				System.out.print(" | " + value);
			}
			System.out.println();
		}
		book.close();
	}
}
