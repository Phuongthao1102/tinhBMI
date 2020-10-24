package com.mycompany.bai1bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtCao;
    @FXML private TextField txtNang;
    
    public void tinhBMI(ActionEvent event) {
        double cao = Double.parseDouble(this.txtCao.getText());
        double nang = Double.parseDouble(this.txtNang.getText());
        double bmi = nang / Math.pow(cao, 2);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(String.valueOf(bmi));
        alert.show();
    }
}
