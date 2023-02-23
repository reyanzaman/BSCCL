

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import modelClasses.Service;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class YourServicesController implements Initializable {

    @FXML
    private Label serviceLabel;
    @FXML
    private TextArea serviceField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Service sv = new Service();
        DataInputStream dis = null;
        try{
           FileInputStream fis = new FileInputStream("service.bin");
           dis = new DataInputStream(fis);
           sv.setName(dis.readUTF());
           sv.setCapacity(dis.readUTF());
           sv.setTarrifRate(dis.readFloat());
           dis.close();
           fis.close();
        }catch(Exception e2){
        }
            
        serviceLabel.setText(sv.getName());
        serviceField.setText("Product Capacity: " 
                + sv.getCapacity() + "\nTotal Cost is: " + 
                sv.getPrice() + " per month\nTarrif Rate is: " 
                + sv.getTarrifRate());
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
    private void cancelButtonOnClick(ActionEvent event) {
        File file = new File("service.bin");
        file.deleteOnExit();
        serviceField.setText(null);
    }
    
}
