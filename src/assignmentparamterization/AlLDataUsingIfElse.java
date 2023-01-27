package assignmentparamterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlLDataUsingIfElse {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\rushi\\Desktop\\Employee.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("Sheet1");
		int Row = sheet.getLastRowNum();
		System.out.println("Count of Row:" +Row);
		int cell = sheet.getRow(1).getLastCellNum();
		System.out.println("Count of Cell:" +cell);
		for (int R = 0; R <= Row; R++) {
			XSSFRow row1 = sheet.getRow(R);
			String cellData = "";
			for (int C = 0; C < cell; C++) {
				XSSFCell cell1 = row1.getCell(C);
				if (cell1.getCellType() == CellType.NUMERIC) {
					cellData = String.valueOf(cell1.getNumericCellValue());
					System.out.print(cellData);
					System.out.print(" | ");

				}
				/*if (cell1.getCellType() == CellType.BOOLEAN) {
					cellData = String.valueOf(cell1.getBooleanCellValue());
					System.out.print(cellData);
					System.out.print(" | ");
				}*/
				if (cell1.getCellType() == CellType.STRING) {
					cellData = cell1.getStringCellValue();
					System.out.print(cellData);
					System.out.print(" | ");
				}
				else
				{
					cellData="";
				}
}
			System.out.println("");
		}
		work.close();
	}
}
