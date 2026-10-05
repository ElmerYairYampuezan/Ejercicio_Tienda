package co.edu.uniquindio;

public class PrendasVestir extends Producto {
    //Atributos
    private String talla;
    private String color;
    private String tipoPrenda;

    //Constructor
    public PrendasVestir (String nombre, String codigoUnico, String precio, EstadoProducto estadoProducto, String talla, String color, String tipoPrenda){
        super (nombre,codigoUnico,precio);
        this.talla = talla;
        this.color = color;
        this.tipoPrenda = tipoPrenda;
    }

    @Override
    public String mostrarDescripcionDetallada() {
        return "Prendas de vestir: " + nombre + " - " + codigoUnico + " - " + precio + " - " + estadoProducto + " - " + talla + " - " + color + " - " + tipoPrenda;
    }

    //Getters and Setters
    public String getTalla (){
        return talla;
    }
    public void setTalla (String talla){
        this.talla = talla;
    }
    public String getColor (){
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }
}