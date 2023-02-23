

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileWriter;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class ReviewController implements Initializable {

    @FXML
    private ComboBox<String> ratingField;
    @FXML   
    private TextField commentField;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ratingField.getItems().addAll("5 star", "4 star", "3 star", "2 star", "1 star");
        ratingField.setValue("5 star");
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
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent backParent = FXMLLoader.load(getClass().getResource("ClientDashboard.fxml"));
        Scene backScene = new Scene(backParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(backScene);
        regStg.show();
    }

    @FXML
    private void SubmitButtonOnClick(ActionEvent event) {
        try{
            FileWriter fw = new FileWriter("Review.txt");
            String str = "";
            str += "The company is rated " + ratingField.getValue() + "Review comment is: " + commentField.getText();
            fw.write(str);
            fw.close();
        }catch(IOException ex){
        }
    }
    
}
