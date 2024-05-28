package co.uniquindio.proyectofinal.Model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    // Lista de productos en el carrito
    private List<Producto> productos;
    // Precio total del carrito
    private Double precioTotal;
    // Estado actual del carrito
    private EstadoCarrito estado;

    // Constructor
    public Carrito() {
        // Inicializa la lista de productos como una nueva lista vacía
        productos = new ArrayList<>();
        // Inicializa el estado del carrito como "EnCompra"
        incializarEstado();
    }

    // Método para inicializar el estado del carrito
    public void incializarEstado() {
        // Crea un nuevo estado "EnCompra" y lo asigna al carrito
        this.estado = new EnCompra(this);
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del carrito
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para calcular el precio total de los productos en el carrito
    public Double obtenerTotal() {
        // Obtiene el subtotal de los productos
        Double precio = obtenerSubtotal();
        // Aplica un posible descuento si corresponde
        if (aplicaDescuento()) {
            precio = aplicarDescuento(precio);
        }
        return precio;
    }

    // Método para calcular el subtotal de los productos en el carrito
    public Double obtenerSubtotal() {
        precioTotal = 0.0;
        // Itera sobre todos los productos y suma sus precios
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    // Método para verificar si se aplica un descuento al precio total
    public boolean aplicaDescuento() {
        boolean aplicaDescuento = false;
        // Verifica si el subtotal es mayor a 300000 para aplicar un descuento
        if (obtenerSubtotal() > 300000) {
            aplicaDescuento = true;
        }
        return aplicaDescuento;
    }

    // Método para aplicar un descuento al precio total
    public Double aplicarDescuento(Double precio) {
        return precio * 0.2; // Aplica un descuento del 20%
    }

    // Método para cambiar el estado del carrito
    public void cambiarEstado(EstadoCarrito estado) {
        assert estado != null;
        this.estado = estado;
    }

    // Métodos getter para obtener información sobre el carrito
    public List<Producto> getProductos() {
        return productos;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public EstadoCarrito getEstado() {
        return estado;
    }
}