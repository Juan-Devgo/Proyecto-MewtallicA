package co.uniquindio.proyectofinal.Model;

public class BuilderInstrumentoViento {
    private String nombre, codigo, marca;
    private double precio;
    private int cantidad;
    private Stock stock;
    private Gama gama;
    private CaracteristicasImplementacion implementacion;

    public BuilderInstrumentoViento nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BuilderInstrumentoViento codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
    public BuilderInstrumentoViento marca(String marca) {
        this.marca = marca;
        return this;
    }
    public BuilderInstrumentoViento precio(double precio) {
        this.precio = precio;
        return this;
    }
    
    public BuilderInstrumentoViento cantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public BuilderInstrumentoViento stock(Stock stock) {
        this.stock = stock;
        return this;
    }
    
    public BuilderInstrumentoViento gama(Gama gama) {
        this.gama = gama;
        return this;
    }

    public BuilderInstrumentoViento tipo(CaracteristicasImplementacion implementacion) {
        this.implementacion = implementacion;
        return this;
    }

    public InstrumentoViento build() {
        InstrumentoViento instrumento = new InstrumentoViento(nombre, codigo, marca, precio, cantidad, stock, gama, implementacion);
        return instrumento;
    }
    
}