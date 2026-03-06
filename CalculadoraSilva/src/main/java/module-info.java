module org.example.calculadorasilva {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculadorasilva to javafx.fxml;
    exports org.example.calculadorasilva;
}