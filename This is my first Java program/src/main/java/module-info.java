module com.example.thisismyfirstjavaprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thisismyfirstjavaprogram to javafx.fxml;
    exports com.example.thisismyfirstjavaprogram;
}