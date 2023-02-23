

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.stage.Stage;
import modelClasses.Service;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class BuyServiceController implements Initializable {

    @FXML
    private ComboBox<String> serviceField;
    @FXML
    private ComboBox<String> capacityField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serviceField.getItems().addAll("IPLC","IP Transit", "Colocation");
        capacityField.getItems().addAll("100MBPS", "5000MBPS", "10000MBPS");
        serviceField.setValue("IPLC");
        capacityField.setValue("5000MBPS");
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
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent backParent = FXMLLoader.load(getClass().getResource("ClientDashboard.fxml"));
        Scene backScene = new Scene(backParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(backScene);
        regStg.show();
    }

    @FXML
    private void registerButtonOnClick(ActionEvent event) throws IOException {
        Service s = new Service(serviceField.getValue(), capacityField.getValue());
        
        try{
                FileOutputStream fos = new FileOutputStream("service.bin");
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeUTF(s.getName());
                dos.writeUTF(s.getCapacity());
                dos.writeFloat(s.getTarrifRate());
                dos.close();
                fos.close();
            }
            catch(Exception e){
            }
        
        Alert e = new Alert(Alert.AlertType.INFORMATION);
        e.setContentText("You have been registered for the product");
        e.show();
        
        Parent backParent = FXMLLoader.load(getClass().getResource("ClientDashboard.fxml"));
        Scene backScene = new Scene(backParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(backScene);
        regStg.show();
    }
    
}
