

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class CheckTasksController implements Initializable {

    @FXML
    private TableView<?> taskTable;
    @FXML
    private TableColumn<?, ?> columnTaskID;
    @FXML
    private TableColumn<?, ?> columnTaskName;
    @FXML
    private TableColumn<?, ?> columnAssignedBy;
    @FXML
    private TableColumn<?, ?> columnDescription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        Parent backParent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
        Scene backScene = new Scene(backParent);
        Stage regStg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        regStg.setScene(backScene);
        regStg.show();
    }
    
}
