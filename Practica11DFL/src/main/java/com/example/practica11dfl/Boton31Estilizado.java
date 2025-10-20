package com.example.practica11dfl;

import javafx.scene.control.Button;
import org.kordamp.ikonli.javafx.FontIcon;

public class Boton31Estilizado extends Button {
    public Boton31Estilizado(String texto) {
        super(texto);
        //setGraphic(new FontIcon("ent-check"));
        getStyleClass().add("boton-31");
    }
}