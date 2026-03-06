module org.example.costumercal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.costumercal to javafx.fxml;
    exports org.example.costumercal;
}