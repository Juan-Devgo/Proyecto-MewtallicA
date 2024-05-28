package co.uniquindio.proyectofinal.Model;

public class BuilderInstrumentoPercusion {
    private String nombre, codigo, marca;
    private double precio;
    private int cantidad;
    private Stock stock;
    private Gama gama;
    private CaracteristicasImplementacion implementacion;

    public BuilderInstrumentoPercusion nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BuilderInstrumentoPercusion codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
    public BuilderInstrumentoPercusion marca(String marca) {
        this.marca = marca;
        return this;
    }
    public BuilderInstrumentoPercusion precio(double precio) {
        this.precio = precio;
        return this;
    }

    public BuilderInstrumentoPercusion cantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public BuilderInstrumentoPercusion stock(Stock stock) {
        this.stock = stock;
        return this;
    }
    
    public BuilderInstrumentoPercusion gama(Gama gama) {
        this.gama = gama;
        return this;
    }

    public BuilderInstrumentoPercusion tipo(CaracteristicasImplementacion implementacion) {
        this.implementacion = implementacion;
        return this;
    }

    public InstrumentoPercusion build() {
        InstrumentoPercusion instrumento = new InstrumentoPercusion(nombre, codigo, marca, precio, cantidad, stock, gama, implementacion);
        return instrumento;
    }
}