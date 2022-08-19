package com.example.tarea_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 400);
        stage.setTitle("CSV Reading");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch();

        /**
         * Se genera un estudiante de tipo A al crear un nuevo objeto de la clase EstudianteTipoA.
         */
        EstudianteTipoA estudiante = new EstudianteTipoA(2021011317, "Brayner Moncada Abellan", "moncada@estudiante.cr", 87886540, "MoonShoot", "TipoA", 65.3, 26.3, 15.3, 60.5, 96.3, 54.1);
        estudiante.mostrarDatos();


        //Crear estudiante tipo B
        //estudianteTipoB estudiante2 = new EstudianteTipoB(2021011317, "Brayner Moncada Abellan", "moncada@estudiante.cr", 87886540, "MoonShoot", "TipoB", 65.3, 26.3, 15.3, 60.5, 96.3, 54.1);
        //System.out.println("-----------------------------------");
        //estudiante2.mostrarDatos2();

    }
}