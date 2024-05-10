/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
/**
 *
 * @author User
 */
public class excelReader {
    public static double readEx(){
        File file = new File("Guia_Excel_331.xlsx");
        try {           
            InputStream input = new FileInputStream(file);
            XSSFWorkbook book = new XSSFWorkbook(input);
            XSSFSheet sheet = book.getSheetAt(1);
            Iterator<Row> rows = sheet.rowIterator();
            Iterator<Cell> columns = null;
            
            Row currentRow = sheet.getRow(0);
            Cell currentCell = null;
            columns = currentRow.cellIterator();
            
            /*while (columns.hasNext()){
                currentCell = columns.next();                
                if(currentCell.getCellType() == CellType.NUMERIC){
                    System.out.println(currentCell);
                    if(currentCell.getNumericCellValue() == 2025){
                        System.out.println("Año: "+ currentCell.getNumericCellValue());
                        break;
                    }
                }               
            }*/           
            while (rows.hasNext()){
                currentRow = rows.next();
                if(currentRow.getCell(3).toString().equals("00317035")){
                    double value = Double.parseDouble(currentRow.getCell(66).toString());
                    return value;
                }
            }

            input.close();
            book.close();           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
    /*public static void main(String args[]){
        double val = readEx();
        System.out.println(val);
    }*/
}
