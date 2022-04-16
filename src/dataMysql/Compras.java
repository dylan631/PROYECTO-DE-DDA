package dataMysql;

public class Compras {
    private int nSerie;
    private String fecha;
    private String codigo;
    private String nombre;
    private String codigoProveedor;
    private int cantidadCompra;
    private float precioUnitario;
    private float precioFinal;

    public Compras() {
    }

    public Compras(int nSerie) {
        this.nSerie = nSerie;
    }

    public Compras(String fecha, String codigo, String nombre, String codigoProveedor, int cantidadCompra, float precioUnitario, float precioFinal) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoProveedor = codigoProveedor;
        this.cantidadCompra = cantidadCompra;
        this.precioUnitario = precioUnitario;
        this.precioFinal = precioFinal;
    }

    public Compras(int nSerie, String fecha, String codigo, String nombre, String codigoProveedor, int cantidadCompra, float precioUnitario, float precioFinal) {
        this.nSerie = nSerie;
        this.fecha = fecha;
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoProveedor = codigoProveedor;
        this.cantidadCompra = cantidadCompra;
        this.precioUnitario = precioUnitario;
        this.precioFinal = precioFinal;
    }

    public int getnSerie() {
        return nSerie;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
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
