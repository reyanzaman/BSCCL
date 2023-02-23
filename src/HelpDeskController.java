

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
import modelClasses.Issue;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class HelpDeskController implements Initializable {

    @FXML
    private ComboBox<String> issueField;
    @FXML
    private TextField descriptionField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        issueField.getItems().addAll("Bug", "Complaint", "Request");
        issueField.setValue("Bug");
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
    private void submitButtonOnClick(ActionEvent event) throws IOException {
        Issue i = new Issue(issueField.getValue(), descriptionField.getText());
        FileWriter fw = new FileWriter("Issue.txt");
        String str = "";
        str+= "Issue Type: " + i.getIssueType() + ", Issue Description: " + i.getDescription();
        fw.write(str);
        fw.close();
        issueField.setValue(null);
        descriptionField.setText(null);
    }
    
}
