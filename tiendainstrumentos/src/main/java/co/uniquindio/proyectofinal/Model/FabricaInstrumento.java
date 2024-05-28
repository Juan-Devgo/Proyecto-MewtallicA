package co.uniquindio.proyectofinal.Model;

public interface FabricaInstrumento {
    public Instrumento fabricar(String nombre, String codigo, String marca, double precio, int cantidad, Stock stock, Gama gama, CaracteristicasImplementacion implementacion);
}