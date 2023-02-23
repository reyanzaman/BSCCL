/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClasses;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author reyan
 */
public class Client extends User{
    private String organizationName;
    private String organizationType;
    private String address;

    public Client(String organizationName, String organizationType, String address, String name, String username, String password, String number, String email, LocalDate dateOfBirth) {
        super(name, username, password, number, email, dateOfBirth);
        this.organizationName = organizationName;
        this.organizationType = organizationType;
        this.address = address;
    }

    public Client() {
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public String getAddress() {
        return address;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" + "organizationName=" + organizationName + ", organizationType=" + organizationType + ", address=" + address + ", dateOfTakenService=" 
               + "name=" + name + ", username=" + username + ", password=" + password + ", number=" + number + ", email=" + email + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    @Override
    public void register(){
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
    try{
                f = new File("loginData.bin");
                if(f.exists()) fos = new FileOutputStream(f,true);
                else fos = new FileOutputStream(f);
                dos = new DataOutputStream(fos);
                
                dos.writeUTF(this.getUsername());
                dos.writeUTF(this.getPassword());
                dos.writeUTF(this.getUserType());
                dos.close();
            }
            catch(Exception e){
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText(e.toString());
                a.showAndWait();
            }
            readLoginData();
    }
    
    public void readLoginData(){
         //Read and print for error checking
        DataInputStream dis=null;
            try {
                dis = new DataInputStream(new FileInputStream("loginData.bin"));
                System.out.println("Printing LoginData:");
                while(true){
                    System.out.print("Username: " + dis.readUTF() + ", ");
                    System.out.print("Password: " + dis.readUTF() + ", ");
                    System.out.print("User Type: " + dis.readUTF() + "\n");
                }             
            } catch (Exception ex) {
                try {
                    if(dis!=null)
                        dis.close();
                } catch (IOException ex1) {  }           
        }
    }
    
    public void saveClient(){
        File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("Clients.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);
            
            dos.writeUTF(this.username);
            dos.writeUTF(this.name);
            dos.writeUTF(this.number);
            dos.writeUTF(this.email);
            dos.writeUTF(this.dateOfBirth.toString());
            dos.writeUTF(this.organizationName);
            dos.writeUTF(this.organizationType);
            dos.writeUTF(this.address);

        } catch (IOException ex) {
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {  
            }
        }
        readClientData();
    }
    
    public void readClientData(){
         //Read and print for error checking
        DataInputStream dis=null;
            try {
                dis = new DataInputStream(new FileInputStream("Clients.bin"));
                System.out.println("Printing Clients:");
                while(true){
                    System.out.print("Username: " + dis.readUTF() + ", ");
                    System.out.print("Name: " + dis.readUTF() + ", ");
                    System.out.print("Number: " + dis.readUTF() + ", ");
                    System.out.print("Email: " + dis.readUTF() + ", ");
                    System.out.print("Date Of Birth: " + dis.readUTF() + ", ");
                    System.out.print("Org Name: " + dis.readUTF() + ", ");
                    System.out.print("Org Type: " + dis.readUTF() + ", ");
                    System.out.print("Address: " + dis.readUTF() + "\n");
                }             
            } catch (Exception ex) {
                try {
                    if(dis!=null)
                        dis.close();
                } catch (IOException ex1) {  }           
        }
    }
}
