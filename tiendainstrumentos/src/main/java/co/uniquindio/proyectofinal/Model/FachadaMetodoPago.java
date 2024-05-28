package co.uniquindio.proyectofinal.Model;

public class FachadaMetodoPago{
    private PagoEstrategia pagoEstrategia;

    //Aquí hay que especificar al controller el tipo de pago que se va a efectuar antes de realizar la compra
    public void setPagoEstrategia(TipoPago tipoPago){
       switch (tipoPago) {
            case EFECTIVO:
                this.pagoEstrategia = new EstrategiaEfectivo();
                break;
        
            case TARJETA_CREDITO:
                this.pagoEstrategia = new EstrategiaTarjetaCredito();
       
        default:
            this.pagoEstrategia = new EstrategiaPuntos();
            break;
       }
    }

    public PagoEstrategia getPagoEstrategia() {
        return pagoEstrategia;
    }

    public boolean realizarPago(String identificacion, double precio){
        return pagoEstrategia.realizarPago(identificacion, precio);
    }
}