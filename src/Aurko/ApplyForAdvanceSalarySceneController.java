/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aurko;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Arko
 */
public class ApplyForAdvanceSalarySceneController implements Initializable {

    @FXML
    private TextField employeeIdTextField;
    @FXML
    private TextArea earlyWageTextField;
    @FXML
    private TextField employeeNameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void applyEarlyWageOnClick(ActionEvent event) {
    }

    @FXML
    private void returnOnClick(ActionEvent event) {
    }
    
}
