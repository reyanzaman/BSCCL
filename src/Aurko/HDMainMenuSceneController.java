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
public class HDMainMenuSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewCustomerCompaintsOnClick(ActionEvent event) throws IOException {
        
        Parent ViewCustomerComplaintParent = FXMLLoader.load(getClass().getResource("ViewCustomerComplaintScene.fxml"));
        Scene ViewCustomerComplaintScene = new Scene(ViewCustomerComplaintParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ViewCustomerComplaintScene);
        stg2.show();
        
    }

    @FXML
    private void forwardBusinessProposalOnClick(ActionEvent event) throws IOException {
        
         Parent ForwardBusinessProposalToGmParent = FXMLLoader.load(getClass().getResource("ForwardBusinessProposalToGmScene.fxml"));
        Scene ForwardBusinessProposalToGmScene = new Scene(ForwardBusinessProposalToGmParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ForwardBusinessProposalToGmScene);
        stg2.show();
        
    }

    private void requestEarlyWageOnClick(ActionEvent event) throws IOException {
        
        Parent HelpDeskApplyForAdvanceSalaryParent = FXMLLoader.load(getClass().getResource("HelpDeskApplyForAdvanceSalaryScene.fxml"));
        Scene HelpDeskApplyForAdvanceSalaryScene = new Scene(HelpDeskApplyForAdvanceSalaryParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(HelpDeskApplyForAdvanceSalaryScene);
        stg2.show();
        
    }

    private void applyForLeaveOnClick(ActionEvent event) throws IOException {
        
        Parent HelpDeskApplyForLeaveParent = FXMLLoader.load(getClass().getResource("HelpDeskApplyForLeave.fxml"));
        Scene HelpDeskApplyForLeaveScene = new Scene(HelpDeskApplyForLeaveParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(HelpDeskApplyForLeaveScene);
        stg2.show();
        
    }

    @FXML
    private void forwardComplaintOnClick(ActionEvent event) throws IOException {
        
        Parent ForwardComplainToGmParent = FXMLLoader.load(getClass().getResource("ForwardComplainToGmScene.fxml"));
        Scene ForwardComplainToGmScene = new Scene(ForwardComplainToGmParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ForwardComplainToGmScene);
        stg2.show();
        
    }

    @FXML
    private void hdRequestEarlyWageOnClick(ActionEvent event) throws IOException {
        
        Parent HelpDeskApplyForAdvanceSalaryParent = FXMLLoader.load(getClass().getResource("HelpDeskApplyForAdvanceSalaryScene.fxml"));
        Scene HelpDeskApplyForAdvanceSalaryScene = new Scene(HelpDeskApplyForAdvanceSalaryParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(HelpDeskApplyForAdvanceSalaryScene);
        stg2.show();
         
        
    } 

    @FXML
    private void hdApplyForLeaveOnClick(ActionEvent event) throws IOException {
        
        Parent HelpDeskApplyForLeaveParent = FXMLLoader.load(getClass().getResource("HelpDeskApplyForLeaveScene.fxml"));
        Scene HelpDeskApplyForLeaveScene = new Scene(HelpDeskApplyForLeaveParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(HelpDeskApplyForLeaveScene);
        stg2.show();
        
    }

    @FXML
    private void logOutOnClick(ActionEvent event) {
    }
    
}
