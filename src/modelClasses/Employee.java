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
import java.time.LocalDate;
import javafx.scene.control.Alert;

/**
 *
 * @author reyan
 */
public abstract class Employee extends User{
    protected int salary = 0;
    protected int workHours = 0;
    protected String workShift = "";
    protected boolean onLeaveStatus = false;
    protected boolean monthlySalaryPaidStatus = false;
    protected String department;
    protected String designation;
    protected LocalDate dateOfJoining;
    protected int incentiveAmount = 0;

    public Employee() {
        dateOfJoining = LocalDate.now();
    }

    public Employee(String department, String designtaion, String name, String username, String password, String number, String email, LocalDate dateOfBirth) {
        super(name, username, password, number, email, dateOfBirth);
        this.department = department;
        this.designation = designtaion;
        this.dateOfJoining = LocalDate.now();
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getWorkShift() {
        return workShift;
    }

    public boolean isOnLeaveStatus() {
        return onLeaveStatus;
    }

    public boolean isMonthlySalaryPaidStatus() {
        return monthlySalaryPaidStatus;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getIncentiveAmount() {
        return incentiveAmount;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    public void setOnLeaveStatus(boolean onLeaveStatus) {
        this.onLeaveStatus = onLeaveStatus;
    }

    public void setMonthlySalaryPaidStatus(boolean monthlySalaryPaidStatus) {
        this.monthlySalaryPaidStatus = monthlySalaryPaidStatus;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designtaion) {
        this.designation = designtaion;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setIncentiveAmount(int incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", workHours=" + workHours + ", workShift=" + workShift + ", onLeaveStatus=" + onLeaveStatus + 
                ", monthlySalaryPaidStatus=" + monthlySalaryPaidStatus + ", department=" + department + ", designtaion=" + designation + ", "
                + "dateOfJoining=" + dateOfJoining + ", incentiveAmount=" + incentiveAmount + "name=" + name + ", username=" + username + ", password="
                + password + ", number=" + number + ", email=" + email + ", dateOfBirth=" + dateOfBirth + '}';
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
    
    public void saveEmployee(){
        File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("Employees.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);
            
            dos.writeUTF(this.username);
            dos.writeUTF(this.name);
            dos.writeUTF(this.number);
            dos.writeUTF(this.email);
            dos.writeUTF(this.dateOfBirth.toString());
            dos.writeInt(this.salary);
            dos.writeInt(this.workHours);
            dos.writeBoolean(this.onLeaveStatus);
            dos.writeBoolean(this.monthlySalaryPaidStatus);
            dos.writeUTF(this.department);
            dos.writeUTF(this.designation);
            dos.writeUTF(this.dateOfJoining.toString());
            dos.writeInt(this.incentiveAmount);

        } catch (IOException ex) {
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {  
            }
        }
        readEmployeeData();
    }
    
    public void readEmployeeData(){
         //Read and print for error checking
        DataInputStream dis=null;
            try {
                dis = new DataInputStream(new FileInputStream("Employees.bin"));
                System.out.println("Printing Employees:");
                while(true){
                    System.out.print("Username: " + dis.readUTF() + ", ");
                    System.out.print("Name: " + dis.readUTF() + ", ");
                    System.out.print("Number: " + dis.readUTF() + ", ");
                    System.out.print("Email: " + dis.readUTF() + ", ");
                    System.out.print("Date Of Birth: " + dis.readUTF() + ", ");
                    System.out.print("Salary: " + dis.readInt() + ", ");
                    System.out.print("WorkHours: " + dis.readInt() + ", ");
                    System.out.print("onLeaveStatus: " + dis.readBoolean() + ", ");
                    System.out.print("monthlySalaryPaidStatus: " + dis.readBoolean() + ", ");
                    System.out.print("Department: " + dis.readUTF() + ", ");
                    System.out.print("Designation: " + dis.readUTF() + ", ");
                    System.out.print("Date of Joining: " + dis.readUTF() + ", ");
                    System.out.print("Incentive Amount: " + dis.readInt() + "\n");
                }             
            } catch (Exception ex) {
                try {
                    if(dis!=null)
                        dis.close();
                } catch (IOException ex1) {  }           
        }
    }
}
