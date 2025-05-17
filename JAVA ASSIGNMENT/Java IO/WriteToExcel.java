import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
    public static void main(String[] args) throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello Excel!");

        FileOutputStream fos = new FileOutputStream("output.xlsx");
        wb.write(fos);
        wb.close();
        fos.close();
    }
}
