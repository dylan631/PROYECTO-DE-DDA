
package sistemas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class Eventos_graficos {
    public static RecursosService sRecursos=RecursosService.getService();   
    public static GraficosAvanzadosService sGraficosAvanzados = GraficosAvanzadosService.getService();
     
    public static void decorar_tabla_estandar(JTable tabla, JScrollPane fondo_tabla){
        tabla.setDefaultRenderer(Object.class, sGraficosAvanzados.devolverTablaPersonalizada(
            Color.WHITE, sRecursos.getColorGrisClaro() , sRecursos.getColorPrincipalOscuro(), 
            sRecursos.getColorGrisOscuro(), sRecursos.getFontLigera()
        ));    
        JTableHeader header = tabla.getTableHeader();
        header.setPreferredSize(new Dimension(100, 30));//Para el tamaño de la cabecera de la tabla 
        header.setDefaultRenderer(sGraficosAvanzados.devolverTablaPersonalizada(
                sRecursos.getColorPrincipal(), null , null, Color.WHITE, sRecursos.getFontLigera()
        ));     
        JPanel pCorner = new JPanel();
        pCorner.setBackground(sRecursos.getColorPrincipal());
        fondo_tabla.setCorner(JScrollPane.UPPER_RIGHT_CORNER, pCorner);  
        fondo_tabla.getViewport().setBackground(Color.WHITE);//Para quitar el fondo gris a la tabla 
        fondo_tabla.getVerticalScrollBar().setUI(
            sGraficosAvanzados.devolverScrollPersonalizado(
                7, 10, Color.WHITE, Color.GRAY, sRecursos.getColorGrisOscuro())
        );  
    }
    public static void decorar_combobox(JComboBox desplegable){
        desplegable.setBackground(new Color(255,255,255));
        desplegable.setUI(sGraficosAvanzados.devolverJComboBoxPersonalizado(new JButton(), 
            Color.WHITE, new Color(60,78,120), new Color(60,78,120), new Color(60,78,120), true)); 
    }

}
