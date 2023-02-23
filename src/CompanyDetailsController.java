

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author reyan
 */
public class CompanyDetailsController implements Initializable {

    @FXML
    private TextArea detailsField;
    @FXML
    private TextArea contactField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("Company.txt");
            Scanner sc; String str = null;
            try{
                sc = new Scanner(file);  
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    detailsField.appendText(str+"\n");
                }
            }catch(FileNotFoundException ex){   
            }
        File file2 = new File("Contact.txt");
            Scanner sc2; String str2 = null;
            try{
                sc2 = new Scanner(file2);  
                while(sc2.hasNextLine()){
                    str2=sc2.nextLine();
                    contactField.appendText(str2+"\n");
                }
            }catch(FileNotFoundException ex2){   
            }
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
