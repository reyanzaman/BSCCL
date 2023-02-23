/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClasses;

import java.time.LocalDate;

/**
 *
 * @author reyan
 */
public class LandingStationManager extends Employee{

    public LandingStationManager() {
    }

    public LandingStationManager(String department, String designtaion, String name, String username, String password, String number, String email, LocalDate dateOfBirth) {
        super(department, designtaion, name, username, password, number, email, dateOfBirth);
    }
    
}
