
package control;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author CHRISTIAN
 */
public class Pdf_generar {
    public void pdf_(JTable tabla, String titulo, String subtitulo, String subtitulo2){
        
        Document documento = new Document();  
        try {
            String ruta=System.getProperty("user.home");//Para saber el nombre del usuario de la maquina
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Downloads/Reporte.pdf"));
            Paragraph parrafo=new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add(titulo);
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add(titulo);
            documento.open();
            documento.add(parrafo);
            
            PdfPTable tabla_pdf = new PdfPTable(7);//Nos da las columnas
            tabla_pdf.setWidthPercentage(100);
            tabla_pdf.addCell(añadir ("Fecha"));
            tabla_pdf.addCell(añadir ("Codigo Producto"));
            tabla_pdf.addCell(añadir ("Nombre Producto"));
            tabla_pdf.addCell(añadir(subtitulo2));
            tabla_pdf.addCell(añadir(subtitulo));
            tabla_pdf.addCell(añadir ("Precio Unitario"));
            tabla_pdf.addCell(añadir("Precio Final"));          
            try {
                int fila = tabla.getRowCount(); //nos da la cantidad de fila
                for (int i = 0; i < fila; i++) {
                    añadir ((String)tabla.getValueAt(i, 1));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 1)));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 2)));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 3)));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 4)));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 5)));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 6)));
                    tabla_pdf.addCell(añadir ((String)tabla.getValueAt(i, 7)));   
                }
                documento.add(tabla_pdf);
            } catch (DocumentException e) {               
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado", "Advertencia", 1);          
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error", "Advertencia", 1);   
        }
    }
    public PdfPCell añadir (String texto){
        PdfPCell cell = new PdfPCell();
        cell.addElement(new Paragraph(texto)); 
        cell.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
        //cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        //cell.UseAscender = true;
        return cell;
    } 
}
