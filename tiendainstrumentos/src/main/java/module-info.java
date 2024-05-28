module co.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.proyectofinal to javafx.fxml;
    exports co.uniquindio.proyectofinal;

    opens co.uniquindio.proyectofinal.Controller;
    exports co.uniquindio.proyectofinal.Controller;
}
