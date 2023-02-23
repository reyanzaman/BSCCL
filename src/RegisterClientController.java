

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class RegisterClientController implements Initializable {

    @FXML
    private TextField orgNameField;
    @FXML
    private ComboBox<String> orgTypeField;
    @FXML
    private TextField addressField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        orgTypeField.getItems().addAll("Bank", "ISP", "Others");
        orgTypeField.setValue("Bank");
    }    

    @FXML
    private void goToRegistrationButtonOnClick(ActionEvent event)throws IOException{
        Parent regParent = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene regScene = new Scene(regParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(regScene);
        regStg.show();
    }

    @FXML
    private void goToLoginButtonOnClick(ActionEvent event) throws IOException {
        if(orgNameField.getText().isEmpty() || orgTypeField.getValue().isEmpty() || addressField.getText().isEmpty()){
            Alert e = new Alert(Alert.AlertType.ERROR);
            e.setContentText("Make sure you have entered all fields correctly");
            e.showAndWait();
        }else{
            Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow();
            Client c = (Client) regStg.getUserData();
            c.setOrganizationName(orgNameField.getText());
            c.setOrganizationType(orgTypeField.getValue());
            c.setAddress(addressField.getText());
            c.register();
            c.saveClient();

            Alert e = new Alert(Alert.AlertType.INFORMATION);
            e.setContentText("You have been registered");
            e.show();
            Parent loginParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene loginScene = new Scene(loginParent);
            Stage reg2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
            reg2Stg.setScene(loginScene);
            reg2Stg.show();
        }
    }
    
}
