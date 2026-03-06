module org.example.joycecientifica {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.joycecientifica to javafx.fxml;
    exports org.example.joycecientifica;
}