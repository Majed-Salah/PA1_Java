module com.example.pa1_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ucdenver.pa1_java to javafx.fxml;
    exports edu.ucdenver.pa1_java;
}