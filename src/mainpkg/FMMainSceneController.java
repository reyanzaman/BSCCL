/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class FMMainSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<?> action2ComboBox;
    @FXML
    private TextArea employeeInfoTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nextButtonClick(ActionEvent event) {
    }

    @FXML
    private void budgetReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void revenueReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void expenseReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void applyForLeaveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void AllEmpInfoButtonOnClick(ActionEvent event) {
    }
    
}
