package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata2 {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\mohin\\OneDrive\\Desktop\\files_for reading\\11March_Data.xlsx";
		FileInputStream file=new FileInputStream(path); // to open file
		XSSFWorkbook w=new XSSFWorkbook(file);
		String data=w.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);

	}

}
