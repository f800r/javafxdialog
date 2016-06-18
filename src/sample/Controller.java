package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Controller {

    @FXML
    private Text actionTarget;


    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        actionTarget.setText("Sign in Button was pressed " + LocalDateTime.now().toString());
    }
}
