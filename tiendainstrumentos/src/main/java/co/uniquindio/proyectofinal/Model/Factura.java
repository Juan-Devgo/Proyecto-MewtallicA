package co.uniquindio.proyectofinal.Model;

import java.util.List;

public class Factura {
    private final String clienteIdentificacion;
    private final List<Producto> productosComprados;

    public Factura(String clienteIndentificacion, List<Producto> productosComprados) {
        assert clienteIndentificacion != null && !clienteIndentificacion.isBlank();
        assert productosComprados != null && productosComprados.size() > 0;

        this.clienteIdentificacion = clienteIndentificacion;
        this.productosComprados = productosComprados;
    }

    public String getClienteIdentificacion() {
        return clienteIdentificacion;
    }public List<Producto> getProductosComprados() {
        return productosComprados;
    }
}
