

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class ClientDashboardController implements Initializable {

    @FXML
    private BorderPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
    private void rateButtonOnClick(ActionEvent event) throws IOException {
        Parent rateParent = FXMLLoader.load(getClass().getResource("Review.fxml"));
        Scene rateScene = new Scene(rateParent);
        Stage Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        Stg.setScene(rateScene);
        Stg.show();
    }

    @FXML
    private void viewCompanyButtonOnClick(ActionEvent event) throws IOException {
        Parent compParent = FXMLLoader.load(getClass().getResource("CompanyDetails.fxml"));
        Scene compScene = new Scene(compParent);
        Stage Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        Stg.setScene(compScene);
        Stg.show();
    }

    @FXML
    private void yourProductButtonOnClick(ActionEvent event) throws IOException {
        Parent prodParent = FXMLLoader.load(getClass().getResource("YourServices.fxml"));
        Scene prodScene = new Scene(prodParent);
        Stage Stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        Stg.setScene(prodScene);
        Stg.show();
    }

    @FXML
    private void iplcButtonOnClick(ActionEvent event) throws IOException {
        Parent prodParent = FXMLLoader.load(getClass().getResource("IPLC.fxml"));
        Scene prodScene = new Scene(prodParent);
        Stage Stg = (Stage)root.getScene().getWindow(); 
        Stg.setScene(prodScene);
        Stg.show();
    }

    @FXML
    private void ipTransitButtonOnClick(ActionEvent event) throws IOException {
        Parent prodParent = FXMLLoader.load(getClass().getResource("IPTransit.fxml"));
        Scene prodScene = new Scene(prodParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(prodScene);
        Stg.show();
    }

    @FXML
    private void colocationButtonOnClick(ActionEvent event) throws IOException {
        Parent prodParent = FXMLLoader.load(getClass().getResource("Colocation.fxml"));
        Scene prodScene = new Scene(prodParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(prodScene);
        Stg.show();
    }

    @FXML
    private void faqButtonOnClick(ActionEvent event) throws IOException {
        Parent custServParent = FXMLLoader.load(getClass().getResource("FAQ.fxml"));
        Scene custServScene = new Scene(custServParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(custServScene);
        Stg.show();
    }

    @FXML
    private void supportDeskButtonOnClick(ActionEvent event) throws IOException {
        Parent custServParent = FXMLLoader.load(getClass().getResource("HelpDesk.fxml"));
        Scene custServScene = new Scene(custServParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(custServScene);
        Stg.show();
    }

    @FXML
    private void tarrifIPLCButtonOnClick(ActionEvent event) throws IOException {
        Parent tarrifParent = FXMLLoader.load(getClass().getResource("TarrifIPLC.fxml"));
        Scene tarrifScene = new Scene(tarrifParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(tarrifScene);
        Stg.show();
    }

    @FXML
    private void tarrifIPTransitButtonOnClick(ActionEvent event) throws IOException {
        Parent tarrifParent = FXMLLoader.load(getClass().getResource("TarrifIPTransit.fxml"));
        Scene tarrifScene = new Scene(tarrifParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(tarrifScene);
        Stg.show();
    }

    @FXML
    private void tarrifColocationButtonOnClick(ActionEvent event) throws IOException {
        Parent tarrifParent = FXMLLoader.load(getClass().getResource("TarrifColocation.fxml"));
        Scene tarrifScene = new Scene(tarrifParent);
        Stage Stg = (Stage)root.getScene().getWindow();
        Stg.setScene(tarrifScene);
        Stg.show();
    }
    
}
