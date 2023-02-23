

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelClasses.Administrator;
import modelClasses.Client;
import modelClasses.Contractor;
import modelClasses.Employee;
import modelClasses.Engineer;
import modelClasses.FinanceAccountManager;
import modelClasses.HelpDeskEmployee;
import modelClasses.HumanResourceManager;
import modelClasses.LandingStationManager;
import modelClasses.User;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField numberField;
    @FXML
    private TextField emailField;
    @FXML
    private DatePicker dobField;
    @FXML
    private ComboBox<String> userGroupField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userGroupField.getItems().addAll("Client","Engineer","Administrator","Higher Authority",
                "Human Resource Manager", "Finance Account Manager", "Landing Station Manager",
                "General Manager", "Contractor", "Help Desk Employee");
        userGroupField.setValue("Client");
    }    

    @FXML
    private void goToGroupRegOnClick(ActionEvent event) throws IOException {
        if(nameField.getText().isEmpty() || emailField.getText().isEmpty() || dobField.getValue().toString().isEmpty() || userGroupField.getValue().isEmpty() || usernameField.getText().isEmpty() || passwordField.getText().isEmpty()){

        }else{
            if(userGroupField.getValue()=="Client"){
                Client c = new Client();
                c.setNumber(numberField.getText());
                c.setEmail(emailField.getText());
                c.setDateOfBirth(dobField.getValue());
                c.setName(nameField.getText());
                c.setUsername(usernameField.getText());
                c.setPassword(passwordField.getText());
                c.setUserType(userGroupField.getValue());
                
                Parent group1RegParent = FXMLLoader.load(getClass().getResource("RegisterClient.fxml"));
                Scene registration1Scene = new Scene(group1RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow();
                regStg.setUserData(c);
                regStg.setScene(registration1Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Engineer"){
                Engineer eng = new Engineer();
                eng.setNumber(numberField.getText());
                eng.setEmail(emailField.getText());
                eng.setDateOfBirth(dobField.getValue());
                eng.setName(nameField.getText());
                eng.setUsername(usernameField.getText());
                eng.setPassword(passwordField.getText());
                eng.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(eng);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Administrator"){
                Administrator adm = new Administrator();
                adm.setNumber(numberField.getText());
                adm.setEmail(emailField.getText());
                adm.setDateOfBirth(dobField.getValue());
                adm.setName(nameField.getText());
                adm.setUsername(usernameField.getText());
                adm.setPassword(passwordField.getText());
                adm.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(adm);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Higher Authority"){
                //Instantiating model class and calling register method in user superclass
                //Unfinished Code
                
                Alert h = new Alert(Alert.AlertType.INFORMATION);
                h.setContentText("You have been registered");
                h.show();
                Parent group3RegParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
                Scene registration3Scene = new Scene(group3RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setScene(registration3Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Help Desk Employee"){
                HelpDeskEmployee hde = new HelpDeskEmployee();
                hde.setNumber(numberField.getText());
                hde.setEmail(emailField.getText());
                hde.setDateOfBirth(dobField.getValue());
                hde.setName(nameField.getText());
                hde.setUsername(usernameField.getText());
                hde.setPassword(passwordField.getText());
                hde.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(hde);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Human Resource Manager"){
                HumanResourceManager hrm = new HumanResourceManager();
                hrm.setNumber(numberField.getText());
                hrm.setEmail(emailField.getText());
                hrm.setDateOfBirth(dobField.getValue());
                hrm.setName(nameField.getText());
                hrm.setUsername(usernameField.getText());
                hrm.setPassword(passwordField.getText());
                hrm.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(hrm);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Finance Account Manager"){
                FinanceAccountManager fam = new FinanceAccountManager();
                fam.setNumber(numberField.getText());
                fam.setEmail(emailField.getText());
                fam.setDateOfBirth(dobField.getValue());
                fam.setName(nameField.getText());
                fam.setUsername(usernameField.getText());
                fam.setPassword(passwordField.getText());
                fam.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(fam);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Landing Station Manager"){
                LandingStationManager lsm = new LandingStationManager();
                lsm.setNumber(numberField.getText());
                lsm.setEmail(emailField.getText());
                lsm.setDateOfBirth(dobField.getValue());
                lsm.setName(nameField.getText());
                lsm.setUsername(usernameField.getText());
                lsm.setPassword(passwordField.getText());
                lsm.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(lsm);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else if(userGroupField.getValue()=="Contractor"){
                Contractor con = new Contractor();
                con.setNumber(numberField.getText());
                con.setEmail(emailField.getText());
                con.setDateOfBirth(dobField.getValue());
                con.setName(nameField.getText());
                con.setUsername(usernameField.getText());
                con.setPassword(passwordField.getText());
                con.setUserType(userGroupField.getValue());
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                regStg.setUserData(con);
                regStg.setScene(registration2Scene);
                regStg.show();
            }else{
                //Model Class code for other users
                
                Parent group2RegParent = FXMLLoader.load(getClass().getResource("RegisterEmployee.fxml"));
                Scene registration2Scene = new Scene(group2RegParent);
                Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                //regStg.setUserData(adm);
                regStg.setScene(registration2Scene);
                regStg.show();
            }
        }
    }

    @FXML
    private void goToLoginButtonOnClick(ActionEvent event) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene loginScene = new Scene(loginParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(loginScene);
        regStg.show();
    }
    
}
