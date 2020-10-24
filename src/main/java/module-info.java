module com.mycompany.bai1bmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bai1bmi to javafx.fxml;
    exports com.mycompany.bai1bmi;
}
