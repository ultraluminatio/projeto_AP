package com.programandofodacci.aprendizado_linguagens;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML private Label texto;
    
    @FXML
    private void initialize(){
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("interfaces/menu");
    }
}
