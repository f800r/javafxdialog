package sample;

import javafx.scene.text.Text;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ControllerTest {

    private Controller underTest;

    @BeforeMethod
    public void setUp() throws IOException {
        underTest = new Controller();
        underTest.setActionTarget(new Text());
    }

    @Test
    public void signInButtonTextIsCreated() throws IOException {
        underTest.handleSubmitButtonAction(null);
        String actionTargetText = underTest.getActionTarget().getText();
        Assert.assertTrue(actionTargetText.contains("Sign in Button was pressed"));
    }

}