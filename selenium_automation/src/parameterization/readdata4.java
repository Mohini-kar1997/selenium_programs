package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdata4 {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\mohin\\OneDrive\\Desktop\\files_for reading\\StudentInfo.xlsx";
		
		FileInputStream file1=new FileInputStream(path);
		String data1=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		FileInputStream file2=new FileInputStream(path);
		String data2=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		FileInputStream file3=new FileInputStream(path);
		String data3=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(data3);
		
		FileInputStream file4=new FileInputStream(path);
		double data4=WorkbookFactory.create(file4).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();  // if on that row data is not present -nullpointerexception
		System.out.println(data4);
		
		//FileInputStream file5=new FileInputStream(path);
		//double data5=WorkbookFactory.create(file5).getSheet("Sheet3").getRow(0).getCell(0).getNumericCellValue();
	//	System.out.println(data5);
		
		FileInputStream file6=new FileInputStream(path);
		boolean data6=WorkbookFactory.create(file6).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(data6);
		
		

	}

}
