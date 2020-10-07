package sample;
import Conversiones.conversion;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label lblTitulo;
    public void evento1(ActionEvent event){
        conversion td=new conversion();
        int numero = Integer.parseInt(txtedad.getText());
        String res=td.binario(numero);
        lblTitulo.setText(res);
    }
}
