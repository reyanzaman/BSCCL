package Arif;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.DataInputStream;
import java.io.FileInputStream;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author arifh
 */
public class HRMMenuSceneController implements Initializable {

    @FXML
    private ComboBox<String> actionComboBox;
    @FXML
    private Button logoutButton;
    @FXML
    private Button applyForLeaveButton;
    @FXML
    private TextField idTextField;
    @FXML
    private Button nextButton;
    @FXML
    private Button addNewEmployeeInfoButton;
    @FXML
    private TextArea employeeInfoTextArea;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        actionComboBox.getItems().addAll("View Employee Information",
                                        "Check Performance",
                                        "Grant Incentive",
                                        "Edit/Update Employee Information",
                                        "Lodge Complaints",
                                        "Grant Leave"
                                        );
        actionComboBox.setValue("Select Action");
        
    }    


    @FXML
    private void applyForLeaveButtonOnClick(ActionEvent event) throws IOException {
        
        Parent HRapplyForLeaveParent = FXMLLoader.load(getClass().getResource("HRApplyForLeaveScene.fxml"));
        Scene HRApplyForLeaveScene = new Scene(HRapplyForLeaveParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(HRApplyForLeaveScene);
        stg2.show();
        
    }

    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
        
        if(actionComboBox.getValue() == "Check Performance"){
            
            Parent CheckPerformanceParent = FXMLLoader.load(getClass().getResource("CheckPerformanceScene.fxml"));
            Scene CheckPerformanceScene = new Scene(CheckPerformanceParent);

            //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();

            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();

            stg2.setScene(CheckPerformanceScene);
            stg2.show();
             
        }
        else if(actionComboBox.getValue() == "Grant Incentive"){
           
            Parent GrantIncentiveParent = FXMLLoader.load(getClass().getResource("GrantIncentiveScene.fxml"));
            Scene GrantIncentiveScene = new Scene(GrantIncentiveParent);

            //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();

            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();

            stg2.setScene(GrantIncentiveScene);
            stg2.show();
        
        }
        else if(actionComboBox.getValue() == "Edit/Update Employee Information"){
           
            Parent EditEmployeeInfoParent = FXMLLoader.load(getClass().getResource("EditEmployeeInfoScene.fxml"));
            Scene EditEmployeeInfoScene = new Scene(EditEmployeeInfoParent);

            //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();

            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();

            stg2.setScene(EditEmployeeInfoScene);
            stg2.show();
        
        }
        else if(actionComboBox.getValue() == "Lodge Complaints"){
           
            Parent LodgeComplaintParent = FXMLLoader.load(getClass().getResource("LodgeComplaintScene.fxml"));
            Scene LodgeComplaintScene = new Scene(LodgeComplaintParent);

            //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();

            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();

            stg2.setScene(LodgeComplaintScene);
            stg2.show();
        
        }
        else if(actionComboBox.getValue() == "Grant Leave"){
           
            Parent GrantLeaveParent = FXMLLoader.load(getClass().getResource("GrantLeaveScene.fxml"));
            Scene GrantLeaveScene = new Scene(GrantLeaveParent);

            //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();

            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();

            stg2.setScene(GrantLeaveScene);
            stg2.show();
        
        }
        else if(actionComboBox.getValue() == "View Employee Information"){
           
            
        
        }
        
        
    }

    @FXML
    private void addNewEmployeeInfoButtonOnClick(ActionEvent event) throws IOException {
        
        Parent addNewEmployeeInfoParent = FXMLLoader.load(getClass().getResource("AddNewEmployeeInfoScene.fxml"));
        Scene AddNewEmployeeInfoScene = new Scene(addNewEmployeeInfoParent);
        
        //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(AddNewEmployeeInfoScene);
        stg2.show();
        
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
    }

    private void AllEmpInfoButtonOnClick(ActionEvent event) {
        DataInputStream dis=null;
        String str = "";
            try {
                dis = new DataInputStream(new FileInputStream("Employees.bin"));
                System.out.println("Printing Employee Data:");
                while(true){
                    str += ("Username: " + dis.readUTF() + ", ");
                    str += ("Password: " + dis.readUTF() + ", ");
                    str += ("User Type: " + dis.readUTF() + "\n");
                }
            } catch (Exception ex) {
                try {
                    if(dis!=null)
                        dis.close();
                    employeeInfoTextArea.setText(str);
                } catch (IOException ex1) {  }
        }
    }
}
