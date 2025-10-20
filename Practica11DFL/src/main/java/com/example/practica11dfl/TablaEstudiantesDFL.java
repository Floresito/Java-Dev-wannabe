package com.example.practica11dfl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TablaEstudiantesDFL extends VBox {
    private TableView<EstudianteDFL> tabla;
    private ObservableList<EstudianteDFL> datos;

    public TablaEstudiantesDFL() {
        tabla = new TableView<>();
        datos = FXCollections.observableArrayList(EstudianteDFLDAO.cargar());

        TableColumn<EstudianteDFL, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));

        TableColumn<EstudianteDFL, String> colMatricula = new TableColumn<>("Matrícula");
        colMatricula.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getMatricula()));

        TableColumn<EstudianteDFL, Void> colAcciones = new TableColumn<>("Acciones");
        colAcciones.setCellFactory(param -> new TableCell<>() {
            private final Button btnEditar = new Button("Editar");
            private final Button btnEliminar = new Button("Eliminar");

            {
                btnEditar.getStyleClass().add("boton-editar");
                btnEliminar.getStyleClass().add("boton-eliminar");

                btnEditar.setOnAction(e -> {
                    EstudianteDFL est = getTableView().getItems().get(getIndex());
                    DialogoEditarDFL.mostrar(est, datos);
                });

                btnEliminar.setOnAction(e -> {
                    EstudianteDFL est = getTableView().getItems().get(getIndex());
                    EstudianteDFLDAO.eliminar(est);
                    datos.setAll(EstudianteDFLDAO.cargar());
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    HBox box = new HBox(5, btnEditar, btnEliminar);
                    setGraphic(box);
                }
            }
        });

        tabla.getColumns().addAll(colNombre, colMatricula, colAcciones);
        tabla.setItems(datos);
        getChildren().add(tabla);
    }
}
