package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import static java.time.LocalDateTime.now;

public class Controller {

    @FXML
    private Text actionTarget;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        actionTarget.setText(erstelleActionText());
    }

    private String erstelleActionText() {
        return "Sign in Button was pressed " + erstelleZeitStempel();
    }

    private String erstelleZeitStempel() {
        return now().toString();
    }

    public Text getActionTarget() {
        return actionTarget;
    }

    public void setActionTarget(Text actionTarget) {
        this.actionTarget = actionTarget;
    }
}
