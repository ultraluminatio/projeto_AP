/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.programandofodacci.aprendizado_linguagens.controllers;
import com.programandofodacci.aprendizado_linguagens.utils.CLADAP;
import com.programandofodacci.aprendizado_linguagens.utils.CLADJ;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
/**
 *
 * @author UltraLuminatio
 */
public class MenuController {
    private static CLADJ cladj;
    private static CLADAP cladap;

    @FXML private TextField tfNome;
    @FXML private TextField tfEmail;
    @FXML private TextField tfTelefone;
    
    
    @FXML
    private void initialize(){
        cladj = new CLADJ();
        cladap = new CLADAP();
    }
    
    @FXML
    private void criarPerfil(){
        
    }
    
    @FXML
    private void carregarPerfil(){
        
    }
}
