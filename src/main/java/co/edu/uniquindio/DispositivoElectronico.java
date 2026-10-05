package co.edu.uniquindio;

public class DispositivoElectronico extends Producto {
    //Atributos
    private String marca;
    private String modelo;
    private String tiempo;

    //Constructor
    public DispositivoElectronico (String nombre, String codigoUnico, String precio, EstadoProducto estadoProducto, String marca, String modelo, String tiempo){
        super(nombre, codigoUnico, precio);
        this.marca = marca;
        this.modelo = modelo;
        this.tiempo = tiempo;
    }

    @Override
    public String mostrarDescripcionDetallada() {
        return "Dispositivos Electronicos: " + nombre + " - " + codigoUnico + " - " + precio + " - " + estadoProducto + " - " + marca + " - " + modelo + " - " + tiempo;
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}

