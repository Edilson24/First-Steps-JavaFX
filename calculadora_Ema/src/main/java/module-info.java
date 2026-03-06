module org.example.calculadora_ema {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens org.example.calculadora_ema to javafx.fxml;
    exports org.example.calculadora_ema;
}