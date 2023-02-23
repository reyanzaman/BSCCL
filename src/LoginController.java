

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
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelClasses.User;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class LoginController implements Initializable {

    @FXML
    private PasswordField passField;
    @FXML
    private TextField usernameField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToRegisterPageButtonOnClick(ActionEvent event) throws IOException {
        Parent registrationParent = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene registrationScene = new Scene(registrationParent);       
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(registrationScene);
        regStg.show();
    }

    @FXML
    private void goToDashboardPageButtonOnClick(ActionEvent event) throws IOException {
        if(usernameField.getText().isEmpty() || passField.getText().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please make sure you have entered all fields.");
            a.showAndWait();
        }else{
            String uType = ""; String userName = usernameField.getText(); String password = passField.getText();
            String uName = ""; String pass = "";
            DataInputStream dis = null;
            boolean isUsernameCorrect = false; boolean isPasswordCorrect = false;
            try{
                dis = new DataInputStream(new FileInputStream("loginData.bin"));
                
                while(true){
                    uName = dis.readUTF();
                    pass = dis.readUTF();
                    uType = dis.readUTF();
                    System.out.println(uName + " , " + pass + " , " + uType + " | " + userName + " , " + password);

                    if(userName.equals(uName)){
                        isUsernameCorrect = true;
                        if(password.equals(pass)){
                            isPasswordCorrect = true;
                            break;
                        }
                    }
                }
                if(uType.equals("Client")){
                        System.out.println("Logged in as client");
                        Parent loginParent = FXMLLoader.load(getClass().getResource("ClientDashboard.fxml"));
                        Scene dashboardScene = new Scene(loginParent);       
                        Stage loginStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        loginStg.setScene(dashboardScene);
                        loginStg.show();
                }else if(uType.equals("Administrator")){
                        System.out.println("Logged in as administrator");
                        Parent loginParent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
                        Scene dashboardScene = new Scene(loginParent);       
                        Stage loginStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        loginStg.setScene(dashboardScene);
                        loginStg.show();
                }else if(uType.equals("Engineer")){
                        System.out.println("Logged in as Engineer");
                        Parent loginParent = FXMLLoader.load(getClass().getResource("EngineerMainMenuScene.fxml"));
                        Scene dashboardScene = new Scene(loginParent);       
                        Stage loginStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        loginStg.setScene(dashboardScene);
                        loginStg.show();
                }else if(uType.equals("Help Desk Employee")){
                        System.out.println("Logged in as Help Desk Employee");
                        Parent login2Parent = FXMLLoader.load(getClass().getResource("HDMainMenuScene.fxml"));
                        Scene dashboardScene = new Scene(login2Parent);       
                        Stage login2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        login2Stg.setScene(dashboardScene);
                        login2Stg.show();
                }else if(uType.equals("Human Resource Manager")){
                        System.out.println("Logged in as HRM");
                        Parent login2Parent = FXMLLoader.load(getClass().getResource("HRMMenuScene.fxml"));
                        Scene dashboardScene = new Scene(login2Parent);       
                        Stage login2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        login2Stg.setScene(dashboardScene);
                        login2Stg.show();
                }else if(uType.equals("Finance Account Manager")){
                        System.out.println("Logged in as FAM");
                        Parent login2Parent = FXMLLoader.load(getClass().getResource("FMMainScene.fxml"));
                        Scene dashboardScene = new Scene(login2Parent);       
                        Stage login2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        login2Stg.setScene(dashboardScene);
                        login2Stg.show();
                }else if(uType.equals("Landing Station Manager")){
                        System.out.println("Logged in as Landing Station Manager");
                        Parent login2Parent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
                        Scene dashboardScene = new Scene(login2Parent);       
                        Stage login2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        login2Stg.setScene(dashboardScene);
                        login2Stg.show();
                }else if(uType.equals("Contractor")){
                        System.out.println("Logged in as Contractor");
                        Parent login2Parent = FXMLLoader.load(getClass().getResource("ContractorDashboard.fxml"));
                        Scene dashboardScene = new Scene(login2Parent);       
                        Stage login2Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                        login2Stg.setScene(dashboardScene);
                        login2Stg.show();
                }else{
                        System.out.println("Error not a valid user type");
                }
                dis.close();
            }catch(Exception ex){
                if(dis!=null)
                    dis.close();
                if(!isUsernameCorrect){
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("Username does not exist");
                    a.showAndWait();
                }else if(isUsernameCorrect && !isPasswordCorrect){
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("Password is wrong. Try Again");
                    a.showAndWait();
                }
            }
        }
    }
}