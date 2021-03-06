
package sistemas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {
  private Color colorPrincipal, colorPrincipalOscuro, colorSecundario;
  private Color colorGrisOscuro, colorGrisClaro;
  private Font fontTPrincipal, fontTitulo, fontSubtitulo;
  private Font fontMediana, fontLigera;
  private Cursor cMano;
  private Border bInferiorAzul, bInferiorGris, bGris, bAzul;
  private ImageIcon iCerrar, iMinimizar;

  static private RecursosService servicio;

  private RecursosService() {
    //generarFuentes();

    this.crearColores();
    this.crearFuentes();
    this.crearCursores();
    this.crearBordes();
    this.crearImagenes();
  }

  private void crearColores() {
    colorPrincipal = new Color(60, 78, 120);
    colorPrincipalOscuro = new Color(30, 48, 90);
    colorSecundario = new Color(151, 0, 158);
    colorGrisOscuro = new Color(80, 80, 80);
    colorGrisClaro = new Color(249, 246, 249);
  }

  private void crearFuentes() {
    fontTPrincipal = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
    fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 17);
    fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
    fontMediana = new Font("LuzSans-Book", Font.PLAIN, 15);
    fontLigera = new Font("LuzSans-Book", Font.PLAIN, 12);
  }

  private void crearCursores() { cMano = new Cursor(Cursor.HAND_CURSOR); }

  private void crearBordes() {
    bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
    bInferiorGris = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY);
    bGris = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true);
    bAzul = BorderFactory.createLineBorder(colorPrincipal, 2, true);
  }

  private void crearImagenes() {
    iCerrar = new ImageIcon("Clase11/resources/images/cerrar.png");
    iMinimizar = new ImageIcon("Clase11/resources/images/minimizar.png");
  }
 
  public Color getColorPrincipal() { return colorPrincipal; }

  public Color getColorPrincipalOscuro(){ return colorPrincipalOscuro; }

  public Border getBInferiorGris(){ return bInferiorGris; }
  
  public Color getColorGrisOscuro() { return colorGrisOscuro; }
  
  public Color getColorSecundario(){ return colorSecundario; }
  
  public Color getColorGrisClaro(){ return colorGrisClaro; }

  public Font getFontTPrincipal() { return fontTPrincipal; }

  public Font getFontTitulo() { return fontTitulo; }

  public Font getFontSubtitulo() { return fontSubtitulo; }

  public Font getFontMediana() { return fontMediana; }

  public Font getFontLigera(){ return fontLigera; }

  public Cursor getCMano() { return cMano; }

  public Border getBInferiorAzul() { return bInferiorAzul; }

  public Border getBGris(){ return bGris; }

  public Border getBAzul(){ return bAzul; }

  public ImageIcon getICerrar() { return iCerrar; }

  public ImageIcon getIMinimizar() { return iMinimizar; }

  public static RecursosService getService() {
    if (servicio == null) servicio = new RecursosService();
    return servicio;
  }
}