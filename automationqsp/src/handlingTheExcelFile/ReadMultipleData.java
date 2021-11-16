package handlingTheExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		Flib flib = new Flib();
		int rc = flib.rowcount("./data/Testdata.xlsx", "City");
		
		for(int i=1;i<=rc;i++)
		{
			String data = flib.readExcelData("./data/Testdata.xlsx", "City", i, 0);
			System.out.println(data);
		}
		
		
		
	}

}
