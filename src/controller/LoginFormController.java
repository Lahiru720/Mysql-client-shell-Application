package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
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
    }
}
