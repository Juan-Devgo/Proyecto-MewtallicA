package co.uniquindio.proyectofinal.Model;

public class CambiarPrecio implements CommandActualizar{

    private ProductoDAO recibidor;

//Cosntructor
    public CambiarPrecio() {
        this.recibidor = ProductoDAOImplementacion.getInstancia();
    }

// metodo para actualizar la cantidad de un producto
    @Override
    public void realizarCambio(String cambio, String codigo){
        Producto productoActualizado = recibidor.getProducto(codigo);
        productoActualizado.setPrecio(cambio);
        recibidor.actualizarProducto(productoActualizado);
        }
    }
