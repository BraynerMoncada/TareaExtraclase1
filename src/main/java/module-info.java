module com.example.tarea_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea_1 to javafx.fxml;
    exports com.example.tarea_1;
}