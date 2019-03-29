package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

import java.io.IOException;

import static junit.framework.Assert.assertTrue;
import static org.loadui.testfx.Assertions.verifyThat;
import static org.loadui.testfx.controls.Commons.hasText;


public class FXMLDialogSampleTest extends GuiTest {

    @Override
    protected Parent getRootNode() {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        } catch (IOException ex) {
            // TODO ...
        }
        return parent;
    }

    // https://jaxenter.de/testfx-junit-tests-fur-javafx-1800

    @Test
    public void buttonHatBeschriftungAnmelden() {
        final Button button = find("#anmeldungsButton");
        click(button);
        verifyThat("#anmeldungsButton", hasText("Anmelden"));
    }

    @Test
    public void actionTargetTextWirdGesetzt() {
        final Button button = find("#anmeldungsButton");
        click(button);
        final Text actionTargetText = find("#actionTarget");
        assertTrue(actionTargetText.getText().contains("Sign in Button was pressed"));
    }
}