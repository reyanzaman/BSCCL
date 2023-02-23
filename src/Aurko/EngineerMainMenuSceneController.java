package Aurko;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arko
 */
public class EngineerMainMenuSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkCableOnClick(ActionEvent event) throws IOException {
        
        Parent CheckCableParent = FXMLLoader.load(getClass().getResource("CheckCableScene.fxml"));
        Scene CheckCableScene = new Scene(CheckCableParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(CheckCableScene);
        stg2.show();
        
    }

    @FXML
    private void applyEarlyWageOnClick(ActionEvent event) throws IOException {
        
        Parent ApplyForAdvanceSalaryParent = FXMLLoader.load(getClass().getResource("ApplyForAdvanceSalaryScene.fxml"));
        Scene ApplyForAdvanceSalaryScene = new Scene(ApplyForAdvanceSalaryParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ApplyForAdvanceSalaryScene);
        stg2.show();
        
    }

    @FXML
    private void reportEquipmentOnClick(ActionEvent event) throws IOException {
        
        Parent ReportFaultyEquipmentParent = FXMLLoader.load(getClass().getResource("ReportFaultyEquipmentScene.fxml"));
        Scene ReportFaultyEquipmentScene = new Scene(ReportFaultyEquipmentParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ReportFaultyEquipmentScene);
        stg2.show();
        
    }

    @FXML
    private void requestEquipmentOnClick(ActionEvent event) throws IOException {
    
    
    Parent RequestNewEquipmentParent = FXMLLoader.load(getClass().getResource("RequestNewEquipmentScene.fxml"));
        Scene RequestNewEquipmentScene = new Scene(RequestNewEquipmentParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(RequestNewEquipmentScene);
        stg2.show();
    
    }
    
    
    @FXML
    private void applyLeaveOnClick(ActionEvent event) throws IOException {
        
        Parent ApplyForLeaveParent = FXMLLoader.load(getClass().getResource("ApplyForLeaveScene.fxml"));
        Scene ApplyForLeaveScene = new Scene(ApplyForLeaveParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ApplyForLeaveScene);
        stg2.show();
        
    }


    @FXML
    private void assignTaskOnClick(ActionEvent event) throws IOException {
        
        Parent AssignTaskParent = FXMLLoader.load(getClass().getResource("AssignTaskScene.fxml"));
        Scene AssignTaskScene = new Scene(AssignTaskParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(AssignTaskScene);
        stg2.show();
        
    }

    @FXML
    private void logOutOnClick(ActionEvent event) {
    }

    
}
