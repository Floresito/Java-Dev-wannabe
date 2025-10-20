package com.example.practica11dfl;

import javafx.scene.control.TextField;
import org.controlsfx.validation.*;

public class CampoFloresValidado extends TextField {
    public CampoFloresValidado() {
        setPromptText("Solo letras");
        textProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]*$")) {
                setStyle("-fx-border-color: red;");
            } else {
                setStyle(null);
            }
        });
    }

    public boolean esValido() {
        return getText().matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$");
    }
}