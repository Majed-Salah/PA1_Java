module com.example.pa1_java {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pa1_java to javafx.fxml;
    exports com.example.pa1_java;
}