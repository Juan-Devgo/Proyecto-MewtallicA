package co.uniquindio.proyectofinal.Controller;

import co.uniquindio.proyectofinal.Model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class RegistrarUsuarioController {

    @FXML
    private Button btAceptar;

    @FXML
    private Button btCancelar;

    @FXML
    private Label consola;

    @FXML
    private Label lbRegistrarUsuario;

    @FXML
    private MenuButton mbtSeleccionarRol;

    @FXML
    private TextField txContacto;

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txIdentificación;

    @FXML
    private TextField txNombre;

    @FXML
    void cancelar(ActionEvent event) {
        txEmail.setText("");
        txContacto.setText("");
        txEmail.setText(""); 
        txIdentificación.setText("");
        txNombre.setText("");
    }

    @FXML
    void registrar(ActionEvent event) {
        String contacto = txContacto.getText();
        String email = txEmail.getText(); 
        String identificacion = txIdentificación.getText();

        mbtSeleccionarRol.get
        Usuario usuario = new Usuario();
    }

    @FXML
    void seleccionarRol(ActionEvent event) {
        
    }

}