package Arif;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelClasses.Employee;

/**
 * FXML Controller class
 *
 * @author arifh
 */
public class FMMainSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextArea employeeInfoTextArea;
    @FXML
    private ComboBox<String> action2ComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        action2ComboBox.getItems().addAll("Authorize Advance Sallary",
                                        "View All Employee Information");
        
        action2ComboBox.setValue("Select Action");
        
    }    

    @FXML
    private void nextButtonClick(ActionEvent event) throws IOException, ClassNotFoundException {
        
        if(action2ComboBox.getValue() == "View All Employee Information"){
           
//        String str="";
//        File f = null;
//        FileInputStream fis = null;
//        //BufferedOutputStream bos = null;
//        DataInputStream dis = null;
            
        ObjectInputStream ois=null;
        try{
//            f = new File("Employees.bin");
//            if(f.exists()) fis = new FileInputStream(f);
//            else fis = new FileInputStream(f);
//
//            dis = new DataInputStream(fis);
//            System.out.println("AMi aikhane");
//            
//            while(true){
//            
//                //dos.readUTF();
//            str += dis.readUTF() + " , ";
//                System.out.println(str);
//            //dos.writeUTF(this.name);
//            str += dis.readUTF() + " , ";
//            //dos.writeUTF(this.number);
//            str += dis.readUTF() + " , ";
//            //dos.writeUTF(this.email);
//            str += dis.readUTF() + " , ";
//            //dos.writeUTF(this.dateOfBirth.toString());
//            str += dis.readUTF() + " , ";
//            //dos.writeInt(this.salary);
//            str += dis.readInt();
//            //dos.writeInt(this.workHours);
//            str += dis.readInt();
//            //dos.writeBoolean(this.onLeaveStatus);
//            str += dis.readBoolean();
//            //dos.writeBoolean(this.monthlySalaryPaidStatus);
//            str += dis.readBoolean();
//            //dos.writeUTF(this.department);
//            str += dis.readUTF() + " , ";
//            //dos.writeUTF(this.designation);
//            str += dis.readUTF() + " , ";
//            //dos.writeUTF(this.dateOfJoining.toString());
//            str += dis.readUTF() + " , ";
//            //dos.writeInt(this.incentiveAmount);
//            str += dis.readInt() + "\n";
//          }
            Employee e;
             //FileInputStream fis = new FileInputStream("stud2.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("Employees.bin"));
             
            //outputTxtArea.setText(null);
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                e = (Employee) ois.readObject();
                //studArr.add((Student) ois.readObject());
                employeeInfoTextArea.appendText(e.toString()+"\n");
            
            }  
        } catch (IOException ex) {
            
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }
            //employeeInfoTextArea.setText(str);
            
        }
        //readEmployeeData();
    }
        //System.out.println(str);
        
        
        
        else if(action2ComboBox.getValue() == "Authorize Advance Sallary"){
           
            Parent AdvanceSallarySceneParent = FXMLLoader.load(getClass().getResource("AdvanceSallaryScene.fxml"));
            Scene AdvanceSallaryScene = new Scene(AdvanceSallarySceneParent);

            //Stage s2 = new Stage(); s2.setScene(AddNewEmployeeInfoScene);  s2.show();

            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();

            stg2.setScene(AdvanceSallaryScene);
            stg2.show();
        
        }
    }


    @FXML
    private void budgetReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void revenueReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void expenseReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void applyForLeaveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
    }
    
    @FXML
    private void AllEmpInfoButtonOnClick(ActionEvent event) {
        DataInputStream dis=null;
        String str = "";
            try {
                dis = new DataInputStream(new FileInputStream("Employees.bin"));
                System.out.println("Printing Employee Data:");
                while(true){
                    str += ("Username: " + dis.readUTF() + ", ");
                    str += ("Password: " + dis.readUTF() + ", ");
                    str += ("User Type: " + dis.readUTF() + "\n");
                }
            } catch (Exception ex) {
                try {
                    if(dis!=null)
                        dis.close();
                    employeeInfoTextArea.setText(str);
                } catch (IOException ex1) {  }
        }
    }
}
