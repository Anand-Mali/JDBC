package assignmentparamterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ifelse {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\rushi\\Desktop\\Employee.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("Sheet1");
		int Row = sheet.getLastRowNum();
		System.out.println("Count of Row:" + Row);
		int cell = sheet.getRow(1).getLastCellNum();
		System.out.println("Count of Cell:" + cell);
		for (int R = 0; R <= Row; R++) {
			XSSFRow row = sheet.getRow(R);
			for (int C = 0; C < cell; C++) {
				XSSFCell cell1 = row.getCell(C);
				if (R >= 0) {
					System.out.print(cell1);
					System.out.print(" | ");
				}

			}
			System.out.println();
		}
		work.close();
	}

}
