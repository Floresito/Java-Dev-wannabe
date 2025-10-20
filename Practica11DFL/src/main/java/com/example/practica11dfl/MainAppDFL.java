package com.example.practica11dfl;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainAppDFL extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Estudiantes");
        MenuItem formulario = new MenuItem("Formulario CRUD");
        formulario.setOnAction(e -> root.setCenter(new FormularioEstudianteDFL()));
        MenuItem tabla = new MenuItem("Ver Tabla");
        tabla.setOnAction(e -> root.setCenter(new TablaEstudiantesDFL()));
        menu.getItems().addAll(formulario, tabla);

        menuBar.getMenus().add(menu);
        root.setTop(menuBar);

        Image imagen = new Image(getClass().getResource("/com/example/practica11dfl/recursos_Flores/Imagen_Principal.png").toExternalForm());
        ImageView vistaImagen = new ImageView(imagen);
        vistaImagen.getStyleClass().add("image-view");
        vistaImagen.setFitWidth(300);
        vistaImagen.setPreserveRatio(true);

        HBox contenedorImagen = new HBox(vistaImagen);
        contenedorImagen.setAlignment(Pos.CENTER);
        contenedorImagen.setStyle("-fx-padding: 10;");

        VBox encabezado = new VBox(menuBar, contenedorImagen);
        root.setTop(encabezado);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/com/example/practica11dfl/recursos_Flores/estilos_6033.css").toExternalForm());
        stage.setTitle("SistemaEstudiantilD6033");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}