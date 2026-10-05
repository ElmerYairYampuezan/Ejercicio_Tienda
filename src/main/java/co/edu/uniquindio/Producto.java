package co.edu.uniquindio;

public class Producto {

    //Atributos
    protected String nombre;
    protected String codigoUnico;
    protected String precio;
    protected EstadoProducto estadoProducto;

    //Constructor
    public Producto(String nombre, String codigoUnico, String precio) {
        this.nombre = nombre;
        this.codigoUnico = codigoUnico;
        this.precio = precio;
        estadoProducto = EstadoProducto.DISPONIBLE;
    }


    public String mostrarDescripcionDetallada () {
        return "Producto: " + nombre + " - " + codigoUnico + " - " + precio + " - " + estadoProducto;
    }



    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
}

