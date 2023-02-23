package modelClasses;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Contractor extends Employee{

    public Contractor() {
    }

    public Contractor(String department, String designtaion, String name, String username, String password, String number, String email, LocalDate dateOfBirth) {
        super(department, designtaion, name, username, password, number, email, dateOfBirth);
    }

    @FXML
    private Label ContractorID;

    @FXML
    private Label ContractorName;

    @FXML
    private Button ReportButton;

    @FXML
    private Button TaskButton;

    @FXML
    private Button clientButton;

    @FXML
    private Label contractorGroup;

    @FXML
    private ComboBox<?> equipmentComboBox;

    @FXML
    private ComboBox<?> expenseComboBox;

    @FXML
    private Button scheduleMeeting;

    @FXML
    void ReportBtnOnClick(ActionEvent event) {

    }

    @FXML
    void applyForLeaveButtonOnClick(ActionEvent event) {

    }

    @FXML
    void clientButtonOnClick(ActionEvent event) {

    }

    @FXML
    void equipmentComboBoxisUpdated(ActionEvent event) {

    }

    @FXML
    void expenseComboBoxisUpdated(ActionEvent event) {

    }

    @FXML
    void logOutButtonOnClick(ActionEvent event) {

    }

    @FXML
    void scheduleMeetingButtonOnClick(ActionEvent event) {

    }

    @FXML
    void taskBtnOnClick(ActionEvent event) {

    }

}
