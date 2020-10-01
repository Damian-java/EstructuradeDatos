package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label lblTitulo;
    public void evento1(ActionEvent event){
        int dias = Integer.parseInt(txtedad.getText())*365;
        lblTitulo.setText("Has vivido " +dias+ " dias");
    }
}
