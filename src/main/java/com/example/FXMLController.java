package com.example;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;
    private Label lblcont;
    private Integer cont = 0;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World! " + cont);
        cont++;
        lblcont.setText(cont.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
