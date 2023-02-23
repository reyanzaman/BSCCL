

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import modelClasses.Service;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class TarrifIPLCController implements Initializable {

    @FXML
    private TableView<Service> tarrifTable;
    @FXML
    private TableColumn<Service, String> columnCapacity;
    @FXML
    private TableColumn<Service, String> columnRate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnCapacity.setCellValueFactory(new PropertyValueFactory<Service, String>("capacity"));
        columnCapacity.setCellValueFactory(new PropertyValueFactory<Service, String>("rate"));
        
        tarrifTable.setEditable(true);
        columnCapacity.setCellFactory(TextFieldTableCell.forTableColumn());
        columnRate.setCellFactory(TextFieldTableCell.forTableColumn());
        tarrifTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
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
    
}
