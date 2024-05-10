/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal.control;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

/**
 *
 * @author User
 */
public class PDFMaker {
    public static void generatePDF(double cost, double iva, double total){
        try{
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("Factura.pdf"));
        doc.open();
        
        Paragraph space = new Paragraph("\n\n");
        
        Paragraph title = new Paragraph("Factura \n\n", FontFactory.getFont("Arial", 22, Font.BOLD));
        Paragraph name = new Paragraph("Empresa 000000", FontFactory.getFont("Arial"));
        Paragraph dir = new Paragraph("Cll. ##, Crr. ##", FontFactory.getFont("Arial"));
        Paragraph ph = new Paragraph("000-00-00", FontFactory.getFont("Arial"));
        Paragraph nr = new Paragraph("Factura Nro. 0000001", FontFactory.getFont("Arial"));
        Paragraph date = new Paragraph("Fecha: ##-##-20## \n\n\n", FontFactory.getFont("Arial"));
        
        doc.add(title);
        doc.add(name);
        doc.add(dir);
        doc.add(ph);
        doc.add(nr);
        doc.add(date);
        
        PdfPTable table = new PdfPTable(3);
        table.addCell("Artículo");
        table.addCell("cantidad");
        table.addCell("Precio");
        table.addCell("Vehiculo");
        table.addCell("1");
        table.addCell(String.valueOf(cost));
        
        doc.add(table);
        doc.add(space);
        
        PdfPTable table2 = new PdfPTable(2);
        table2.addCell("IVA");
        table2.addCell(String.valueOf(iva));
        table2.addCell("Costo total");
        table2.addCell(String.valueOf(total));
        
        doc.add(table2);
        
        doc.close();
        }catch(DocumentException | java.io.FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
