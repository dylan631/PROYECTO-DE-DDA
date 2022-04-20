
package sistemas;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.table.DefaultTableCellRenderer;

public class GraficosAvanzadosService {
  private static GraficosAvanzadosService servicio;


  private GraficosAvanzadosService() {}

  public DefaultTableCellRenderer devolverTablaPersonalizada(
    Color colorPrincipal, Color colorSecundario, Color colorSeleccion, Color colorFuente, Font fuente
  ) {
    return new DefaultTableCellRenderer() {
      private static final long serialVersionUID = -8946942932242371111L;

      @Override
      public Component getTableCellRendererComponent(
        JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column
      ) {
        JLabel celda = (JLabel) super.getTableCellRendererComponent(
          table, value, isSelected, hasFocus, row, column
        );
        celda.setOpaque(true);
        celda.setFont(fuente);
        celda.setForeground(colorFuente);
        celda.setHorizontalAlignment(SwingConstants.CENTER);
        if (row % 2 != 0) celda.setBackground(colorPrincipal); 
        else celda.setBackground(colorSecundario);
        if (isSelected) {
          celda.setBackground(colorSeleccion);
          celda.setForeground(Color.WHITE);
        }      
        return celda;
      }
    };
  }

  public BasicScrollBarUI devolverScrollPersonalizado(
    int grosor, int radio, Color colorFondo, Color colorBarraNormal, Color colorBarraArrastrada
  ) {
    return new BasicScrollBarUI() {
      private Dimension d = new Dimension();

      @Override
      protected JButton createDecreaseButton(int orientation) {
        JButton boton = new JButton();
        boton.setPreferredSize(d);
        return boton;
      }

      @Override
      protected JButton createIncreaseButton(int orientation) {
        JButton boton = new JButton();
        boton.setPreferredSize(d);
        return boton;
      }

      @Override
      protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
        g.setColor(colorFondo);
        g.fillRect(r.x, r.y, r.width, r.height);
      }

      @Override
      protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON
        );
        JScrollBar sb = (JScrollBar) c;
        if (!sb.isEnabled()) return; 
        else if (isDragging) g2.setPaint(colorBarraArrastrada); 
        else if (isThumbRollover()) g2.setPaint(colorBarraNormal); 
        else g2.setPaint(colorBarraNormal);

        if (r.width < r.height) g2.fillRoundRect(
          (r.width - grosor) / 2, r.y, grosor, r.height, radio, radio
        ); 
        else 
          g2.fillRoundRect(
            r.x, (r.height - grosor) / 2, r.width, grosor, radio, radio
          );
      }
    };
  }

  public BasicComboBoxUI devolverJComboBoxPersonalizado(
    JButton boton, Color colorBorde, Color colorFondo, Color colorSeleccionMenu, Color colorFuenteMenu, boolean esSolido
  ) {
    return new BasicComboBoxUI() {

      @Override
      protected JButton createArrowButton() {
        boton.setText("V");
        boton.setForeground(new Color(60,78,120));     
        boton.setBackground(Color.WHITE);
        return boton;
      }

      @Override
      public void paintCurrentValueBackground(
        Graphics g, Rectangle bounds, boolean hasFocus
      ) {
        g.setColor(colorBorde);
        g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height - 1);
        g.drawRect(
          bounds.x + 1, bounds.y + 1, bounds.width - 2, bounds.height - 3
        );
        if (esSolido) {
          g.setColor(colorFondo);
          g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
      }

      @Override
      protected ListCellRenderer<Object> createRenderer() {
        return new DefaultListCellRenderer() {
          private static final long serialVersionUID = 1L;

          @Override
          public Component getListCellRendererComponent(
            JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus
          ) {
            super.getListCellRendererComponent(
              list, value, index, isSelected, cellHasFocus
            );
            this.setHorizontalAlignment(SwingConstants.CENTER);
            list.setSelectionBackground(colorSeleccionMenu);
            list.setSelectionForeground(Color.WHITE);
            
            if (!isSelected) {
                this.setForeground(colorFuenteMenu);   
            }
            return this;
          }
        };
      }
        @Override
        protected ComboPopup createPopup(){
            BasicComboPopup pop = new BasicComboPopup(comboBox) {
                @Override
                protected JScrollPane createScroller() {        
                    list.setFixedCellHeight(25);
                    JScrollPane scroll = new JScrollPane(list);
                    scroll.getVerticalScrollBar().setUI(
                        devolverScrollPersonalizado(
                            7, 10, Color.WHITE, Color.GRAY, new Color(80,80,80))
                    ); 
                    return scroll;
                }
            };
            pop.setBorder(new LineBorder(new Color(200, 200, 200), 1));
            return pop;
        }
    };
  }


  public static GraficosAvanzadosService getService() {
    if (servicio == null) servicio = new GraficosAvanzadosService();
    return servicio;
  }
}