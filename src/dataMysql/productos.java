package dataMysql;

public class Ventas {
    private String codigo;
    private String nombre;
    private int cantidad;
    private float precioUnitario;
    private float precioFinal;

    public Ventas() {
    }

    public Ventas(String codigo) {
        this.codigo = codigo;
    }

    public Ventas(String nombre, int cantidad, float precioUnitario, float precioFinal) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioFinal = precioFinal;
    }
        
    public Ventas(String codigo, String nombre, int cantidad, float precioUnitario, float precioFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioFinal = precioFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

}
