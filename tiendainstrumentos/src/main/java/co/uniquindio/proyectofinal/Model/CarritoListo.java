package co.uniquindio.proyectofinal.Model;

public class CarritoListo implements EstadoCarrito{
    private FachadaMetodoPago fachadaMetodoPago;
    private Carrito contexto;

    //Constructor
    public CarritoListo(Carrito contexto) {
        assert contexto != null;
        this.contexto = contexto;
        this.fachadaMetodoPago = new FachadaMetodoPago();
    }

    @Override
    public void realizarCompra(String identificacion) {
        if(fachadaMetodoPago.realizarPago(identificacion, contexto.getPrecioTotal())) {
            cambiarEstado(TipoCarrito.CARRITO_COMPRADO);
        }
    }

    @Override
    public void cambiarEstado (TipoCarrito estado){
        switch (estado) {
            case CARRITO_COMPRADO:
                contexto.cambiarEstado(new CarritoComprado(contexto));
                break;
        
            default:
                contexto.cambiarEstado(new EnCompra(contexto));
                break;
        }
    }
    
}