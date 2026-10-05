package co.edu.uniquindio;

public class Tienda {
    private String nombre;
    private String nitTienda;
    private String direccion;

    private Producto [] listProducto;

    public Tienda(String nombre, String nitTienda, String direccion) {
        this.nombre = nombre;
        this.nitTienda = nitTienda;
        this.direccion = direccion;
        listProducto = new Producto[15];
    }

    //Metodos logicos
    //C - Crear/Registrar/Guardar una mascota
    public boolean registrarProducto(String nombre, String codigoUnico, String precio) {

        Producto nuevoProducto = new Producto ( nombre,"P-" + codigoUnico, precio );

        if (encontrarIndexProducto (nuevoProducto.getCodigoUnico()) == -1) {
            for (int i = 0; i < listProducto.length; i++) {
                if (listProducto[i] == null) {
                    listProducto[i] = nuevoProducto;
                    return true;
                }
            }
        }

        return false;
    }

    //R - Mostrar todas las mascotas
    public String mostrarListaProducto() {
        String mensaje = "Lista de productos:\n";

        for (int i = 0; i < listProducto.length; i++) {
            if (listProducto[i] != null) {
                mensaje += "\nNombre: " + listProducto[i].getNombre() +
                        "\nCódigo Unico: " + listProducto[i].getCodigoUnico() +
                        "\nPrecio: " + listProducto[i].getPrecio() +
                        "\nEstado Producto: " + listProducto[i].getEstadoProducto();
            }

        }

        return mensaje;
    }

    //R - Leer/Mostrar/Imprimir una mascota
    public String mostrarProducto(String idProductoMostrar) {
        String mensaje = "";
        int index = encontrarIndexProducto(idProductoMostrar);

        if (index != -1) {
            Producto productoEncontrado = listProducto[index];

            mensaje = "Producto encontrado:\n" +
                    "\nNombre: " + productoEncontrado.getNombre() +
                    "\nCódigo Unico: " + productoEncontrado.getCodigoUnico() +
                    "\nPrecio: " + productoEncontrado.getPrecio() +
                    "\nEstado Producto: " + productoEncontrado.getEstadoProducto();
        } else {
            mensaje = "El producto no se encuentra en la lista.";
        }

        return mensaje;
    }


    //U - Actualizar/Modificar/Cambiar una mascota
    public boolean actualizarProducto (String idProductoActualizar, String nombre, String codigoUnico, String precio) {
        boolean respuesta = false;
        int index = encontrarIndexProducto(idProductoActualizar);

        if (index != -1) {
            listProducto[index].setNombre(nombre);
            listProducto[index].setCodigoUnico(codigoUnico);
            listProducto[index].setPrecio(precio);

            respuesta = true;
        }

        return respuesta;
    }

    //D - Eliminar/Quitar/Borrar una mascota.
    public boolean eliminarProducto(String idProductoEliminar) {
        boolean respuesta = false;
        int index = encontrarIndexProducto(idProductoEliminar);

        if(index != -1){
            listProducto[index] = null;
            respuesta = true;
        }

        return respuesta;
    }

    public int encontrarIndexProducto(String idMascotaBuscar) {

        for (int i = 0; i < listProducto.length; i++) {
            if (listProducto[i] != null && listProducto[i].getCodigoUnico().equals(idMascotaBuscar)) {
                return i;
            }
        }

        return -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNitTienda() {
        return nitTienda;
    }

    public void setNitTienda(String nitTienda) {
        this.nitTienda = nitTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
