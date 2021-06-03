package pkg006helloworldjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author bruno
 */
public class FXMLDocumentController implements Initializable {
    //Logica com ações dos botões
    @FXML
    //Identificação dos botões
    private Label lblMessage;
    private Button btnClick;
    
    @FXML   //Ações do botão quando clicado
    private void clickButton(ActionEvent event) {
        lblMessage.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
