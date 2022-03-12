package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class LoginFormController {
    public PasswordField txtPassword;
    public Button btnConnect;
    public Button btnExit;
    public TextField txtUserName;
    public TextField txtPort;
    public TextField txtHost;

    public void initialize() {

        Platform.runLater(() -> txtUserName.requestFocus());

    }

    public void btnExit_OnAction(ActionEvent event) {
        Platform.exit();

    }

    public void btnConnect_OnAction(ActionEvent event) {
        if (txtHost.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, " host cant be empty").show();
            txtHost.requestFocus();
            txtHost.selectAll();
            return;
        } else if (!txtPort.getText().matches("\\d+")) {
            new Alert(Alert.AlertType.ERROR, "Invalid port").show();
            txtPort.requestFocus();
            txtPort.selectAll();
            return;
        } else if (txtUserName.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "username cant be empty").show();
            txtUserName.requestFocus();
            txtUserName.selectAll();
            return;
        }

    }
}
