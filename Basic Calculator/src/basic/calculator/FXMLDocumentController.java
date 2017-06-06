/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField displayField;
    @FXML
    private Button digitZeroButton;
    @FXML
    private Button dotButton;
    @FXML
    private Button digitOneButton;
    @FXML
    private Button digitTwoButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        displayField.requestFocus();
    }

    @FXML
    private void handleDigitOneAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "1";

        displayField.setText(newText);
        displayField.requestFocus();
    }

    @FXML
    private void handleDigitTwoAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "2";

        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

}
