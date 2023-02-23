package Shaila;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClientController {

    @FXML
    private TableColumn<?, ?> ClientID;

    @FXML
    private TableView<?> ClientInfoTableView;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> clientCompany;

    @FXML
    private TableColumn<?, ?> clientName;

    @FXML
    private TableColumn<?, ?> clientTariffRate;

    @FXML
    private TableColumn<?, ?> clientservise;

    @FXML
    void BackButtonOnClick(ActionEvent event) {

    }

}
