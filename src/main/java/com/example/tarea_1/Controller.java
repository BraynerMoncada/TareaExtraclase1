package com.example.tarea_1;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class Controller{

        @FXML
        void getAbrir(MouseEvent event) {
            FileChooser filechooser = new FileChooser();
            filechooser.setTitle("Buscando Archivo");
            filechooser.showOpenDialog(null);


        }
    }


