package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata1 {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\\\Users\\\\mohin\\\\OneDrive\\\\Desktop\\\\files_for reading\\\\StudentInfo.xlsx";
		FileInputStream file6=new FileInputStream(path);
		boolean data6=WorkbookFactory.create(file6).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(data6);
	}

}
