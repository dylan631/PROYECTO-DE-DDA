package dataMysql;

public class ObjetoTransaccion {
    java.lang.String fecha;
    int cantidad;
    Float precioUnitario;
    java.lang.String tipoTransaccion;

    public ObjetoTransaccion(String fecha, int cantidad, Float precioUnitario, String tipoTransaccion) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.tipoTransaccion = tipoTransaccion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }
    
}
