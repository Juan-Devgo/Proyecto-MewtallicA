package co.uniquindio.proyectofinal.Model;

public class FabricaInstrumentoCuerda implements FabricaInstrumento {

    private BuilderInstrumentoCuerda builder;

    //Constructor
    public FabricaInstrumentoCuerda(BuilderInstrumentoCuerda builder) {
        assert builder != null;
        this.builder = builder;
    }

    //Método Fabricar
    @Override
    public Instrumento fabricar(String nombre, String codigo, String marca, double precio, int cantidad, Stock stock, Gama gama, CaracteristicasImplementacion implementacion) {
        return builder.nombre(nombre).codigo(codigo).marca(marca).precio(precio).cantidad(cantidad).stock(stock).gama(gama).tipo(implementacion).build();        
    }

    public BuilderInstrumentoCuerda getBuilder() {
        return builder;
    }
}