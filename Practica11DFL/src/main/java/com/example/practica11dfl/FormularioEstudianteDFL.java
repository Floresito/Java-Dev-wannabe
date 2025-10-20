package com.example.practica11dfl;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class FormularioEstudianteDFL extends VBox {
    public FormularioEstudianteDFL() {
        CampoFloresValidado campoNombre = new CampoFloresValidado();
        CampoFloresValidado campoMatricula = new CampoFloresValidado();
        campoMatricula.setPromptText("Matrícula");

        campoNombre.setMaxWidth(300);
        campoMatricula.setMaxWidth(300);

        Boton31Estilizado guardar = new Boton31Estilizado("Guardar");

        VBox contenedorCampos = new VBox(10, campoNombre, campoMatricula, guardar);
        contenedorCampos.setAlignment(Pos.CENTER);

        guardar.setOnAction(e -> {
            String nombre = campoNombre.getText().trim();
            String matricula = campoMatricula.getText().trim();

            boolean nombreValido = campoNombre.esValido();
            boolean matriculaValida = matricula.matches("^\\d{7,}$");

            if (nombreValido && matriculaValida) {
                EstudianteDFL est = new EstudianteDFL(nombre, matricula);
                EstudianteDFLDAO.guardar(est);
                DialogosDFL.mostrar("Estudiante guardado correctamente.");
                campoNombre.clear();
                campoMatricula.clear();
            } else {
                DialogosDFL.mostrar("Datos inválidos. Verifica nombre (solo letras) y matrícula (7+ dígitos).");
            }
        });

        setAlignment(Pos.CENTER);
        setSpacing(20);
        getChildren().add(contenedorCampos);
    }
}
