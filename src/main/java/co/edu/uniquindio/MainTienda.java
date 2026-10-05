package co.edu.uniquindio;

import javax.swing.JOptionPane;

public class MainTienda {
    private static Tienda nuevaTienda;
    static void main() {

        nuevaTienda = new Tienda("Tienda del Norte", "12468", "Carrera 14 con calle 10 Norte");

        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Este es el menu de la Tienda:" +
                    "\n Seleccione una opcion:" +
                    "\n 1. Registrar Producto." +
                    "\n 2. Mostrar Producto" +
                    "\n 3. Buscar producto por id" +
                    "\n 4. Actualizar producto" +
                    "\n 5. Eliminar producto" +
                    "\n 0. Salir del sistema"));

            switch (option) {

                case 1:
                    solicitarInformacionProducto();
                    break;

                case 2:
                    String mensaje = nuevaTienda.mostrarListaProducto();
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;

                case 3:
                    solicitarIdProducto();
                    break;

                case 4:
                    solicitarActualizarProducto();
                    break;

                case 5:
                    solicitarEliminarProducto();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "El programa finalizo");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    break;
            }

        } while (option != 0);

    }

    //Registrar la informacion de las mascotas
    private static void solicitarInformacionProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String codigoUnico = JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
        String precio = (JOptionPane.showInputDialog("Ingrese el precio del producto: "));

        boolean resultado = nuevaTienda.registrarProducto(nombre, codigoUnico, precio);

        if (resultado) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "No se hizo el registro");
        }
    }



    //Mostrar la informacion de las mascotas
    private static void solicitarIdProducto() {
        String idProductoMostrar = JOptionPane.showInputDialog("Ingrese el ID de la producto que quiere ver: ");

        String resultado = nuevaTienda.mostrarProducto(idProductoMostrar);

        JOptionPane.showMessageDialog(null, resultado);

    }


    //Actualizar la informacion de las mascotas
    private static void solicitarActualizarProducto() {
        String idProductoActualizar = JOptionPane.showInputDialog("Ingrese el id de la producto que quiere actualizar: ");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String codigoUnico = JOptionPane.showInputDialog("Ingrese el código del producto: ");
        String precio = (JOptionPane.showInputDialog("Ingrese el precio del producto: "));

        boolean resultadoActualizacion = nuevaTienda.actualizarProducto(idProductoActualizar, nombre, codigoUnico, precio);

        if(resultadoActualizacion){
            JOptionPane.showMessageDialog(null, "Se modifico el prodcuto.");
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo modificar el producto.");
        }
    }



    //Eliminar la informacion de las mascotas
    private static void solicitarEliminarProducto() {
        String idProductoEliminar= JOptionPane.showInputDialog("Ingrese el id del producto que quiere eliminar: ");

        boolean respuestaEliminar = nuevaTienda.eliminarProducto(idProductoEliminar);

        if(respuestaEliminar){
            JOptionPane.showMessageDialog(null, "Se elimino el producto.");
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo eliminar el producto.");
        }
    }

}
