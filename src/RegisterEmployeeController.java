

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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelClasses.Client;
import modelClasses.Employee;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class RegisterEmployeeController implements Initializable {

    @FXML
    private ComboBox<String> desigField;
    @FXML
    private ComboBox<String> deptField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        desigField.getItems().addAll("General Manager", "Landing Station Manager", "Finance Manager", "Human Resource Manager", "Engineer", "Help Desk Employee", "Contractor", "Admin", "Network Technician");
        desigField.setValue("Engineer");
        deptField.getItems().addAll("Management", "Customer Service", "Administration", "Engineering", "Finance", "Logistics");
        deptField.setValue("Management");
    }    

    @FXML
    private void goToLoginButtonOnClick(ActionEvent event) throws IOException {  
            Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow();
            Employee emp = (Employee) regStg.getUserData();
            emp.setDesignation(desigField.getValue());
            emp.setDepartment(deptField.getValue());
            emp.register();
            emp.saveEmployee();

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("You have been registered");
            a.show();
            Parent loginParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene loginScene = new Scene(loginParent);
            Stage reg2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
            reg2Stg.setScene(loginScene);
            reg2Stg.show();
    }

    @FXML
    private void goToRegistrationButtonOnClick(ActionEvent event) throws IOException {
        Parent regParent = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene regScene = new Scene(regParent);             
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow();  
        regStg.setScene(regScene);
        regStg.show();
    }
    
}
