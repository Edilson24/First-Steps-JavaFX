module org.example.costimernormal1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.costimernormal1 to javafx.fxml;
    exports org.example.costimernormal1;
}