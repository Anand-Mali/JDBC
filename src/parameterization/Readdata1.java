package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata1 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\\\Users\\\\rushi\\\\Desktop\\\\StudentData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("StudentData");
		int Row = sheet.getLastRowNum(); // 6

		System.out.println(Row);

		int Cell = sheet.getRow(1).getLastCellNum();

		System.out.println(Cell); // 2

		// R=0 0<=6 - True
		// R=1 1<=6 - True
		// R=7 7<=6 - false
		for (int R = 0; R <= Row; R++) { // Row
			// getRow(0)
			XSSFRow row = sheet.getRow(R);
			// c=0 ;0<2 - true
			// c=1 ;1<2 - true
			// c=2 ;2<2 - false
			for (int C = 0; C < Cell; C++) { // Cell

				String value = row.getCell(C).toString();
				System.out.print(" | " + value); // username password

			}
			System.out.println();

		}
		book.close();
	}

}
