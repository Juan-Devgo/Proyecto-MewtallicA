package co.uniquindio.proyectofinal.Model;

public class Vendedor extends Usuario {
    
    private final boolean acceso;
    private Carrito carrito;
    
    public Vendedor(String nombre, String identificacion, String contacto, String email){
        super (nombre, identificacion, contacto, email);

        assert nombre != null;
        assert identificacion != null;
        assert contacto != null;
        assert email != null;
        assert carrito != null;
        
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
        this.email = email;
        this.acceso = false;
        super.servicioActualizar = new ProxyActualizar(acceso);
        this.carrito = new Carrito();
    }

    public void realizarCompra() {

    }

    public void agregarProducto(Producto producto) {
        assert producto != null;
        carrito.agregarProducto(producto);
    }

    public void eliminarProducto(Producto producto) {
        assert producto != null;
        carrito.eliminarProducto(producto);
    }

    public boolean aplicaDescuento() {
        return carrito.aplicaDescuento();
    }

    public double obtenerTotal() {
        return carrito.obtenerTotal();
    }

    public boolean getAcceso() {
        return acceso;
    }
}