module com.example.javaqa7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaqa7 to javafx.fxml;
    exports com.example.javaqa7;
}