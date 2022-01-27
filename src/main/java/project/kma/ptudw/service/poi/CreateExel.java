/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import project.kma.ptudw.entity.DetailSalary;

/**
 *
 * @author Duy Nien
 */
public class CreateExel {

  private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
    HSSFFont font = workbook.createFont();
    font.setBold(true);
    HSSFCellStyle style = workbook.createCellStyle();
    style.setFont(font);
    return style;
  }

  public static void update() throws Exception {
    File file = new File("D:\\employee.xls");
    // Đọc một file XSL.
    FileInputStream inputStream = new FileInputStream(file);

    // Đối tượng workbook cho file XSL.
    HSSFWorkbook workbook = new HSSFWorkbook(inputStream);

    // Lấy ra sheet đầu tiên từ workbook
    HSSFSheet sheet = workbook.getSheetAt(0);

    HSSFCell cell = sheet.getRow(1).getCell(2);
    cell.setCellValue(cell.getNumericCellValue() * 2);

    cell = sheet.getRow(2).getCell(2);
    cell.setCellValue(cell.getNumericCellValue() * 2);

    cell = sheet.getRow(3).getCell(2);
    cell.setCellValue(cell.getNumericCellValue() * 2);

    inputStream.close();

    // Ghi file
    FileOutputStream out = new FileOutputStream(file);
    workbook.write(out);
    out.close();
  }

  public static void handleCreate(List<DetailSalary> detailSalarys) throws Exception {
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("Employees sheet");

    int rownum = 0;
    Cell cell;
    Row row;
    //
    HSSFCellStyle style = createStyleForTitle(workbook);

    row = sheet.createRow(rownum);

    cell = row.createCell(0, CellType.STRING);
    cell.setCellValue("Name");
    cell.setCellStyle(style);
    cell = row.createCell(1, CellType.STRING);
    cell.setCellValue("Address");
    cell.setCellStyle(style);
    cell = row.createCell(2, CellType.STRING);
    cell.setCellValue("Phone");
    cell.setCellStyle(style);
    cell = row.createCell(3, CellType.STRING);
    cell.setCellValue("Start Job");
    cell.setCellStyle(style);
    cell = row.createCell(4, CellType.STRING);
    cell.setCellValue("Month");
    cell.setCellStyle(style);
    cell = row.createCell(5, CellType.STRING);
    cell.setCellValue("Year");
    cell.setCellStyle(style);
    cell = row.createCell(6, CellType.STRING);
    cell.setCellValue("Salary");
    cell.setCellStyle(style);

    // Data
    for (DetailSalary salary : detailSalarys) {
      rownum++;
      row = sheet.createRow(rownum);
      cell = row.createCell(0, CellType.STRING);
      cell.setCellValue(salary.getEmployee().getEmpName());
      cell = row.createCell(1, CellType.STRING);
      cell.setCellValue(salary.getEmployee().getAddress());
      cell = row.createCell(2, CellType.STRING);
      cell.setCellValue(salary.getEmployee().getPhone());
      cell = row.createCell(3, CellType.STRING);
      cell.setCellValue(salary.getEmployee().getStartJob().format(DateTimeFormatter.ISO_DATE));
      cell = row.createCell(4, CellType.NUMERIC);
      cell.setCellValue(salary.getMonth());
      cell = row.createCell(5, CellType.NUMERIC);
      cell.setCellValue(salary.getYear());
      cell = row.createCell(6, CellType.NUMERIC);
      cell.setCellValue(salary.getPrice());
    }

    File file = new File("D:\\employee.xls");
    file.getParentFile().mkdirs();

    FileOutputStream outFile = new FileOutputStream(file);
    workbook.write(outFile);
//    update();
  }
}
