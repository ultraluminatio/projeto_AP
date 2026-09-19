package com.programandofodacci.aprendizado_linguagens.Modelos;

import com.programandofodacci.aprendizado_linguagens.Modelos.atividade.Questao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ultra Luminatio 13
 */
public class Atividade implements Serializable{
    private static final long serialVersionUID = 1L; 
    
    private ArrayList<Questao> questoes = new ArrayList<>();
    
    private ArrayList<Questao> getQuestoes(){
        return this.questoes;
    }
    
    private Questao getQuestao(int local_questao){
        if(local_questao <= 0 || local_questao > questoes.size()-1) throw new IllegalArgumentException("Fora do alcance essa questao");
        return this.questoes.get(local_questao);
    }
}
