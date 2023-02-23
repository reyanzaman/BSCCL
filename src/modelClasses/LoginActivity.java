/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClasses;

import java.time.LocalDateTime;
import javafx.scene.control.Alert;

/**
 *
 * @author reyan
 */
public class LoginActivity {
    private String username;
    private LocalDateTime lastLoginFailedAttempt;
    private int timesLoggedInFailedAttempt = 0;
    private boolean isRestricted = false;

    public LoginActivity() {
    }
    
    public LoginActivity(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getLastLoginAttempt() {
        return lastLoginFailedAttempt;
    }

    public int getTimesLoggedIn() {
        return timesLoggedInFailedAttempt;
    }

    public boolean isIsRestricted() {
        return isRestricted;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLastLoginAttempt() {
        this.lastLoginFailedAttempt = LocalDateTime.now();
    }

    public void setTimesLoggedIn(int timesLoggedIn) {
        this.timesLoggedInFailedAttempt = timesLoggedIn;
    }

    public void setIsRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public void failLoginAttempt(){
        lastLoginFailedAttempt = LocalDateTime.now();
        timesLoggedInFailedAttempt++;
        if(timesLoggedInFailedAttempt >= 5){
            Alert e = new Alert(Alert.AlertType.ERROR);
            e.setContentText("You have attempted to login too many times. Please wait");
            e.showAndWait();
            timesLoggedInFailedAttempt = 0;
        }
    }

    
    
    
}
