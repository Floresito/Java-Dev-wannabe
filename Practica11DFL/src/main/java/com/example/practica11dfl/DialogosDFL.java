package com.example.practica11dfl;

import javafx.scene.control.*;

public class DialogosDFL {
    public static void mostrar(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Aviso");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}