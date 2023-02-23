

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class AdminDashboardController implements Initializable {

    @FXML
    private BorderPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButtonOnClick(ActionEvent event) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene loginScene = new Scene(loginParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(loginScene);
        regStg.show();
    }

    @FXML
    private void sendApplicationButtonOnClick(ActionEvent event) throws IOException {
        Parent sendAppParent = FXMLLoader.load(getClass().getResource("SendApplication.fxml"));
        Scene sendAppScene = new Scene(sendAppParent);
        Stage Stg = (Stage)root.getScene().getWindow(); 
        Stg.setScene(sendAppScene);
        Stg.show();
    }

    @FXML
    private void manageProductOnClick(ActionEvent event) throws IOException {
        Parent manageParent = FXMLLoader.load(getClass().getResource("ManageService.fxml"));
        Scene manageScene = new Scene(manageParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(manageScene);
        Stg.show();
    }

    @FXML
    private void manageInventoryOnClick(ActionEvent event) throws IOException {
        Parent manageParent = FXMLLoader.load(getClass().getResource("ManageInventory.fxml"));
        Scene manageScene = new Scene(manageParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(manageScene);
        Stg.show();
    }

    @FXML
    private void manageEmployeesOnClick(ActionEvent event) throws IOException {
        Parent manageParent = FXMLLoader.load(getClass().getResource("ManageEmployees.fxml"));
        Scene manageScene = new Scene(manageParent);
        Stage Stg = (Stage)root.getScene().getWindow(); 
        Stg.setScene(manageScene);
        Stg.show();
    }

    @FXML
    private void manageClientsOnClick(ActionEvent event) throws IOException {
        Parent manageParent = FXMLLoader.load(getClass().getResource("ManageClients.fxml"));
        Scene manageScene = new Scene(manageParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(manageScene);
        Stg.show();
    }

    @FXML
    private void checkTasksButtonOnClick(ActionEvent event) throws IOException {
        Parent checkTaskParent = FXMLLoader.load(getClass().getResource("CheckTasks.fxml"));
        Scene checkTaskScene = new Scene(checkTaskParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(checkTaskScene);
        Stg.show();
    }

    @FXML
    private void generateReportButtonOnClick(ActionEvent event) throws IOException {
        Parent reportParent = FXMLLoader.load(getClass().getResource("GenerateReport.fxml"));
        Scene reportScene = new Scene(reportParent);
        Stage Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        Stg.setScene(reportScene);
        Stg.show();
    }
    
}
