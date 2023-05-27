module com.example.viking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viking to javafx.fxml;
    exports com.example.viking;
}