package co.uniquindio.proyectofinal.Model;

public class FachadaBanco {
    private ServicioBanco servicioBanco;

    public FachadaBanco (){
        this.servicioBanco = new ServicioBanco();
    }

    public boolean realizarPago(String codigo){
        return servicioBanco.realizarPago(codigo);
    }

}