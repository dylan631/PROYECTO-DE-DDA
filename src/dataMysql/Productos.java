package dataMysql;

public class Productos {
    private String codigo;
    private String nombre;
    private String marca;
    private int cantidad;
    private float precioVenta;
    private float precioCompra;

    public Productos() {
    }

    public Productos(String codigo) {
        this.codigo = codigo;
    }

    public Productos(String nombre,String marca, int cantidad, float precioVenta, float precioCompra) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
    }
        
    public Productos(String codigo, String nombre, String marca,int cantidad, float precioVenta, float precioCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    
}
