package co.uniquindio.proyectofinal.Model;

public class FabricaInstrumentoViento implements FabricaInstrumento {
    
    private BuilderInstrumentoViento builder;

    //Constructor
    public FabricaInstrumentoViento(BuilderInstrumentoViento builder) {
        assert builder != null;
        this.builder = builder;
    }

    //Método fabricar
    @Override
    public Instrumento fabricar(String nombre, String codigo, String marca, double precio, int cantidad, Stock stock, Gama gama, CaracteristicasImplementacion implementacion) {
        return builder.nombre(nombre).codigo(codigo).marca(marca).precio(precio).cantidad(cantidad).stock(stock).gama(gama).tipo(implementacion).build();        
    }

    public BuilderInstrumentoViento getBuilder() {
        return builder;
    }
}