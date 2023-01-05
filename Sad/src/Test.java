import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

	
public class Test {
	private String name;
	private int amount;
	public static void main(String[] args) throws IOException {
		Workbook book = new XSSFWorkbook(new FileInputStream("/Users/hongsheng/Desktop/sad_samole.xlsx"));
		XSSFSheet shhet =  (XSSFSheet) book.getSheetAt(0);
		for (Row cells : shhet) {
          for (Cell cell : cells) {
              System.out.println(cell.getStringCellValue());
          }
      }
	
	}
	}

