package co.uniquindio.proyectofinal.Model;

public class EstrategiaTarjetaCredito implements PagoEstrategia{
    private FachadaBanco fachadaBanco;

    public EstrategiaTarjetaCredito(){
        this.fachadaBanco = new FachadaBanco();
    }
    
    @Override
    public boolean realizarPago(String identificacion, double precio) {
        return fachadaBanco.realizarPago(identificacion);
    }
}
