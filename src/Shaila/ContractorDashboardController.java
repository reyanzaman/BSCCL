package Shaila;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class ContractorDashboardController implements Initializable {

    @FXML
    private Button clientButton;
    @FXML
    private Button ReportButton;
    @FXML
    private Button TaskButton;
    @FXML
    private Label ContractorName;
    @FXML
    private Label ContractorID;
    @FXML
    private Label contractorGroup;
    @FXML
    private Button scheduleMeeting;
    @FXML
    private ComboBox<?> equipmentComboBox;
    @FXML
    private ComboBox<?> expenseComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clientButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ReportBtnOnClick(ActionEvent event) {
    }

    @FXML
    private void taskBtnOnClick(ActionEvent event) {
    }

    @FXML
    private void applyForLeaveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void scheduleMeetingButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void equipmentComboBoxisUpdated(ActionEvent event) {
    }

    @FXML
    private void expenseComboBoxisUpdated(ActionEvent event) {
    }
    
}
