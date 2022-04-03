package Ingreso;


import java.io.BufferedReader;
import java.io.PrintWriter;

public class Proveedor {
    private String nombre;
    private String codigo;
    private String ciudad;
    private String celular;

    public Proveedor(String nombre, String codigo, String ciudad, String celular) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

    void guardar(PrintWriter Escribe) {
        Escribe.println(nombre);
        Escribe.println(codigo);
        Escribe.println(ciudad);
        Escribe.println(celular);
    }

    public Proveedor cargar(BufferedReader Almacen) {
        String Nom;
        String Cod;
        String Ciud;
        String Cel;
        try{
            Nom = Almacen.readLine();
            Cod = Almacen.readLine();
            Ciud = Almacen.readLine();
            Cel = Almacen.readLine();
            return new Proveedor(Nom, Cod, Ciud, Cel);
        }catch (Exception e){
        }
        return null;
    }

    void setCel(String Cel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
