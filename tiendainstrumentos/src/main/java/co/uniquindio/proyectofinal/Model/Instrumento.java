package co.uniquindio.proyectofinal.Model;

public abstract class Instrumento extends Producto {

    protected Gama gama;
    protected CaracteristicasImplementacion implementacion;

    //Constructor
    public Instrumento(String nombre, String codigo, String marca, double precio, int cantidad, Stock stock, Gama gama, CaracteristicasImplementacion implementacion) {

        super(nombre, codigo, marca, precio, cantidad, stock);
        assert gama != null;
        assert implementacion != null;

        this.gama = gama;
        this.implementacion = implementacion;
    }

    public void setGama(String gamaString) {
        switch (gamaString.toLowerCase()) {
            case "alta":
                this.gama = Gama.ALTA;
                break;

            case "media":
                this.gama = Gama.MEDIA;
                break;
                
            default:
            this.gama = Gama.BAJA;
                break;
        }
    }

    public void setImplementacion(String tipoString) {
        switch (tipoString.toLowerCase()) {
            case "acustico":
                this.implementacion = new CaracteristicasAcustico();
                break;

            default:
            this.implementacion = new CaracteristicasElectrico();
                break;
        }
    }
    
    public Gama getGama() {
        return gama;
    }public CaracteristicasImplementacion getImplementacion() {
        return implementacion;
    }

}