module com.example.cobaia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cobaia to javafx.fxml;
    exports com.example.cobaia;
}