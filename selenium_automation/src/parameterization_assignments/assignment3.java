package parameterization_assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assignment3 {

	public static void main(String[] args) throws IOException {
		String path=".\\testdata\\Employee.xlsx";
		FileInputStream file=new FileInputStream(path);
		String HR=WorkbookFactory.create(file).getSheetAt(0).getRow(3).getCell(3).getStringCellValue();
		System.out.println(HR);
	}

}
