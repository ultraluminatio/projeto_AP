package com.programandofodacci.aprendizado_linguagens;

import java.io.IOException;
import javafx.fxml.FXML;
import com.programandofodacci.aprendizado_linguagens.utils.CLADAP;
import java.io.File;
import java.io.FileNotFoundException;
import javafx.scene.control.Label;
public class PrimaryController {

    @FXML private Label texto;
    
    @FXML
    private void initialize(){
     
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
