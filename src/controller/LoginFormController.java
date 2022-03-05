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

            try {
            String command = String.format("mysql -h %s -u %s -p%s --port %s -e exit",
                    txtHost.getText(),
                    txtUserName.getText(),
                    txtPassword.getText(),
                    txtPort.getText());
            String[] commands = {"mysql",
                    "-h", txtHost.getText(),
                    "-u", txtUserName.getText(),
                    "--port", txtPort.getText(),
                    "-p" + txtPassword.getText(),
                    "-e", "exit"};
            Process mysql = Runtime.getRuntime().exec(commands);




                } else {

                }
            } catch () {

            }
        }
    }
}
