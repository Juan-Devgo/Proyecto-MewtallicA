package co.uniquindio.proyectofinal.Controller;

import java.io.IOException;

import co.uniquindio.proyectofinal.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}