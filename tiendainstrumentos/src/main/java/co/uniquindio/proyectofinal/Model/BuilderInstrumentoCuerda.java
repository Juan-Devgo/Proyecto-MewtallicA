package co.uniquindio.proyectofinal.Model;

public class BuilderInstrumentoCuerda {
    private String nombre, codigo, marca;
    private double precio;
    private int cantidad;
    private Stock stock;
    private Gama gama;
    private CaracteristicasImplementacion implementacion;

    public BuilderInstrumentoCuerda nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BuilderInstrumentoCuerda codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
    public BuilderInstrumentoCuerda marca(String marca) {
        this.marca = marca;
        return this;
    }
    public BuilderInstrumentoCuerda precio(double precio) {
        this.precio = precio;
        return this;
    }

    public BuilderInstrumentoCuerda cantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public BuilderInstrumentoCuerda stock(Stock stock) {
        this.stock = stock;
        return this;
    }
    
    public BuilderInstrumentoCuerda gama(Gama gama) {
        this.gama = gama;
        return this;
    }

    public BuilderInstrumentoCuerda tipo(CaracteristicasImplementacion implementacion) {
        this.implementacion = implementacion;
        return this;
    }

    public InstrumentoCuerda build() {
        InstrumentoCuerda instrumento = new InstrumentoCuerda(nombre, codigo, marca, precio, cantidad, stock, gama, implementacion);
        return instrumento;
    }
}