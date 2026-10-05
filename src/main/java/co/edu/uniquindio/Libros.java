package co.edu.uniquindio;

public class Libros extends Producto {
    //Atributos
    private String titulo;
    private String autor;
    private String numPaginas;

    //Constructor
    public Libros (String nombre, String codigoUnico, String precio, EstadoProducto estadoProducto, String titulo, String autor, String numPaginas ){
        super (nombre, codigoUnico, precio);
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String mostrarDescripcionDetallada() {
        return "Libros: " + nombre + " - " + codigoUnico + " - " + precio + " - " + estadoProducto + " - " + titulo + " - " + autor + " - " + numPaginas;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }
}

