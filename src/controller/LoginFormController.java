package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFormController {
    public PasswordField txtPassword;
    public Button btnConnect;
    public Button btnExit;
    public TextField txtUserName;
    public TextField txtPort;
    public TextField txtHost;
public void initialize(){

    Platform.runLater(() -> txtUserName.requestFocus());

}
    public void btnExit_OnAction(ActionEvent event) {
        Platform.exit();

    }

    public void btnConnect_OnAction(ActionEvent event) {
        if (txtHost.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Host can't be empty").show();
            txtHost.requestFocus();
            txtHost.selectAll();
            return;
        } else if (!txtPort.getText().matches("\\d+")) {
            new Alert(Alert.AlertType.ERROR, "Invalid port").show();
            txtPort.requestFocus();
            txtPort.selectAll();
            return;
        } else if (txtUserName.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Username can't be empty").show();
            txtUserName.requestFocus();
            txtUserName.selectAll();
            return;
        }
    }
}
