package parameterization_assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class assignment4 {

	public static void main(String[] args) throws IOException {
		//using too string method
String path=".\\testdata\\Employee.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet sheet=w.getSheet("Sheet1");
        
		int rows=sheet.getLastRowNum();
		System.out.println("Last row number in file--->"+rows);
		
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println("Last column number in file--->"+column);
		
		for(int i=0; i<=rows; i++) {
			XSSFRow r=sheet.getRow(i);
			
			for(int j=0;j<column;j++) {
				XSSFCell cell=r.getCell(j);
		
				String cellvalue=cell.toString();  //java method returns string representation of the object
				System.out.print(cellvalue+ "\t");
				}
			System.out.println();

	}

}
}
