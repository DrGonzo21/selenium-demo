module com.example.freeworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.freeworld to javafx.fxml;
    exports com.example.freeworld;
}