package com.example.practica11dfl;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.collections.ObservableList;

public class DialogoEditarDFL {
    public static void mostrar(EstudianteDFL est, ObservableList<EstudianteDFL> datos) {
        Dialog<Void> dialog = new Dialog<>();
        dialog.setTitle("Editar estudiante");

        TextField campoNombre = new TextField(est.getNombre());
        TextField campoMatricula = new TextField(est.getMatricula());

        VBox contenido = new VBox(10, new Label("Nombre:"), campoNombre, new Label("Matrícula:"), campoMatricula);
        dialog.getDialogPane().setContent(contenido);
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        dialog.setResultConverter(btn -> {
            if (btn == ButtonType.OK) {
                String nuevoNombre = campoNombre.getText().trim();
                String nuevaMatricula = campoMatricula.getText().trim();

                if (nuevoNombre.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$") && nuevaMatricula.matches("^\\d{7,}$")) {
                    EstudianteDFLDAO.editar(est, nuevoNombre, nuevaMatricula);
                    datos.setAll(EstudianteDFLDAO.cargar());
                } else {
                    DialogosDFL.mostrar("Datos inválidos. Verifica nombre y matrícula.");
                }
            }
            return null;
        });

        dialog.showAndWait();
    }
}
